package biochemsimulation.viatrapatterns.generator;

import biochemsimulation.reactionrules.reactionRules.AgentPattern;
import biochemsimulation.reactionrules.reactionRules.AssignFromPattern;
import biochemsimulation.reactionrules.reactionRules.AssignFromVariable;
import biochemsimulation.reactionrules.reactionRules.BoundAnyLink;
import biochemsimulation.reactionrules.reactionRules.BoundAnyOfTypeLink;
import biochemsimulation.reactionrules.reactionRules.BoundLink;
import biochemsimulation.reactionrules.reactionRules.FreeLink;
import biochemsimulation.reactionrules.reactionRules.LinkState;
import biochemsimulation.reactionrules.reactionRules.Pattern;
import biochemsimulation.reactionrules.reactionRules.PatternAssignment;
import biochemsimulation.reactionrules.reactionRules.Rule;
import biochemsimulation.reactionrules.reactionRules.RuleBody;
import biochemsimulation.reactionrules.reactionRules.SitePattern;
import biochemsimulation.reactionrules.reactionRules.SitePatterns;
import biochemsimulation.reactionrules.reactionRules.SiteState;
import biochemsimulation.reactionrules.reactionRules.ValidAgentPattern;
import biochemsimulation.reactionrules.reactionRules.WhatEver;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class PatternTemplate {
  private LinkedHashMap<EPackage, String> importAliases;
  
  private HashMap<AgentPattern, String> agentPatternVariables;
  
  private HashMap<Pattern, Set<String>> patternVariableNames;
  
  private HashMap<Pattern, HashMap<ValidAgentPattern, String>> agentPatterns;
  
  public PatternTemplate(final LinkedHashMap<EPackage, String> importAliases) {
    this.importAliases = importAliases;
    HashMap<AgentPattern, String> _hashMap = new HashMap<AgentPattern, String>();
    this.agentPatternVariables = _hashMap;
    HashMap<Pattern, Set<String>> _hashMap_1 = new HashMap<Pattern, Set<String>>();
    this.patternVariableNames = _hashMap_1;
    HashMap<Pattern, HashMap<ValidAgentPattern, String>> _hashMap_2 = new HashMap<Pattern, HashMap<ValidAgentPattern, String>>();
    this.agentPatterns = _hashMap_2;
  }
  
  public String generatePatternCode(final Collection<Rule> rules) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package patterngenerator");
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
    _builder.append("pattern support_SimLinkState(ss: SimSite) {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("SimSite.simLinkState(ss, _);");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    {
      boolean _hasElements = false;
      for(final Rule r : rules) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate("\n", "");
        }
        String _xifexpression = null;
        boolean _isPatternEmpty = this.isPatternEmpty(this.patternFromPatternAssignment(r.getRule().getLhs()));
        boolean _not = (!_isPatternEmpty);
        if (_not) {
          _xifexpression = this.generatePatternCode(r, this.patternFromPatternAssignment(r.getRule().getLhs()), "lhs");
        }
        _builder.append(_xifexpression);
        String _xifexpression_1 = null;
        boolean _equals = r.getRule().getOperator().equals("<->");
        if (_equals) {
          _xifexpression_1 = "\n";
        }
        _builder.append(_xifexpression_1);
        _builder.newLineIfNotEmpty();
        String _xifexpression_2 = null;
        boolean _equals_1 = r.getRule().getOperator().equals("<->");
        if (_equals_1) {
          String _xifexpression_3 = null;
          boolean _isPatternEmpty_1 = this.isPatternEmpty(this.patternFromPatternAssignment(r.getRule().getRhs()));
          boolean _not_1 = (!_isPatternEmpty_1);
          if (_not_1) {
            _xifexpression_3 = this.generatePatternCode(r, this.patternFromPatternAssignment(r.getRule().getRhs()), "rhs");
          }
          _xifexpression_2 = _xifexpression_3;
        }
        _builder.append(_xifexpression_2);
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder.toString();
  }
  
  public boolean isPatternEmpty(final Pattern p) {
    int _size = p.getAgentPatterns().size();
    boolean _lessThan = (_size < 1);
    if (_lessThan) {
      return true;
    } else {
      EList<AgentPattern> _agentPatterns = p.getAgentPatterns();
      for (final AgentPattern ap : _agentPatterns) {
        if ((ap instanceof ValidAgentPattern)) {
          return false;
        }
      }
    }
    return true;
  }
  
  public Pattern patternFromPatternAssignment(final PatternAssignment pa) {
    if ((pa instanceof AssignFromPattern)) {
      final AssignFromPattern afp = ((AssignFromPattern) pa);
      return afp.getPattern();
    } else {
      final AssignFromVariable afv = ((AssignFromVariable) pa);
      return afv.getPatternVar().getPattern();
    }
  }
  
  public String generatePatternCode(final Rule rule, final Pattern pattern, final String suffix) {
    int _size = pattern.getAgentPatterns().size();
    boolean _lessEqualsThan = (_size <= 0);
    if (_lessEqualsThan) {
      StringConcatenation _builder = new StringConcatenation();
      return _builder.toString();
    }
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("pattern ");
    String _name = rule.getName();
    String _plus = (_name + "_");
    String _plus_1 = (_plus + suffix);
    _builder_1.append(_plus_1);
    _builder_1.append("(");
    {
      LinkedList<ValidAgentPattern> _validAgentPatterns = this.getValidAgentPatterns(pattern.getAgentPatterns());
      boolean _hasElements = false;
      for(final ValidAgentPattern ap : _validAgentPatterns) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder_1.appendImmediate(", ", "");
        }
        _builder_1.append(" ");
        String _generateSimAgentContext = this.generateSimAgentContext(ap);
        _builder_1.append(_generateSimAgentContext);
      }
    }
    _builder_1.append(") {");
    _builder_1.newLineIfNotEmpty();
    {
      LinkedList<ValidAgentPattern> _validAgentPatterns_1 = this.getValidAgentPatterns(pattern.getAgentPatterns());
      boolean _hasElements_1 = false;
      for(final ValidAgentPattern ap_1 : _validAgentPatterns_1) {
        if (!_hasElements_1) {
          _hasElements_1 = true;
        } else {
          _builder_1.appendImmediate("\n", "\t");
        }
        _builder_1.append("\t");
        _builder_1.append("// Agent pattern for instances of agent ");
        String _uniqueSimAgentVariableName = this.uniqueSimAgentVariableName(ap_1);
        _builder_1.append(_uniqueSimAgentVariableName, "\t");
        _builder_1.newLineIfNotEmpty();
        _builder_1.append("\t");
        _builder_1.append("SimAgent.Type(");
        String _uniqueSimAgentVariableName_1 = this.uniqueSimAgentVariableName(ap_1);
        _builder_1.append(_uniqueSimAgentVariableName_1, "\t");
        _builder_1.append(", \"");
        String _name_1 = ap_1.getAgent().getName();
        _builder_1.append(_name_1, "\t");
        _builder_1.append("\");");
        _builder_1.newLineIfNotEmpty();
        {
          EList<SitePattern> _sitePatterns = ap_1.getSitePatterns().getSitePatterns();
          boolean _hasElements_2 = false;
          for(final SitePattern sp : _sitePatterns) {
            if (!_hasElements_2) {
              _hasElements_2 = true;
            } else {
              _builder_1.appendImmediate("\n", "\t\t");
            }
            _builder_1.append("\t");
            _builder_1.append("\t");
            _builder_1.append("// Site patterns for site ");
            String _name_2 = sp.getSite().getName();
            _builder_1.append(_name_2, "\t\t");
            _builder_1.append(" attached to instances of agent ");
            String _uniqueSimAgentVariableName_2 = this.uniqueSimAgentVariableName(ap_1);
            _builder_1.append(_uniqueSimAgentVariableName_2, "\t\t");
            _builder_1.append(" ");
            _builder_1.newLineIfNotEmpty();
            _builder_1.append("\t");
            _builder_1.append("\t");
            _builder_1.append("SimAgent.simSites(");
            String _uniqueSimAgentVariableName_3 = this.uniqueSimAgentVariableName(ap_1);
            _builder_1.append(_uniqueSimAgentVariableName_3, "\t\t");
            _builder_1.append(", ");
            String _simSiteVariableName = this.simSiteVariableName(ap_1, sp);
            _builder_1.append(_simSiteVariableName, "\t\t");
            _builder_1.append(");");
            _builder_1.newLineIfNotEmpty();
            _builder_1.append("\t");
            _builder_1.append("\t");
            _builder_1.append("SimSite.Type(");
            String _simSiteVariableName_1 = this.simSiteVariableName(ap_1, sp);
            _builder_1.append(_simSiteVariableName_1, "\t\t");
            _builder_1.append(", \"");
            String _name_3 = sp.getSite().getName();
            _builder_1.append(_name_3, "\t\t");
            _builder_1.append("\");");
            _builder_1.newLineIfNotEmpty();
            _builder_1.append("\t");
            _builder_1.append("\t");
            String _siteStatePattern = this.siteStatePattern(ap_1, sp);
            _builder_1.append(_siteStatePattern, "\t\t");
            _builder_1.newLineIfNotEmpty();
            _builder_1.append("\t");
            _builder_1.append("\t");
            String _linkStatePattern = this.linkStatePattern(ap_1, sp);
            _builder_1.append(_linkStatePattern, "\t\t");
            _builder_1.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder_1.append("\t");
    String _generateInjectivityConstraints = this.generateInjectivityConstraints(pattern);
    _builder_1.append(_generateInjectivityConstraints, "\t");
    _builder_1.newLineIfNotEmpty();
    _builder_1.append("}");
    _builder_1.newLine();
    return _builder_1.toString();
  }
  
  public String generateInjectivityConstraints(final Pattern pattern) {
    final HashMap<String, String> constraints = new HashMap<String, String>();
    final HashMap<ValidAgentPattern, String> patterns = this.agentPatterns.get(pattern);
    final Set<ValidAgentPattern> keySet = patterns.keySet();
    for (final ValidAgentPattern current : keySet) {
      {
        final String currentType = current.getAgent().getName();
        for (final ValidAgentPattern candidate : keySet) {
          boolean _equals = current.equals(candidate);
          boolean _not = (!_equals);
          if (_not) {
            final String candidateType = candidate.getAgent().getName();
            boolean _equals_1 = currentType.equals(candidateType);
            if (_equals_1) {
              String _get = patterns.get(current);
              String _plus = (_get + " != ");
              String _get_1 = patterns.get(candidate);
              String _plus_1 = (_plus + _get_1);
              final String constrain1 = (_plus_1 + ";");
              String _get_2 = patterns.get(candidate);
              String _plus_2 = (_get_2 + " != ");
              String _get_3 = patterns.get(current);
              String _plus_3 = (_plus_2 + _get_3);
              final String constrain2 = (_plus_3 + ";");
              final String key = Integer.valueOf(Math.max(constrain1.hashCode(), constrain2.hashCode())).toString();
              boolean _containsKey = constraints.containsKey(key);
              boolean _not_1 = (!_containsKey);
              if (_not_1) {
                constraints.put(key, constrain1);
              }
            }
          }
        }
      }
    }
    StringConcatenation _builder = new StringConcatenation();
    {
      Set<String> _keySet = constraints.keySet();
      boolean _hasElements = false;
      for(final String cnst : _keySet) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate("\n", "");
        }
        _builder.append(" ");
        String _get = constraints.get(cnst);
        _builder.append(_get);
      }
    }
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
  
  public LinkedList<ValidAgentPattern> getValidAgentPatterns(final EList<AgentPattern> aps) {
    final LinkedList<ValidAgentPattern> list = new LinkedList<ValidAgentPattern>();
    for (final AgentPattern ap : aps) {
      if ((ap instanceof ValidAgentPattern)) {
        final ValidAgentPattern vap = ((ValidAgentPattern) ap);
        list.add(vap);
      }
    }
    return list;
  }
  
  public String linkStatePattern(final ValidAgentPattern ap, final SitePattern sp) {
    LinkState _linkState = sp.getLinkState().getLinkState();
    final LinkState linkState = ((LinkState) _linkState);
    if ((linkState instanceof FreeLink)) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("neg find support_SimLinkState(");
      String _simSiteVariableName = this.simSiteVariableName(ap, sp);
      _builder.append(_simSiteVariableName);
      _builder.append(");");
      _builder.newLineIfNotEmpty();
      return _builder.toString();
    } else {
      if ((linkState instanceof BoundAnyLink)) {
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("SimSite.simLinkState(");
        String _simSiteVariableName_1 = this.simSiteVariableName(ap, sp);
        _builder_1.append(_simSiteVariableName_1);
        _builder_1.append(", _);");
        _builder_1.newLineIfNotEmpty();
        return _builder_1.toString();
      } else {
        if ((linkState instanceof WhatEver)) {
          StringConcatenation _builder_2 = new StringConcatenation();
          return _builder_2.toString();
        } else {
          if ((linkState instanceof BoundAnyOfTypeLink)) {
            final BoundAnyOfTypeLink eLink = ((BoundAnyOfTypeLink) linkState);
            StringConcatenation _builder_3 = new StringConcatenation();
            _builder_3.append("SimSite.simLinkState(");
            String _simSiteVariableName_2 = this.simSiteVariableName(ap, sp);
            _builder_3.append(_simSiteVariableName_2);
            _builder_3.append(", ");
            String _simLinkStateVariableName = this.simLinkStateVariableName(ap, sp);
            _builder_3.append(_simLinkStateVariableName);
            _builder_3.append(");");
            _builder_3.newLineIfNotEmpty();
            _builder_3.append("// Create context for other SimAgent:");
            _builder_3.newLine();
            _builder_3.append("SimAgent.Type(");
            String _uniqueSimAgentVariableName = this.uniqueSimAgentVariableName(ap);
            _builder_3.append(_uniqueSimAgentVariableName);
            _builder_3.append("_");
            String _name = eLink.getLinkAgent().getAgent().getName();
            _builder_3.append(_name);
            _builder_3.append(", \"");
            String _name_1 = eLink.getLinkAgent().getAgent().getName();
            _builder_3.append(_name_1);
            _builder_3.append("\");");
            _builder_3.newLineIfNotEmpty();
            _builder_3.append("SimAgent.simSites(");
            String _uniqueSimAgentVariableName_1 = this.uniqueSimAgentVariableName(ap);
            _builder_3.append(_uniqueSimAgentVariableName_1);
            _builder_3.append("_");
            String _name_2 = eLink.getLinkAgent().getAgent().getName();
            _builder_3.append(_name_2);
            _builder_3.append(", ");
            String _uniqueSimAgentVariableName_2 = this.uniqueSimAgentVariableName(ap);
            _builder_3.append(_uniqueSimAgentVariableName_2);
            _builder_3.append("_");
            String _name_3 = eLink.getLinkAgent().getAgent().getName();
            _builder_3.append(_name_3);
            _builder_3.append("_");
            String _name_4 = eLink.getLinkSite().getSite().getName();
            _builder_3.append(_name_4);
            _builder_3.append(");");
            _builder_3.newLineIfNotEmpty();
            _builder_3.append("SimSite.Type(");
            String _uniqueSimAgentVariableName_3 = this.uniqueSimAgentVariableName(ap);
            _builder_3.append(_uniqueSimAgentVariableName_3);
            _builder_3.append("_");
            String _name_5 = eLink.getLinkAgent().getAgent().getName();
            _builder_3.append(_name_5);
            _builder_3.append("_");
            String _name_6 = eLink.getLinkSite().getSite().getName();
            _builder_3.append(_name_6);
            _builder_3.append(", \"");
            String _name_7 = eLink.getLinkSite().getSite().getName();
            _builder_3.append(_name_7);
            _builder_3.append("\");");
            _builder_3.newLineIfNotEmpty();
            _builder_3.append("SimSite.simLinkState(");
            String _uniqueSimAgentVariableName_4 = this.uniqueSimAgentVariableName(ap);
            _builder_3.append(_uniqueSimAgentVariableName_4);
            _builder_3.append("_");
            String _name_8 = eLink.getLinkAgent().getAgent().getName();
            _builder_3.append(_name_8);
            _builder_3.append("_");
            String _name_9 = eLink.getLinkSite().getSite().getName();
            _builder_3.append(_name_9);
            _builder_3.append(", ");
            String _uniqueSimAgentVariableName_5 = this.uniqueSimAgentVariableName(ap);
            _builder_3.append(_uniqueSimAgentVariableName_5);
            _builder_3.append("_");
            String _name_10 = eLink.getLinkAgent().getAgent().getName();
            _builder_3.append(_name_10);
            _builder_3.append("_");
            String _name_11 = eLink.getLinkSite().getSite().getName();
            _builder_3.append(_name_11);
            _builder_3.append("_LS);");
            _builder_3.newLineIfNotEmpty();
            _builder_3.append("// check for equality");
            _builder_3.newLine();
            String _simLinkStateVariableName_1 = this.simLinkStateVariableName(ap, sp);
            _builder_3.append(_simLinkStateVariableName_1);
            _builder_3.append(" == ");
            String _uniqueSimAgentVariableName_6 = this.uniqueSimAgentVariableName(ap);
            _builder_3.append(_uniqueSimAgentVariableName_6);
            _builder_3.append("_");
            String _name_12 = eLink.getLinkAgent().getAgent().getName();
            _builder_3.append(_name_12);
            _builder_3.append("_");
            String _name_13 = eLink.getLinkSite().getSite().getName();
            _builder_3.append(_name_13);
            _builder_3.append("_LS;");
            _builder_3.newLineIfNotEmpty();
            return _builder_3.toString();
          } else {
            StringConcatenation _builder_4 = new StringConcatenation();
            _builder_4.append("SimSite.simLinkState(");
            String _simSiteVariableName_3 = this.simSiteVariableName(ap, sp);
            _builder_4.append(_simSiteVariableName_3);
            _builder_4.append(", ");
            String _simLinkStateVariableName_2 = this.simLinkStateVariableName(ap, sp);
            _builder_4.append(_simLinkStateVariableName_2);
            _builder_4.append(");");
            _builder_4.newLineIfNotEmpty();
            String _simLinkStateVariableName_3 = this.simLinkStateVariableName(ap, sp);
            _builder_4.append(_simLinkStateVariableName_3);
            _builder_4.append(" == ");
            String _otherLinkStateVariableName = this.getOtherLinkStateVariableName(ap, sp);
            _builder_4.append(_otherLinkStateVariableName);
            _builder_4.append(";");
            _builder_4.newLineIfNotEmpty();
            return _builder_4.toString();
          }
        }
      }
    }
  }
  
  public String siteStatePattern(final ValidAgentPattern ap, final SitePattern sp) {
    SiteState _state = sp.getState();
    final SiteState siteState = ((SiteState) _state);
    if ((siteState == null)) {
      StringConcatenation _builder = new StringConcatenation();
      return _builder.toString();
    }
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("SimSite.simSiteState.Type(");
    String _simSiteVariableName = this.simSiteVariableName(ap, sp);
    _builder_1.append(_simSiteVariableName);
    _builder_1.append(", \"");
    String _name = siteState.getState().getName();
    _builder_1.append(_name);
    _builder_1.append("\");");
    _builder_1.newLineIfNotEmpty();
    return _builder_1.toString();
  }
  
  public String getOtherLinkStateVariableName(final ValidAgentPattern ap, final SitePattern sp) {
    LinkState _linkState = sp.getLinkState().getLinkState();
    final BoundLink iLink = ((BoundLink) _linkState);
    Rule rule = ((Rule) null);
    EObject eObj = iLink.eContainer();
    while (((!(eObj instanceof Rule)) && (eObj != null))) {
      eObj = eObj.eContainer();
    }
    if ((eObj instanceof Rule)) {
      rule = ((Rule)eObj);
    }
    LinkedList<BoundLink> candidates = this.getAllBoundLinksOfRule(rule);
    for (final BoundLink cand : candidates) {
      {
        final BoundLink candidate = ((BoundLink) cand);
        if (((!candidate.equals(iLink)) && iLink.getState().equals(candidate.getState()))) {
          ValidAgentPattern agentPattern = ((ValidAgentPattern) null);
          SitePattern sitePattern = ((SitePattern) null);
          EObject eObj2 = candidate.eContainer();
          while (((!(eObj2 instanceof SitePattern)) && (eObj2 != null))) {
            eObj2 = eObj2.eContainer();
          }
          if ((eObj2 instanceof SitePattern)) {
            sitePattern = ((SitePattern) eObj2);
          }
          while (((!(eObj2 instanceof ValidAgentPattern)) && (eObj2 != null))) {
            eObj2 = eObj2.eContainer();
          }
          if ((eObj2 instanceof ValidAgentPattern)) {
            agentPattern = ((ValidAgentPattern) eObj2);
          }
          if (((agentPattern != null) && (sitePattern != null))) {
            StringConcatenation _builder = new StringConcatenation();
            String _simLinkStateVariableName = this.simLinkStateVariableName(agentPattern, sitePattern);
            _builder.append(_simLinkStateVariableName);
            return _builder.toString();
          }
          StringConcatenation _builder_1 = new StringConcatenation();
          return _builder_1.toString();
        }
      }
    }
    StringConcatenation _builder = new StringConcatenation();
    return _builder.toString();
  }
  
  public String getOtherBoundLinkAgent(final ValidAgentPattern ap, final SitePattern sp) {
    LinkState _linkState = sp.getLinkState().getLinkState();
    final BoundLink iLink = ((BoundLink) _linkState);
    Rule rule = ((Rule) null);
    EObject eObj = iLink.eContainer();
    while (((!(eObj instanceof Rule)) && (eObj != null))) {
      eObj = eObj.eContainer();
    }
    if ((eObj instanceof Rule)) {
      rule = ((Rule)eObj);
    }
    LinkedList<BoundLink> candidates = this.getAllBoundLinksOfRule(rule);
    for (final BoundLink cand : candidates) {
      {
        final BoundLink candidate = ((BoundLink) cand);
        if (((!candidate.equals(iLink)) && iLink.getState().equals(candidate.getState()))) {
          ValidAgentPattern agentPattern = ((ValidAgentPattern) null);
          SitePattern sitePattern = ((SitePattern) null);
          EObject eObj2 = candidate.eContainer();
          while (((!(eObj2 instanceof SitePattern)) && (eObj2 != null))) {
            eObj2 = eObj2.eContainer();
          }
          if ((eObj2 instanceof SitePattern)) {
            sitePattern = ((SitePattern) eObj2);
          }
          while (((!(eObj2 instanceof ValidAgentPattern)) && (eObj2 != null))) {
            eObj2 = eObj2.eContainer();
          }
          if ((eObj2 instanceof ValidAgentPattern)) {
            agentPattern = ((ValidAgentPattern) eObj2);
          }
          if (((agentPattern != null) && (sitePattern != null))) {
            StringConcatenation _builder = new StringConcatenation();
            String _uniqueSimAgentVariableName = this.uniqueSimAgentVariableName(agentPattern);
            _builder.append(_uniqueSimAgentVariableName);
            return _builder.toString();
          }
          StringConcatenation _builder_1 = new StringConcatenation();
          return _builder_1.toString();
        }
      }
    }
    StringConcatenation _builder = new StringConcatenation();
    return _builder.toString();
  }
  
  public String getOtherBoundLinkSite(final AgentPattern ap, final SitePattern sp) {
    LinkState _linkState = sp.getLinkState().getLinkState();
    final BoundLink iLink = ((BoundLink) _linkState);
    Rule rule = ((Rule) null);
    EObject eObj = iLink.eContainer();
    while (((!(eObj instanceof Rule)) && (eObj != null))) {
      eObj = eObj.eContainer();
    }
    if ((eObj instanceof Rule)) {
      rule = ((Rule)eObj);
    }
    LinkedList<BoundLink> candidates = this.getAllBoundLinksOfRule(rule);
    for (final BoundLink cand : candidates) {
      {
        final BoundLink candidate = ((BoundLink) cand);
        if (((!candidate.equals(iLink)) && iLink.getState().equals(candidate.getState()))) {
          ValidAgentPattern agentPattern = ((ValidAgentPattern) null);
          SitePattern sitePattern = ((SitePattern) null);
          EObject eObj2 = candidate.eContainer();
          while (((!(eObj2 instanceof SitePattern)) && (eObj2 != null))) {
            eObj2 = eObj2.eContainer();
          }
          if ((eObj2 instanceof SitePattern)) {
            sitePattern = ((SitePattern) eObj2);
          }
          while (((!(eObj2 instanceof ValidAgentPattern)) && (eObj2 != null))) {
            eObj2 = eObj2.eContainer();
          }
          if ((eObj2 instanceof ValidAgentPattern)) {
            agentPattern = ((ValidAgentPattern) eObj2);
          }
          if (((agentPattern != null) && (sitePattern != null))) {
            StringConcatenation _builder = new StringConcatenation();
            String _uniqueSimAgentVariableName = this.uniqueSimAgentVariableName(agentPattern);
            _builder.append(_uniqueSimAgentVariableName);
            _builder.append("_");
            String _name = sitePattern.getSite().getName();
            _builder.append(_name);
            _builder.append("_Site");
            return _builder.toString();
          }
          StringConcatenation _builder_1 = new StringConcatenation();
          return _builder_1.toString();
        }
      }
    }
    StringConcatenation _builder = new StringConcatenation();
    return _builder.toString();
  }
  
  public LinkedList<BoundLink> getAllBoundLinksOfRule(final Rule rule) {
    LinkedList<BoundLink> out = new LinkedList<BoundLink>();
    RuleBody ruleBody = ((RuleBody) null);
    RuleBody _rule = rule.getRule();
    boolean _tripleNotEquals = (_rule != null);
    if (_tripleNotEquals) {
      RuleBody _rule_1 = rule.getRule();
      ruleBody = ((RuleBody) _rule_1);
    }
    if ((ruleBody == null)) {
      return out;
    }
    PatternAssignment lhs = ruleBody.getLhs();
    PatternAssignment rhs = ruleBody.getRhs();
    LinkedList<Pattern> patterns = new LinkedList<Pattern>();
    if ((lhs != null)) {
      patterns.add(this.patternFromPatternAssignment(lhs));
    }
    if ((rhs != null)) {
      patterns.add(this.patternFromPatternAssignment(rhs));
    }
    LinkedList<AgentPattern> agentPatterns = new LinkedList<AgentPattern>();
    for (final Pattern pattern : patterns) {
      EList<AgentPattern> _agentPatterns = pattern.getAgentPatterns();
      boolean _tripleNotEquals_1 = (_agentPatterns != null);
      if (_tripleNotEquals_1) {
        agentPatterns.addAll(pattern.getAgentPatterns());
      }
    }
    LinkedList<SitePattern> sitePatterns = new LinkedList<SitePattern>();
    for (final AgentPattern aPattern : agentPatterns) {
      if ((aPattern instanceof ValidAgentPattern)) {
        final ValidAgentPattern vaPattern = ((ValidAgentPattern) aPattern);
        SitePatterns _sitePatterns = vaPattern.getSitePatterns();
        boolean _tripleNotEquals_2 = (_sitePatterns != null);
        if (_tripleNotEquals_2) {
          sitePatterns.addAll(vaPattern.getSitePatterns().getSitePatterns());
        }
      }
    }
    for (final SitePattern sPattern : sitePatterns) {
      LinkState _linkState = sPattern.getLinkState();
      boolean _tripleNotEquals_3 = (_linkState != null);
      if (_tripleNotEquals_3) {
        LinkState _linkState_1 = sPattern.getLinkState().getLinkState();
        if ((_linkState_1 instanceof BoundLink)) {
          LinkState _linkState_2 = sPattern.getLinkState().getLinkState();
          final BoundLink iLink = ((BoundLink) _linkState_2);
          out.add(iLink);
        }
      }
    }
    return out;
  }
  
  public String generateSimAgentContext(final ValidAgentPattern ap) {
    StringConcatenation _builder = new StringConcatenation();
    String _uniqueSimAgentVariableName = this.uniqueSimAgentVariableName(ap);
    _builder.append(_uniqueSimAgentVariableName);
    _builder.append(": SimAgent");
    return _builder.toString();
  }
  
  public String simSiteVariableName(final ValidAgentPattern ap, final SitePattern sp) {
    StringConcatenation _builder = new StringConcatenation();
    String _uniqueSimAgentVariableName = this.uniqueSimAgentVariableName(ap);
    String _plus = (_uniqueSimAgentVariableName + "_");
    String _name = sp.getSite().getName();
    String _plus_1 = (_plus + _name);
    _builder.append(_plus_1);
    return _builder.toString();
  }
  
  public String simLinkStateVariableName(final ValidAgentPattern ap, final SitePattern sp) {
    StringConcatenation _builder = new StringConcatenation();
    String _uniqueSimAgentVariableName = this.uniqueSimAgentVariableName(ap);
    String _plus = (_uniqueSimAgentVariableName + "_");
    String _name = sp.getSite().getName();
    String _plus_1 = (_plus + _name);
    _builder.append(_plus_1);
    _builder.append("_LS");
    return _builder.toString();
  }
  
  public String uniqueSimAgentVariableName(final ValidAgentPattern ap) {
    String name = "";
    boolean _containsKey = this.agentPatternVariables.containsKey(ap);
    if (_containsKey) {
      name = this.agentPatternVariables.get(ap);
    } else {
      EObject _eContainer = ap.eContainer();
      final Pattern pattern = ((Pattern) _eContainer);
      Set<String> varNameSet = ((Set<String>) null);
      boolean _containsKey_1 = this.patternVariableNames.containsKey(pattern);
      if (_containsKey_1) {
        varNameSet = this.patternVariableNames.get(pattern);
        name = ap.getAgent().getName();
        int c = 1;
        while (varNameSet.contains(name)) {
          {
            String _name = ap.getAgent().getName();
            String _plus = (_name + Integer.valueOf(c));
            name = _plus;
            c++;
          }
        }
        varNameSet.add(name);
        this.agentPatternVariables.put(ap, name);
      } else {
        name = ap.getAgent().getName();
        HashSet<String> _hashSet = new HashSet<String>();
        varNameSet = _hashSet;
        varNameSet.add(name);
        this.patternVariableNames.put(pattern, varNameSet);
        this.agentPatternVariables.put(ap, name);
      }
      HashMap<ValidAgentPattern, String> patterns = ((HashMap<ValidAgentPattern, String>) null);
      boolean _containsKey_2 = this.agentPatterns.containsKey(pattern);
      if (_containsKey_2) {
        patterns = this.agentPatterns.get(pattern);
        boolean _containsKey_3 = patterns.containsKey(ap);
        boolean _not = (!_containsKey_3);
        if (_not) {
          patterns.put(ap, name);
        }
      } else {
        HashMap<ValidAgentPattern, String> _hashMap = new HashMap<ValidAgentPattern, String>();
        patterns = _hashMap;
        patterns.put(ap, name);
        this.agentPatterns.put(pattern, patterns);
      }
    }
    return name;
  }
}
