package patterngenerator;

import biochemsimulation.reactionrules.reactionRules.AgentPattern;
import biochemsimulation.reactionrules.reactionRules.AssignFromPattern;
import biochemsimulation.reactionrules.reactionRules.AssignFromVariable;
import biochemsimulation.reactionrules.reactionRules.ExactLink;
import biochemsimulation.reactionrules.reactionRules.FreeLink;
import biochemsimulation.reactionrules.reactionRules.IndexedLink;
import biochemsimulation.reactionrules.reactionRules.LinkState;
import biochemsimulation.reactionrules.reactionRules.Pattern;
import biochemsimulation.reactionrules.reactionRules.PatternAssignment;
import biochemsimulation.reactionrules.reactionRules.Rule;
import biochemsimulation.reactionrules.reactionRules.RuleBody;
import biochemsimulation.reactionrules.reactionRules.SemiLink;
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
import org.eclipse.xtext.xbase.lib.InputOutput;

@SuppressWarnings("all")
public class PatternTemplate {
  private LinkedHashMap<EPackage, String> importAliases;
  
  private HashMap<AgentPattern, String> agentPatternVariables;
  
  private HashMap<Pattern, Set<String>> patternVariableNames;
  
  public PatternTemplate(final LinkedHashMap<EPackage, String> importAliases) {
    this.importAliases = importAliases;
    HashMap<AgentPattern, String> _hashMap = new HashMap<AgentPattern, String>();
    this.agentPatternVariables = _hashMap;
    HashMap<Pattern, Set<String>> _hashMap_1 = new HashMap<Pattern, Set<String>>();
    this.patternVariableNames = _hashMap_1;
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
        String _generateAgentPatternContext = this.generateAgentPatternContext(ap);
        _builder_1.append(_generateAgentPatternContext);
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
        String _uniqueAgentPatternVarId = this.getUniqueAgentPatternVarId(ap_1);
        _builder_1.append(_uniqueAgentPatternVarId, "\t");
        _builder_1.newLineIfNotEmpty();
        _builder_1.append("\t");
        _builder_1.append("AgentInstance.agent.name(");
        String _uniqueAgentPatternVarId_1 = this.getUniqueAgentPatternVarId(ap_1);
        _builder_1.append(_uniqueAgentPatternVarId_1, "\t");
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
            String _uniqueAgentPatternVarId_2 = this.getUniqueAgentPatternVarId(ap_1);
            _builder_1.append(_uniqueAgentPatternVarId_2, "\t\t");
            _builder_1.append(" ");
            _builder_1.newLineIfNotEmpty();
            _builder_1.append("\t");
            _builder_1.append("\t");
            _builder_1.append("AgentInstance.linkStates(");
            String _uniqueAgentPatternVarId_3 = this.getUniqueAgentPatternVarId(ap_1);
            _builder_1.append(_uniqueAgentPatternVarId_3, "\t\t");
            _builder_1.append(", ");
            String _aILSVariableName = this.aILSVariableName(ap_1, sp);
            _builder_1.append(_aILSVariableName, "\t\t");
            _builder_1.append(");");
            _builder_1.newLineIfNotEmpty();
            _builder_1.append("\t");
            _builder_1.append("\t");
            _builder_1.append("AgentInstanceLinkState.site.name(");
            String _aILSVariableName_1 = this.aILSVariableName(ap_1, sp);
            _builder_1.append(_aILSVariableName_1, "\t\t");
            _builder_1.append(", \"");
            String _name_3 = sp.getSite().getName();
            _builder_1.append(_name_3, "\t\t");
            _builder_1.append("\");");
            _builder_1.newLineIfNotEmpty();
            _builder_1.append("\t");
            _builder_1.append("\t");
            String _linkStatePattern = this.linkStatePattern(ap_1, sp);
            _builder_1.append(_linkStatePattern, "\t\t");
            _builder_1.newLineIfNotEmpty();
            _builder_1.append("\t");
            _builder_1.append("\t");
            String _siteStatePattern = this.siteStatePattern(ap_1, sp);
            _builder_1.append(_siteStatePattern, "\t\t");
            _builder_1.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder_1.append("}");
    _builder_1.newLine();
    return _builder_1.toString();
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
      _builder.append("AgentInstanceLinkState.linkState.linkState(");
      String _aILSVariableName = this.aILSVariableName(ap, sp);
      _builder.append(_aILSVariableName);
      _builder.append(", ");
      String _uniqueAgentPatternVarId = this.getUniqueAgentPatternVarId(ap);
      _builder.append(_uniqueAgentPatternVarId);
      _builder.append("_");
      String _name = sp.getSite().getName();
      _builder.append(_name);
      _builder.append("_FL);");
      _builder.newLineIfNotEmpty();
      _builder.append("FreeLink(");
      String _uniqueAgentPatternVarId_1 = this.getUniqueAgentPatternVarId(ap);
      _builder.append(_uniqueAgentPatternVarId_1);
      _builder.append("_");
      String _name_1 = sp.getSite().getName();
      _builder.append(_name_1);
      _builder.append("_FL);");
      _builder.newLineIfNotEmpty();
      return _builder.toString();
    } else {
      if ((linkState instanceof SemiLink)) {
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("AgentInstanceLinkState.linkState.linkState(");
        String _aILSVariableName_1 = this.aILSVariableName(ap, sp);
        _builder_1.append(_aILSVariableName_1);
        _builder_1.append(", ");
        String _uniqueAgentPatternVarId_2 = this.getUniqueAgentPatternVarId(ap);
        _builder_1.append(_uniqueAgentPatternVarId_2);
        _builder_1.append("_");
        String _name_2 = sp.getSite().getName();
        _builder_1.append(_name_2);
        _builder_1.append("_SL);");
        _builder_1.newLineIfNotEmpty();
        _builder_1.append("IndexedLink(");
        String _uniqueAgentPatternVarId_3 = this.getUniqueAgentPatternVarId(ap);
        _builder_1.append(_uniqueAgentPatternVarId_3);
        _builder_1.append("_");
        String _name_3 = sp.getSite().getName();
        _builder_1.append(_name_3);
        _builder_1.append("_SL);");
        _builder_1.newLineIfNotEmpty();
        return _builder_1.toString();
      } else {
        if ((linkState instanceof WhatEver)) {
          StringConcatenation _builder_2 = new StringConcatenation();
          return _builder_2.toString();
        } else {
          if ((linkState instanceof ExactLink)) {
            final ExactLink eLink = ((ExactLink) linkState);
            StringConcatenation _builder_3 = new StringConcatenation();
            _builder_3.append("AgentInstanceLinkState.linkState.linkState(");
            String _aILSVariableName_2 = this.aILSVariableName(ap, sp);
            _builder_3.append(_aILSVariableName_2);
            _builder_3.append(", ");
            String _uniqueAgentPatternVarId_4 = this.getUniqueAgentPatternVarId(ap);
            _builder_3.append(_uniqueAgentPatternVarId_4);
            _builder_3.append("_");
            String _name_4 = sp.getSite().getName();
            _builder_3.append(_name_4);
            _builder_3.append("_EL);");
            _builder_3.newLineIfNotEmpty();
            _builder_3.append("IndexedLink(");
            String _uniqueAgentPatternVarId_5 = this.getUniqueAgentPatternVarId(ap);
            _builder_3.append(_uniqueAgentPatternVarId_5);
            _builder_3.append("_");
            String _name_5 = sp.getSite().getName();
            _builder_3.append(_name_5);
            _builder_3.append("_EL);");
            _builder_3.newLineIfNotEmpty();
            _builder_3.append("AgentInstanceLinkState.attachedSite.name(");
            String _aILSVariableName_3 = this.aILSVariableName(ap, sp);
            _builder_3.append(_aILSVariableName_3);
            _builder_3.append(", \"");
            String _name_6 = eLink.getLinkSite().getSite().getName();
            _builder_3.append(_name_6);
            _builder_3.append("\");");
            _builder_3.newLineIfNotEmpty();
            _builder_3.append("AgentInstanceLinkState.attachedAgentInstance.agent.name(");
            String _aILSVariableName_4 = this.aILSVariableName(ap, sp);
            _builder_3.append(_aILSVariableName_4);
            _builder_3.append(", \"");
            String _name_7 = eLink.getLinkAgent().getAgent().getName();
            _builder_3.append(_name_7);
            _builder_3.append("\");");
            _builder_3.newLineIfNotEmpty();
            return _builder_3.toString();
          } else {
            StringConcatenation _builder_4 = new StringConcatenation();
            _builder_4.append("AgentInstanceLinkState.linkState.linkState(");
            String _aILSVariableName_5 = this.aILSVariableName(ap, sp);
            _builder_4.append(_aILSVariableName_5);
            _builder_4.append(", ");
            String _uniqueAgentPatternVarId_6 = this.getUniqueAgentPatternVarId(ap);
            _builder_4.append(_uniqueAgentPatternVarId_6);
            _builder_4.append("_");
            String _name_8 = sp.getSite().getName();
            _builder_4.append(_name_8);
            _builder_4.append("_IL);\t");
            _builder_4.newLineIfNotEmpty();
            _builder_4.append("IndexedLink(");
            String _name_9 = ap.getAgent().getName();
            _builder_4.append(_name_9);
            _builder_4.append("_");
            String _name_10 = sp.getSite().getName();
            _builder_4.append(_name_10);
            _builder_4.append("_IL);");
            _builder_4.newLineIfNotEmpty();
            _builder_4.append("AgentInstanceLinkState.site(");
            String _aILSVariableName_6 = this.aILSVariableName(ap, sp);
            _builder_4.append(_aILSVariableName_6);
            _builder_4.append(", ");
            String _name_11 = ap.getAgent().getName();
            _builder_4.append(_name_11);
            _builder_4.append("_");
            String _name_12 = sp.getSite().getName();
            _builder_4.append(_name_12);
            _builder_4.append("_Site);");
            _builder_4.newLineIfNotEmpty();
            _builder_4.append("AgentInstanceLinkState.attachedSite(");
            String _aILSVariableName_7 = this.aILSVariableName(ap, sp);
            _builder_4.append(_aILSVariableName_7);
            _builder_4.append(", ");
            String _otherIndexedLinkSite = this.getOtherIndexedLinkSite(ap, sp);
            _builder_4.append(_otherIndexedLinkSite);
            _builder_4.append(");");
            _builder_4.newLineIfNotEmpty();
            _builder_4.append("AgentInstanceLinkState.attachedAgentInstance(");
            String _aILSVariableName_8 = this.aILSVariableName(ap, sp);
            _builder_4.append(_aILSVariableName_8);
            _builder_4.append(", ");
            String _otherIndexedLinkAgent = this.getOtherIndexedLinkAgent(ap, sp);
            _builder_4.append(_otherIndexedLinkAgent);
            _builder_4.append(");");
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
    _builder_1.append("AgentInstance.siteStates(");
    String _uniqueAgentPatternVarId = this.getUniqueAgentPatternVarId(ap);
    _builder_1.append(_uniqueAgentPatternVarId);
    _builder_1.append(", ");
    String _aISSVariableName = this.aISSVariableName(ap, sp);
    _builder_1.append(_aISSVariableName);
    _builder_1.append(");");
    _builder_1.newLineIfNotEmpty();
    _builder_1.append("AgentInstanceSiteState.site.name(");
    String _aISSVariableName_1 = this.aISSVariableName(ap, sp);
    _builder_1.append(_aISSVariableName_1);
    _builder_1.append(", \"");
    String _name = sp.getSite().getName();
    _builder_1.append(_name);
    _builder_1.append("\");");
    _builder_1.newLineIfNotEmpty();
    _builder_1.append("AgentInstanceSiteState.siteState.state.name(");
    String _aISSVariableName_2 = this.aISSVariableName(ap, sp);
    _builder_1.append(_aISSVariableName_2);
    _builder_1.append(", \"");
    String _name_1 = sp.getState().getState().getName();
    _builder_1.append(_name_1);
    _builder_1.append("\");");
    _builder_1.newLineIfNotEmpty();
    return _builder_1.toString();
  }
  
  public String getOtherIndexedLinkAgent(final ValidAgentPattern ap, final SitePattern sp) {
    LinkState _linkState = sp.getLinkState().getLinkState();
    final IndexedLink iLink = ((IndexedLink) _linkState);
    Rule rule = ((Rule) null);
    EObject eObj = iLink.eContainer();
    while (((!(eObj instanceof Rule)) && (eObj != null))) {
      eObj = eObj.eContainer();
    }
    if ((eObj instanceof Rule)) {
      rule = ((Rule)eObj);
    }
    LinkedList<IndexedLink> candidates = this.getAllIndexedLinksOfRule(rule);
    for (final IndexedLink cand : candidates) {
      {
        final IndexedLink candidate = ((IndexedLink) cand);
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
            String _uniqueAgentPatternVarId = this.getUniqueAgentPatternVarId(agentPattern);
            _builder.append(_uniqueAgentPatternVarId);
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
  
  public String getOtherIndexedLinkSite(final AgentPattern ap, final SitePattern sp) {
    LinkState _linkState = sp.getLinkState().getLinkState();
    final IndexedLink iLink = ((IndexedLink) _linkState);
    Rule rule = ((Rule) null);
    EObject eObj = iLink.eContainer();
    while (((!(eObj instanceof Rule)) && (eObj != null))) {
      eObj = eObj.eContainer();
    }
    if ((eObj instanceof Rule)) {
      rule = ((Rule)eObj);
    }
    LinkedList<IndexedLink> candidates = this.getAllIndexedLinksOfRule(rule);
    for (final IndexedLink cand : candidates) {
      {
        final IndexedLink candidate = ((IndexedLink) cand);
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
            String _uniqueAgentPatternVarId = this.getUniqueAgentPatternVarId(agentPattern);
            _builder.append(_uniqueAgentPatternVarId);
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
  
  public LinkedList<IndexedLink> getAllIndexedLinksOfRule(final Rule rule) {
    LinkedList<IndexedLink> out = new LinkedList<IndexedLink>();
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
        if ((_linkState_1 instanceof IndexedLink)) {
          LinkState _linkState_2 = sPattern.getLinkState().getLinkState();
          final IndexedLink iLink = ((IndexedLink) _linkState_2);
          out.add(iLink);
        }
      }
    }
    return out;
  }
  
  public String generateAgentPatternContext(final ValidAgentPattern ap) {
    StringConcatenation _builder = new StringConcatenation();
    String _uniqueAgentPatternVarId = this.getUniqueAgentPatternVarId(ap);
    _builder.append(_uniqueAgentPatternVarId);
    _builder.append(": AgentInstance");
    return _builder.toString();
  }
  
  public String aILSVariableName(final ValidAgentPattern ap, final SitePattern sp) {
    StringConcatenation _builder = new StringConcatenation();
    String _uniqueAgentPatternVarId = this.getUniqueAgentPatternVarId(ap);
    String _plus = (_uniqueAgentPatternVarId + "_");
    String _name = sp.getSite().getName();
    String _plus_1 = (_plus + _name);
    _builder.append(_plus_1);
    _builder.append("_ILS");
    return _builder.toString();
  }
  
  public String aISSVariableName(final ValidAgentPattern ap, final SitePattern sp) {
    StringConcatenation _builder = new StringConcatenation();
    String _uniqueAgentPatternVarId = this.getUniqueAgentPatternVarId(ap);
    String _plus = (_uniqueAgentPatternVarId + "_");
    String _name = sp.getSite().getName();
    String _plus_1 = (_plus + _name);
    _builder.append(_plus_1);
    _builder.append("_ISS");
    return _builder.toString();
  }
  
  public String getUniqueAgentPatternVarId(final ValidAgentPattern ap) {
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
        Set<String> _get = this.patternVariableNames.get(pattern);
        for (final String e : _get) {
          int _hashCode = ap.hashCode();
          String _plus = ("ID " + Integer.valueOf(_hashCode));
          String _plus_1 = (_plus + " set contains: ");
          String _plus_2 = (_plus_1 + e);
          InputOutput.<String>println(_plus_2);
        }
        this.agentPatternVariables.put(ap, name);
      } else {
        name = ap.getAgent().getName();
        HashSet<String> _hashSet = new HashSet<String>();
        varNameSet = _hashSet;
        varNameSet.add(name);
        this.patternVariableNames.put(pattern, varNameSet);
        this.agentPatternVariables.put(ap, name);
      }
    }
    int _hashCode_1 = ap.hashCode();
    String _plus_3 = ("ID: " + Integer.valueOf(_hashCode_1));
    String _plus_4 = (_plus_3 + ", uName: ");
    String _plus_5 = (_plus_4 + name);
    InputOutput.<String>println(_plus_5);
    return name;
  }
}
