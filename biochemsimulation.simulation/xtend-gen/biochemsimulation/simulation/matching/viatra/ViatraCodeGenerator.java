package biochemsimulation.simulation.matching.viatra;

import biochemsimulation.reactionrules.reactionRules.Pattern;
import biochemsimulation.reactionrules.reactionRules.ReactionRuleModel;
import biochemsimulation.reactionrules.utils.PatternUtils;
import biochemsimulation.simulation.matching.patterns.AgentNodeConstraint;
import biochemsimulation.simulation.matching.patterns.AgentNodeContext;
import biochemsimulation.simulation.matching.patterns.GenericPattern;
import biochemsimulation.simulation.matching.patterns.LinkStateConstraint;
import biochemsimulation.simulation.matching.patterns.LinkStateContext;
import biochemsimulation.simulation.matching.patterns.LinkStateType;
import biochemsimulation.simulation.matching.patterns.SiteNodeContext;
import biochemsimulation.simulation.matching.patterns.SiteStateContext;
import com.google.common.base.Objects;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class ViatraCodeGenerator {
  public final static String BOUND_ANY_LINK_PATTERN_KEY = "BoundAnyLink_SupportPattern";
  
  private LinkedHashMap<EPackage, String> importAliases;
  
  private Map<String, Pattern> rulePatterns;
  
  private Map<String, GenericPattern> genericPatterns;
  
  private Map<String, String> supportPatterns;
  
  public ViatraCodeGenerator(final LinkedHashMap<EPackage, String> importAliases, final ReactionRuleModel model) {
    this.importAliases = importAliases;
    HashMap<String, String> _hashMap = new HashMap<String, String>();
    this.supportPatterns = _hashMap;
    this.rulePatterns = PatternUtils.getRulePatterns(model);
    this.createAnyLinkSupportPattern();
    this.generateGenericPatterns();
  }
  
  public ViatraCodeGenerator(final LinkedHashMap<EPackage, String> importAliases, final Map<String, GenericPattern> genericPatterns) {
    this.importAliases = importAliases;
    HashMap<String, String> _hashMap = new HashMap<String, String>();
    this.supportPatterns = _hashMap;
    this.createAnyLinkSupportPattern();
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
  
  public String createAnyLinkSupportPattern() {
    String _xblockexpression = null;
    {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("pattern ");
      _builder.append(ViatraCodeGenerator.BOUND_ANY_LINK_PATTERN_KEY);
      _builder.append("(simSite : ");
      String _name = SiteNodeContext.SIM_SITE_TYPE.getName();
      _builder.append(_name);
      _builder.append(") {");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t\t");
      String _name_1 = SiteNodeContext.SIM_SITE_TYPE.getName();
      _builder.append(_name_1, "\t\t\t");
      _builder.append(".");
      String _name_2 = LinkStateContext.SIM_LINK_STATE_CONTAINER_ATTRIBUTE.getName();
      _builder.append(_name_2, "\t\t\t");
      _builder.append("(simSite, _);");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t");
      _builder.append("}");
      _builder.newLine();
      final String pattern = _builder.toString();
      _xblockexpression = this.supportPatterns.put(ViatraCodeGenerator.BOUND_ANY_LINK_PATTERN_KEY, pattern);
    }
    return _xblockexpression;
  }
  
  public void generateGenericPatterns() {
    HashMap<String, GenericPattern> _hashMap = new HashMap<String, GenericPattern>();
    this.genericPatterns = _hashMap;
    final BiConsumer<String, Pattern> _function = (String name, Pattern pattern) -> {
      final GenericPattern gPattern = new GenericPattern(name, pattern);
      boolean _isVoidPattern = gPattern.isVoidPattern();
      boolean _not = (!_isVoidPattern);
      if (_not) {
        GenericPattern _genericPattern = new GenericPattern(name, pattern);
        this.genericPatterns.put(name, _genericPattern);
      }
    };
    this.rulePatterns.forEach(_function);
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
      Collection<String> _values = this.supportPatterns.values();
      boolean _hasElements = false;
      for(final String supportPattern : _values) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate("\n", "");
        }
        _builder.append(supportPattern);
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    {
      Collection<GenericPattern> _values_1 = this.genericPatterns.values();
      boolean _hasElements_1 = false;
      for(final GenericPattern genericPattern : _values_1) {
        if (!_hasElements_1) {
          _hasElements_1 = true;
        } else {
          _builder.appendImmediate("\n", "");
        }
        _builder.append("pattern ");
        String _name = genericPattern.getName();
        _builder.append(_name);
        _builder.append("(");
        {
          Set<String> _keySet_1 = genericPattern.getSignature().getSignature().keySet();
          boolean _hasElements_2 = false;
          for(final String node : _keySet_1) {
            if (!_hasElements_2) {
              _hasElements_2 = true;
            } else {
              _builder.appendImmediate(", ", "");
            }
            _builder.append(" ");
            _builder.append(node);
            _builder.append(" : ");
            String _name_1 = AgentNodeContext.SIM_AGENT_TYPE.getName();
            _builder.append(_name_1);
          }
        }
        _builder.append(") {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        {
          Collection<AgentNodeContext> _values_2 = genericPattern.getBody().getAgentNodeContexts().values();
          boolean _hasElements_3 = false;
          for(final AgentNodeContext agentNode : _values_2) {
            if (!_hasElements_3) {
              _hasElements_3 = true;
            } else {
              _builder.appendImmediate("\n", "\t");
            }
            String _name_2 = AgentNodeContext.SIM_AGENT_TYPE.getName();
            _builder.append(_name_2, "\t");
            _builder.append(".");
            String _name_3 = AgentNodeContext.TYPE_ATTRIBUTE.getName();
            _builder.append(_name_3, "\t");
            _builder.append("(");
            String _agentVariableName = agentNode.getAgentVariableName();
            _builder.append(_agentVariableName, "\t");
            _builder.append(", \"");
            String _agentType = agentNode.getAgentType();
            _builder.append(_agentType, "\t");
            _builder.append("\");");
            {
              List<SiteNodeContext> _get_1 = genericPattern.getBody().getSiteNodeContexts().get(agentNode);
              boolean _notEquals = (!Objects.equal(_get_1, null));
              if (_notEquals) {
                _builder.newLineIfNotEmpty();
                _builder.append("\t");
                {
                  List<SiteNodeContext> _get_2 = genericPattern.getBody().getSiteNodeContexts().get(agentNode);
                  boolean _hasElements_4 = false;
                  for(final SiteNodeContext siteNode : _get_2) {
                    if (!_hasElements_4) {
                      _hasElements_4 = true;
                    } else {
                      _builder.appendImmediate("\n", "\t");
                    }
                    String _name_4 = AgentNodeContext.SIM_AGENT_TYPE.getName();
                    _builder.append(_name_4, "\t");
                    _builder.append(".");
                    String _name_5 = SiteNodeContext.SIM_SITE_CONTAINER_ATTRIBUTE.getName();
                    _builder.append(_name_5, "\t");
                    _builder.append("(");
                    String _agentVariableName_1 = agentNode.getAgentVariableName();
                    _builder.append(_agentVariableName_1, "\t");
                    _builder.append(", ");
                    String _localSimSiteVariableName = siteNode.getLocalSimSiteVariableName();
                    _builder.append(_localSimSiteVariableName, "\t");
                    _builder.append(");");
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t");
                    String _name_6 = SiteNodeContext.SIM_SITE_TYPE.getName();
                    _builder.append(_name_6, "\t");
                    _builder.append(".");
                    String _name_7 = SiteNodeContext.TYPE_ATTRIBUTE.getName();
                    _builder.append(_name_7, "\t");
                    _builder.append("(");
                    String _localSimSiteVariableName_1 = siteNode.getLocalSimSiteVariableName();
                    _builder.append(_localSimSiteVariableName_1, "\t");
                    _builder.append(", \"");
                    String _siteType = siteNode.getSiteType();
                    _builder.append(_siteType, "\t");
                    _builder.append("\");");
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t");
                    String _siteStateConstraint = this.siteStateConstraint(genericPattern, siteNode);
                    _builder.append(_siteStateConstraint, "\t");
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t");
                    String _trivialLinkStateConstraints = this.trivialLinkStateConstraints(genericPattern, siteNode);
                    _builder.append(_trivialLinkStateConstraints, "\t");
                    _builder.newLineIfNotEmpty();
                  }
                }
              }
            }
          }
        }
        {
          Collection<LinkStateConstraint> _values_3 = genericPattern.getBody().getLinkStateConstraints().values();
          boolean _hasElements_5 = false;
          for(final LinkStateConstraint constraint : _values_3) {
            if (!_hasElements_5) {
              _hasElements_5 = true;
            } else {
              _builder.appendImmediate("\n", "\t");
            }
            _builder.append("\t");
            String _complexLinkStateConstraint = this.complexLinkStateConstraint(constraint);
            _builder.append(_complexLinkStateConstraint, "\t");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("\t");
        {
          Collection<AgentNodeConstraint> _injectivityConstraints = genericPattern.getBody().getInjectivityConstraints();
          boolean _hasElements_6 = false;
          for(final AgentNodeConstraint constraint_1 : _injectivityConstraints) {
            if (!_hasElements_6) {
              _hasElements_6 = true;
            } else {
              _builder.appendImmediate("\n", "\t");
            }
            String _agentVariableName_2 = constraint_1.getOperand1().getAgentVariableName();
            _builder.append(_agentVariableName_2, "\t");
            _builder.append("!=");
            String _agentVariableName_3 = constraint_1.getOperand2().getAgentVariableName();
            _builder.append(_agentVariableName_3, "\t");
            _builder.append(";");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("}");
        _builder.newLine();
      }
    }
    return _builder.toString();
  }
  
  public String siteStateConstraint(final GenericPattern genericPattern, final SiteNodeContext siteNode) {
    boolean _containsKey = genericPattern.getBody().getSiteStateContexts().containsKey(siteNode);
    if (_containsKey) {
      StringConcatenation _builder = new StringConcatenation();
      String _name = SiteNodeContext.SIM_SITE_TYPE.getName();
      _builder.append(_name);
      _builder.append(".");
      String _name_1 = SiteStateContext.SIM_SITE_STATE_CONTAINER_ATTRIBUTE.getName();
      _builder.append(_name_1);
      _builder.append(".");
      String _name_2 = SiteStateContext.TYPE_ATTRIBUTE.getName();
      _builder.append(_name_2);
      _builder.append("(");
      String _localSimSiteVariableName = siteNode.getLocalSimSiteVariableName();
      _builder.append(_localSimSiteVariableName);
      _builder.append(", \"");
      String _stateType = genericPattern.getBody().getSiteStateContexts().get(siteNode).getStateType();
      _builder.append(_stateType);
      _builder.append("\");");
      _builder.newLineIfNotEmpty();
      return _builder.toString();
    }
    return "";
  }
  
  public String trivialLinkStateConstraints(final GenericPattern genericPattern, final SiteNodeContext siteNode) {
    boolean _containsKey = genericPattern.getBody().getLinkStateContexts().containsKey(siteNode);
    if (_containsKey) {
      final LinkStateContext link = genericPattern.getBody().getLinkStateContexts().get(siteNode);
      LinkStateType _stateType = link.getStateType();
      boolean _equals = Objects.equal(_stateType, LinkStateType.Unbound);
      if (_equals) {
        return this.unboundConstraint(siteNode);
      } else {
        LinkStateType _stateType_1 = link.getStateType();
        boolean _equals_1 = Objects.equal(_stateType_1, LinkStateType.BoundAny);
        if (_equals_1) {
          return this.boundAnyConstraint(siteNode);
        } else {
          return "";
        }
      }
    }
    return "";
  }
  
  public String complexLinkStateConstraint(final LinkStateConstraint constraint) {
    LinkStateType _stateType = constraint.getOperand1().getStateType();
    boolean _equals = Objects.equal(_stateType, LinkStateType.Bound);
    if (_equals) {
      return this.boundConstraint(constraint);
    } else {
      LinkStateType _stateType_1 = constraint.getOperand1().getStateType();
      boolean _equals_1 = Objects.equal(_stateType_1, LinkStateType.BoundAnyOfType);
      if (_equals_1) {
        return this.boundToTypeConstraint(constraint);
      } else {
        return "";
      }
    }
  }
  
  public String boundConstraint(final LinkStateConstraint constraint) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = SiteNodeContext.SIM_SITE_TYPE.getName();
    _builder.append(_name);
    _builder.append(".");
    String _name_1 = LinkStateContext.SIM_LINK_STATE_CONTAINER_ATTRIBUTE.getName();
    _builder.append(_name_1);
    _builder.append("(");
    String _localSimSiteVariableName = constraint.getOperand1().getSiteNodeContext().getLocalSimSiteVariableName();
    _builder.append(_localSimSiteVariableName);
    _builder.append(", ");
    String _localSimLinkStateVariableName = constraint.getOperand1().getLocalSimLinkStateVariableName();
    _builder.append(_localSimLinkStateVariableName);
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    String _name_2 = SiteNodeContext.SIM_SITE_TYPE.getName();
    _builder.append(_name_2, "\t\t");
    _builder.append(".");
    String _name_3 = LinkStateContext.SIM_LINK_STATE_CONTAINER_ATTRIBUTE.getName();
    _builder.append(_name_3, "\t\t");
    _builder.append("(");
    String _localSimSiteVariableName_1 = constraint.getOperand2().getSiteNodeContext().getLocalSimSiteVariableName();
    _builder.append(_localSimSiteVariableName_1, "\t\t");
    _builder.append(", ");
    String _localSimLinkStateVariableName_1 = constraint.getOperand2().getLocalSimLinkStateVariableName();
    _builder.append(_localSimLinkStateVariableName_1, "\t\t");
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    String _localSimLinkStateVariableName_2 = constraint.getOperand1().getLocalSimLinkStateVariableName();
    _builder.append(_localSimLinkStateVariableName_2, "\t\t");
    _builder.append("==");
    String _localSimLinkStateVariableName_3 = constraint.getOperand2().getLocalSimLinkStateVariableName();
    _builder.append(_localSimLinkStateVariableName_3, "\t\t");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
  
  public String boundToTypeConstraint(final LinkStateConstraint constraint) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = SiteNodeContext.SIM_SITE_TYPE.getName();
    _builder.append(_name);
    _builder.append(".");
    String _name_1 = LinkStateContext.SIM_LINK_STATE_CONTAINER_ATTRIBUTE.getName();
    _builder.append(_name_1);
    _builder.append("(");
    String _localSimSiteVariableName = constraint.getOperand1().getSiteNodeContext().getLocalSimSiteVariableName();
    _builder.append(_localSimSiteVariableName);
    _builder.append(", ");
    String _localSimLinkStateVariableName = constraint.getOperand1().getLocalSimLinkStateVariableName();
    _builder.append(_localSimLinkStateVariableName);
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    String _name_2 = AgentNodeContext.SIM_AGENT_TYPE.getName();
    _builder.append(_name_2, "\t\t");
    _builder.append(".");
    String _name_3 = AgentNodeContext.TYPE_ATTRIBUTE.getName();
    _builder.append(_name_3, "\t\t");
    _builder.append("(");
    String _agentVariableName = constraint.getOperand2().getSiteNodeContext().getAgentNodeContext().getAgentVariableName();
    _builder.append(_agentVariableName, "\t\t");
    _builder.append(", \"");
    String _agentType = constraint.getOperand2().getSiteNodeContext().getAgentNodeContext().getAgentType();
    _builder.append(_agentType, "\t\t");
    _builder.append("\");");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    String _name_4 = AgentNodeContext.SIM_AGENT_TYPE.getName();
    _builder.append(_name_4, "\t\t");
    _builder.append(".");
    String _name_5 = SiteNodeContext.SIM_SITE_CONTAINER_ATTRIBUTE.getName();
    _builder.append(_name_5, "\t\t");
    _builder.append("(");
    String _agentVariableName_1 = constraint.getOperand2().getSiteNodeContext().getAgentNodeContext().getAgentVariableName();
    _builder.append(_agentVariableName_1, "\t\t");
    _builder.append(", ");
    String _localSimSiteVariableName_1 = constraint.getOperand2().getSiteNodeContext().getLocalSimSiteVariableName();
    _builder.append(_localSimSiteVariableName_1, "\t\t");
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    String _name_6 = SiteNodeContext.SIM_SITE_TYPE.getName();
    _builder.append(_name_6, "\t\t");
    _builder.append(".");
    String _name_7 = SiteNodeContext.TYPE_ATTRIBUTE.getName();
    _builder.append(_name_7, "\t\t");
    _builder.append("(");
    String _localSimSiteVariableName_2 = constraint.getOperand2().getSiteNodeContext().getLocalSimSiteVariableName();
    _builder.append(_localSimSiteVariableName_2, "\t\t");
    _builder.append(", \"");
    String _siteType = constraint.getOperand2().getSiteNodeContext().getSiteType();
    _builder.append(_siteType, "\t\t");
    _builder.append("\");");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    String _name_8 = SiteNodeContext.SIM_SITE_TYPE.getName();
    _builder.append(_name_8, "\t\t");
    _builder.append(".");
    String _name_9 = LinkStateContext.SIM_LINK_STATE_CONTAINER_ATTRIBUTE.getName();
    _builder.append(_name_9, "\t\t");
    _builder.append("(");
    String _localSimSiteVariableName_3 = constraint.getOperand2().getSiteNodeContext().getLocalSimSiteVariableName();
    _builder.append(_localSimSiteVariableName_3, "\t\t");
    _builder.append(", ");
    String _localSimLinkStateVariableName_1 = constraint.getOperand2().getLocalSimLinkStateVariableName();
    _builder.append(_localSimLinkStateVariableName_1, "\t\t");
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    String _localSimLinkStateVariableName_2 = constraint.getOperand1().getLocalSimLinkStateVariableName();
    _builder.append(_localSimLinkStateVariableName_2, "\t\t");
    _builder.append("==");
    String _localSimLinkStateVariableName_3 = constraint.getOperand2().getLocalSimLinkStateVariableName();
    _builder.append(_localSimLinkStateVariableName_3, "\t\t");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
  
  public String unboundConstraint(final SiteNodeContext siteNode) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("neg find ");
    _builder.append(ViatraCodeGenerator.BOUND_ANY_LINK_PATTERN_KEY);
    _builder.append("(");
    String _localSimSiteVariableName = siteNode.getLocalSimSiteVariableName();
    _builder.append(_localSimSiteVariableName);
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
  
  public String boundAnyConstraint(final SiteNodeContext siteNode) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("find ");
    _builder.append(ViatraCodeGenerator.BOUND_ANY_LINK_PATTERN_KEY);
    _builder.append("(");
    String _localSimSiteVariableName = siteNode.getLocalSimSiteVariableName();
    _builder.append(_localSimSiteVariableName);
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
}
