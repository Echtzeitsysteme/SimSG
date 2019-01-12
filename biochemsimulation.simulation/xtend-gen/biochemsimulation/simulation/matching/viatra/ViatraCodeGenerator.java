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
  
  private Map<LinkStateContext, String> supportPatterns;
  
  public ViatraCodeGenerator(final LinkedHashMap<EPackage, String> importAliases, final Map<String, GenericPattern> genericPatterns) {
    this.importAliases = importAliases;
    HashMap<LinkStateContext, String> _hashMap = new HashMap<LinkStateContext, String>();
    this.supportPatterns = _hashMap;
    HashMap<String, GenericPattern> _hashMap_1 = new HashMap<String, GenericPattern>();
    this.genericPatterns = _hashMap_1;
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
          Collection<Map.Entry<LinkStateContext, LinkStateContext>> _values_2 = genericPattern.getBody().getIndexedFreeLinkStateContexts().values();
          for(final Map.Entry<LinkStateContext, LinkStateContext> freePair : _values_2) {
            _builder.append("\t");
            String _generateIndexedUnboundLink = this.generateIndexedUnboundLink(genericPattern.getName(), freePair);
            _builder.append(_generateIndexedUnboundLink, "\t");
            _builder.newLineIfNotEmpty();
          }
        }
        {
          Collection<List<AgentNodeContext>> _values_3 = genericPattern.getBody().getLocalAgentNodes().values();
          for(final List<AgentNodeContext> agents : _values_3) {
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
    _builder.newLine();
    {
      Collection<String> _values_4 = this.supportPatterns.values();
      boolean _hasElements_2 = false;
      for(final String supportPattern : _values_4) {
        if (!_hasElements_2) {
          _hasElements_2 = true;
        } else {
          _builder.appendImmediate("\n", "");
        }
        _builder.append(supportPattern);
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder.toString();
  }
  
  public String generateLink(final List<LinkStateContext> links) {
    StringConcatenation _builder = new StringConcatenation();
    {
      for(final LinkStateContext link : links) {
        _builder.newLineIfNotEmpty();
        String _generateLink = this.generateLink(link);
        _builder.append(_generateLink);
        _builder.newLineIfNotEmpty();
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
        case IndexedUnbound:
          return "";
        case TypedUnbound:
          return this.generateTypedUnboundLink(link);
        default:
          break;
      }
    }
    return null;
  }
  
  public String generateTypedUnboundLink(final LinkStateContext link) {
    final String patternName = link.getSiteNodeContext().getAgentNodeContext().getPatternName();
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("supportPattern_");
    _builder.append(patternName);
    _builder.append("_");
    String _agentReferenceName = link.getAgentReferenceName();
    _builder.append(_agentReferenceName);
    final String supPatternName1 = _builder.toString();
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("pattern ");
    _builder_1.append(supPatternName1);
    _builder_1.append("(");
    String _sourceAgentVariableName = link.getSourceAgentVariableName();
    _builder_1.append(_sourceAgentVariableName);
    _builder_1.append(" : ");
    String _sourceAgentTypeName = link.getSourceAgentTypeName();
    _builder_1.append(_sourceAgentTypeName);
    _builder_1.append("){");
    _builder_1.newLineIfNotEmpty();
    _builder_1.append("\t");
    String _sourceAgentTypeName_1 = link.getSourceAgentTypeName();
    _builder_1.append(_sourceAgentTypeName_1, "\t");
    _builder_1.append(".");
    String _agentReferenceName_1 = link.getAgentReferenceName();
    _builder_1.append(_agentReferenceName_1, "\t");
    _builder_1.append("(");
    String _sourceAgentVariableName_1 = link.getSourceAgentVariableName();
    _builder_1.append(_sourceAgentVariableName_1, "\t");
    _builder_1.append(", _);");
    _builder_1.newLineIfNotEmpty();
    _builder_1.append("\t");
    String _sourceAgentTypeName_2 = link.getSourceAgentTypeName();
    _builder_1.append(_sourceAgentTypeName_2, "\t");
    _builder_1.append(".");
    String _agentReferenceName_2 = link.getAgentReferenceName();
    _builder_1.append(_agentReferenceName_2, "\t");
    _builder_1.append("(");
    String _sourceAgentVariableName_2 = link.getSourceAgentVariableName();
    _builder_1.append(_sourceAgentVariableName_2, "\t");
    _builder_1.append(", agent);");
    _builder_1.newLineIfNotEmpty();
    _builder_1.append("\t");
    String _targetAgentTypeName = link.getTargetAgentTypeName();
    _builder_1.append(_targetAgentTypeName, "\t");
    _builder_1.append("(agent);");
    _builder_1.newLineIfNotEmpty();
    _builder_1.append("}");
    final String supPattern1 = _builder_1.toString();
    this.supportPatterns.put(link, supPattern1);
    StringConcatenation _builder_2 = new StringConcatenation();
    _builder_2.append("neg find ");
    _builder_2.append(supPatternName1);
    _builder_2.append("(");
    String _sourceAgentVariableName_3 = link.getSourceAgentVariableName();
    _builder_2.append(_sourceAgentVariableName_3);
    _builder_2.append(");");
    _builder_2.newLineIfNotEmpty();
    return _builder_2.toString();
  }
  
  /**
   * def String generateIndexedUnboundLink(String patternName, Entry<LinkStateContext, LinkStateContext> link){
   * val supPatternName1 = '''supportPattern_«patternName»_«link.key.agentReferenceName»'''
   * val supPattern1 = '''pattern «supPatternName1»(«link.key.sourceAgentVariableName» : «link.key.sourceAgentTypeName»){
   * «link.key.sourceAgentTypeName».«link.key.agentReferenceName»(«link.key.sourceAgentVariableName», _);
   * «link.key.sourceAgentTypeName».«link.key.agentReferenceName»(«link.key.sourceAgentVariableName», agent);
   * «link.key.targetAgentTypeName»(agent);
   * }'''
   * val supPatternName2 = '''supportPattern_«patternName»_«link.value.agentReferenceName»'''
   * val supPattern2 = '''pattern «supPatternName2»(«link.value.sourceAgentVariableName» : «link.value.sourceAgentTypeName»){
   * «link.value.sourceAgentTypeName».«link.value.agentReferenceName»(«link.value.sourceAgentVariableName», _);
   * «link.value.sourceAgentTypeName».«link.value.agentReferenceName»(«link.value.sourceAgentVariableName», agent);
   * «link.value.targetAgentTypeName»(agent);
   * }'''
   * supportPatterns.put(link.key, supPattern1);
   * supportPatterns.put(link.value, supPattern2);
   * 
   * 
   * return '''neg find «supPatternName1»(«link.key.sourceAgentVariableName»);
   * neg find «supPatternName2»(«link.value.sourceAgentVariableName»);
   * '''
   * }
   */
  public String generateIndexedUnboundLink(final String patternName, final Map.Entry<LinkStateContext, LinkStateContext> link) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("neg ");
    String _sourceAgentTypeName = link.getKey().getSourceAgentTypeName();
    _builder.append(_sourceAgentTypeName);
    _builder.append(".");
    String _agentReferenceName = link.getKey().getAgentReferenceName();
    _builder.append(_agentReferenceName);
    _builder.append("(");
    String _sourceAgentVariableName = link.getKey().getSourceAgentVariableName();
    _builder.append(_sourceAgentVariableName);
    _builder.append(", ");
    String _targetAgentVariableName = link.getKey().getTargetAgentVariableName();
    _builder.append(_targetAgentVariableName);
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    _builder.append("neg ");
    String _sourceAgentTypeName_1 = link.getValue().getSourceAgentTypeName();
    _builder.append(_sourceAgentTypeName_1);
    _builder.append(".");
    String _agentReferenceName_1 = link.getValue().getAgentReferenceName();
    _builder.append(_agentReferenceName_1);
    _builder.append("(");
    String _sourceAgentVariableName_1 = link.getValue().getSourceAgentVariableName();
    _builder.append(_sourceAgentVariableName_1);
    _builder.append(", ");
    String _targetAgentVariableName_1 = link.getValue().getTargetAgentVariableName();
    _builder.append(_targetAgentVariableName_1);
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    return _builder.toString();
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
