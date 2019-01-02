package biochemsimulation.simulation.matching.viatra;

import biochemsimulation.simulation.matching.patterns.AgentNodeContext;
import biochemsimulation.simulation.matching.patterns.GenericPattern;
import biochemsimulation.simulation.matching.patterns.LinkStateContext;
import biochemsimulation.simulation.matching.patterns.LinkStateType;
import biochemsimulation.simulation.matching.patterns.SiteNodeContext;
import biochemsimulation.simulation.matching.patterns.SiteStateContext;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class ViatraCodeGenerator {
  private LinkedHashMap<EPackage, String> importAliases;
  
  private Map<String, GenericPattern> genericPatterns;
  
  public ViatraCodeGenerator(final LinkedHashMap<EPackage, String> importAliases, final Map<String, GenericPattern> genericPatterns) {
    this.importAliases = importAliases;
    HashMap<String, GenericPattern> _hashMap = new HashMap<String, GenericPattern>();
    this.genericPatterns = _hashMap;
    final BiConsumer<String, GenericPattern> _function = (String name, GenericPattern pattern) -> {
      boolean _isVoidPattern = pattern.isVoidPattern();
      boolean _not = (!_isVoidPattern);
      if (_not) {
        this.genericPatterns.put(name, pattern);
      }
    };
    genericPatterns.forEach(_function);
  }
  
  public String generatePatternCode() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package biochemsimulation.viatrapatterns.generator");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    {
      Set<EPackage> _keySet = this.importAliases.keySet();
      for(final EPackage p : _keySet) {
        _builder.append("import \"");
        String _nsURI = p.getNsURI();
        _builder.append(_nsURI);
        _builder.append("\" as ");
        String _get = this.importAliases.get(p);
        _builder.append(_get);
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    {
      Collection<GenericPattern> _values = this.genericPatterns.values();
      boolean _hasElements = false;
      for(final GenericPattern genericPattern : _values) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate("\n", "");
        }
        _builder.append("pattern ");
        String _name = genericPattern.getName();
        _builder.append(_name);
        _builder.append("(");
        {
          Set<Map.Entry<String, EClassifier>> _entrySet = genericPattern.getSignature().getSignature().entrySet();
          boolean _hasElements_1 = false;
          for(final Map.Entry<String, EClassifier> node : _entrySet) {
            if (!_hasElements_1) {
              _hasElements_1 = true;
            } else {
              _builder.appendImmediate(", ", "");
            }
            _builder.append(" ");
            String _key = node.getKey();
            _builder.append(_key);
            _builder.append(" : ");
            String _name_1 = node.getValue().getName();
            _builder.append(_name_1);
          }
        }
        _builder.append(") {");
        _builder.newLineIfNotEmpty();
        {
          Collection<AgentNodeContext> _values_1 = genericPattern.getBody().getAgentNodeContexts().values();
          for(final AgentNodeContext agent : _values_1) {
            {
              List<SiteNodeContext> _get_1 = genericPattern.getBody().getSiteNodeContexts().get(agent);
              for(final SiteNodeContext site : _get_1) {
                _builder.append("\t");
                String _generateLink = this.generateLink(genericPattern.getBody().getLinkStateContexts().get(site));
                _builder.append(_generateLink, "\t");
                _builder.newLineIfNotEmpty();
                _builder.append("\t");
                String _generateState = this.generateState(genericPattern.getBody().getSiteStateContexts().get(site));
                _builder.append(_generateState, "\t");
                _builder.newLineIfNotEmpty();
              }
            }
          }
        }
        _builder.append("}\t");
        _builder.newLine();
      }
    }
    return _builder.toString();
  }
  
  public String generateLink(final LinkStateContext link) {
    if ((link == null)) {
      return "";
    }
    LinkStateType _stateType = link.getStateType();
    if (_stateType != null) {
      switch (_stateType) {
        case Bound:
          return this.generateBoundLink(link);
        case BoundAny:
          return this.generateBoundAny(link);
        case BoundAnyOfType:
          return this.generateBoundAnfOfType(link);
        case Unbound:
          return this.generateUnbound(link);
        case WhatEver:
          return "";
        default:
          break;
      }
    }
    return null;
  }
  
  public String generateBoundLink(final LinkStateContext link) {
    StringConcatenation _builder = new StringConcatenation();
    String _sourceAgentTypeName = link.getSourceAgentTypeName();
    _builder.append(_sourceAgentTypeName);
    _builder.append(".");
    String _agentReferenceName = link.getAgentReferenceName();
    _builder.append(_agentReferenceName);
    _builder.append("(");
    String _sourceAgentVariableName = link.getSourceAgentVariableName();
    _builder.append(_sourceAgentVariableName);
    _builder.append(", ");
    String _targetAgentVariableName = link.getTargetAgentVariableName();
    _builder.append(_targetAgentVariableName);
    _builder.append(");");
    return _builder.toString();
  }
  
  public String generateBoundAny(final LinkStateContext link) {
    StringConcatenation _builder = new StringConcatenation();
    String _sourceAgentTypeName = link.getSourceAgentTypeName();
    _builder.append(_sourceAgentTypeName);
    _builder.append(".");
    String _agentReferenceName = link.getAgentReferenceName();
    _builder.append(_agentReferenceName);
    _builder.append("(");
    String _sourceAgentVariableName = link.getSourceAgentVariableName();
    _builder.append(_sourceAgentVariableName);
    _builder.append(", _);");
    return _builder.toString();
  }
  
  public String generateBoundAnfOfType(final LinkStateContext link) {
    String prefix = "";
    boolean _isSourceAgentLocal = link.isSourceAgentLocal();
    if (_isSourceAgentLocal) {
      StringConcatenation _builder = new StringConcatenation();
      String _targetAgentTypeName = link.getTargetAgentTypeName();
      _builder.append(_targetAgentTypeName);
      _builder.append("(");
      String _targetAgentVariableName = link.getTargetAgentVariableName();
      _builder.append(_targetAgentVariableName);
      _builder.append(");");
      _builder.newLineIfNotEmpty();
      prefix = _builder.toString();
    }
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append(prefix);
    String _sourceAgentTypeName = link.getSourceAgentTypeName();
    _builder_1.append(_sourceAgentTypeName);
    _builder_1.append(".");
    String _agentReferenceName = link.getAgentReferenceName();
    _builder_1.append(_agentReferenceName);
    _builder_1.append("(");
    String _sourceAgentVariableName = link.getSourceAgentVariableName();
    _builder_1.append(_sourceAgentVariableName);
    _builder_1.append(", ");
    String _targetAgentVariableName_1 = link.getTargetAgentVariableName();
    _builder_1.append(_targetAgentVariableName_1);
    _builder_1.append(");");
    return _builder_1.toString();
  }
  
  public String generateUnbound(final LinkStateContext link) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("neg ");
    String _sourceAgentTypeName = link.getSourceAgentTypeName();
    _builder.append(_sourceAgentTypeName);
    _builder.append(".");
    String _agentReferenceName = link.getAgentReferenceName();
    _builder.append(_agentReferenceName);
    _builder.append("(");
    String _sourceAgentVariableName = link.getSourceAgentVariableName();
    _builder.append(_sourceAgentVariableName);
    _builder.append(", _);");
    return _builder.toString();
  }
  
  public String generateState(final SiteStateContext state) {
    if ((state == null)) {
      return "";
    }
    StringConcatenation _builder = new StringConcatenation();
    String _sourceAgentTypeName = state.getSourceAgentTypeName();
    _builder.append(_sourceAgentTypeName);
    _builder.append(".");
    String _stateReferenceName = state.getStateReferenceName();
    _builder.append(_stateReferenceName);
    _builder.append("(");
    String _sourceAgentVariableName = state.getSourceAgentVariableName();
    _builder.append(_sourceAgentVariableName);
    _builder.append(", _);");
    return _builder.toString();
  }
}
