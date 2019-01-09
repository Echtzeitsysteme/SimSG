package biochemsimulation.simulation.matching.viatra;

import biochemsimulation.simulation.matching.patterns.AgentNodeConstraint;
import biochemsimulation.simulation.matching.patterns.AgentNodeContext;
import biochemsimulation.simulation.matching.patterns.ConstraintType;
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
        {
          Collection<List<AgentNodeContext>> _values_2 = genericPattern.getBody().getLocalAgentNodes().values();
          for(final List<AgentNodeContext> agents : _values_2) {
            {
              for(final AgentNodeContext agent_1 : agents) {
                _builder.append("\t");
                String _generateLink_1 = this.generateLink(genericPattern.getBody().getLocalLinkStates().get(genericPattern.getBody().getLocalSiteNodes().get(agent_1)));
                _builder.append(_generateLink_1, "\t");
                _builder.newLineIfNotEmpty();
              }
            }
          }
        }
        {
          Collection<AgentNodeConstraint> _injectivityConstraints = genericPattern.getBody().getInjectivityConstraints();
          for(final AgentNodeConstraint constraint : _injectivityConstraints) {
            _builder.append("\t");
            String _generateConstraint = this.generateConstraint(constraint);
            _builder.append(_generateConstraint, "\t");
            _builder.newLineIfNotEmpty();
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
          return this.generateBoundAnyOfType(link);
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
  
  public String generateBoundAnyOfType(final LinkStateContext link) {
    String prefix = "";
    boolean _isSourceAgentLocal = link.isSourceAgentLocal();
    boolean _not = (!_isSourceAgentLocal);
    if (_not) {
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
  
  public String generateConstraint(final AgentNodeConstraint constraint) {
    if ((constraint == null)) {
      return "";
    }
    ConstraintType _type = constraint.getType();
    if (_type != null) {
      switch (_type) {
        case injectivity:
          StringConcatenation _builder = new StringConcatenation();
          String _agentVariableName = constraint.getOperand1().getAgentVariableName();
          _builder.append(_agentVariableName);
          _builder.append(" != ");
          String _agentVariableName_1 = constraint.getOperand2().getAgentVariableName();
          _builder.append(_agentVariableName_1);
          _builder.append(";");
          return _builder.toString();
        case order:
          StringConcatenation _builder_1 = new StringConcatenation();
          _builder_1.append("Agent.ID(");
          String _agentVariableName_2 = constraint.getOperand1().getAgentVariableName();
          _builder_1.append(_agentVariableName_2);
          _builder_1.append(",");
          String _agentVariableName_3 = constraint.getOperand1().getAgentVariableName();
          _builder_1.append(_agentVariableName_3);
          _builder_1.append("_id);");
          _builder_1.newLineIfNotEmpty();
          _builder_1.append("Agent.ID(");
          String _agentVariableName_4 = constraint.getOperand2().getAgentVariableName();
          _builder_1.append(_agentVariableName_4);
          _builder_1.append(",");
          String _agentVariableName_5 = constraint.getOperand2().getAgentVariableName();
          _builder_1.append(_agentVariableName_5);
          _builder_1.append("_id);");
          _builder_1.newLineIfNotEmpty();
          _builder_1.append("check(");
          String _agentVariableName_6 = constraint.getOperand1().getAgentVariableName();
          _builder_1.append(_agentVariableName_6);
          _builder_1.append("_id > ");
          String _agentVariableName_7 = constraint.getOperand2().getAgentVariableName();
          _builder_1.append(_agentVariableName_7);
          _builder_1.append("_id);");
          return _builder_1.toString();
        default:
          break;
      }
    }
    return null;
  }
}
