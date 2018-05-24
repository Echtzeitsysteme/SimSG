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
import biochemsimulation.reactionrules.reactionRules.WhatEver;
import java.util.Collection;
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
  
  public PatternTemplate(final LinkedHashMap<EPackage, String> importAliases) {
    this.importAliases = importAliases;
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
      for(final Rule r : rules) {
        String _generatePatternCode = this.generatePatternCode(r, this.patternFromPatternAssignment(r.getRule().getLhs()), "lhs");
        _builder.append(_generatePatternCode);
        _builder.newLineIfNotEmpty();
        String _generatePatternCode_1 = this.generatePatternCode(r, this.patternFromPatternAssignment(r.getRule().getRhs()), "rhs");
        _builder.append(_generatePatternCode_1);
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder.toString();
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
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("pattern ");
    String _name = rule.getName();
    String _plus = (_name + "_");
    String _plus_1 = (_plus + suffix);
    _builder.append(_plus_1);
    _builder.append("(");
    {
      EList<AgentPattern> _agentPatterns = pattern.getAgentPatterns();
      boolean _hasElements = false;
      for(final AgentPattern ap : _agentPatterns) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(", ", "");
        }
        _builder.append(" ");
        String _generateAgentPatternContext = this.generateAgentPatternContext(ap);
        _builder.append(_generateAgentPatternContext);
      }
    }
    _builder.append(") {");
    _builder.newLineIfNotEmpty();
    {
      EList<AgentPattern> _agentPatterns_1 = pattern.getAgentPatterns();
      for(final AgentPattern ap_1 : _agentPatterns_1) {
        _builder.append("\t");
        _builder.append("AgentInstance.agent.name(");
        String _name_1 = ap_1.getAgent().getName();
        _builder.append(_name_1, "\t");
        _builder.append(", \"");
        String _name_2 = ap_1.getAgent().getName();
        _builder.append(_name_2, "\t");
        _builder.append("\");");
        _builder.newLineIfNotEmpty();
        {
          EList<SitePattern> _sitePatterns = ap_1.getSitePatterns().getSitePatterns();
          for(final SitePattern sp : _sitePatterns) {
            _builder.append("\t");
            _builder.append("AgentInstance.linkStates(");
            String _name_3 = ap_1.getAgent().getName();
            _builder.append(_name_3, "\t");
            _builder.append(", ");
            String _aILSVariableName = this.aILSVariableName(ap_1, sp);
            _builder.append(_aILSVariableName, "\t");
            _builder.append(");");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("AgentInstanceLinkState.site.name(");
            String _aILSVariableName_1 = this.aILSVariableName(ap_1, sp);
            _builder.append(_aILSVariableName_1, "\t");
            _builder.append(", \"");
            String _name_4 = sp.getSite().getName();
            _builder.append(_name_4, "\t");
            _builder.append("\");");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            String _linkStatePattern = this.linkStatePattern(ap_1, sp);
            _builder.append(_linkStatePattern, "\t");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.append("\t");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
  
  public String linkStatePattern(final AgentPattern ap, final SitePattern sp) {
    LinkState _linkState = sp.getLinkState().getLinkState();
    final LinkState linkState = ((LinkState) _linkState);
    if ((linkState instanceof FreeLink)) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("AgentInstanceLinkState.linkState.linkState(");
      String _aILSVariableName = this.aILSVariableName(ap, sp);
      _builder.append(_aILSVariableName);
      _builder.append(", ");
      String _name = ap.getAgent().getName();
      _builder.append(_name);
      _builder.append("_");
      String _name_1 = sp.getSite().getName();
      _builder.append(_name_1);
      _builder.append("_FL);");
      _builder.newLineIfNotEmpty();
      _builder.append("FreeLink(");
      String _name_2 = ap.getAgent().getName();
      _builder.append(_name_2);
      _builder.append("_");
      String _name_3 = sp.getSite().getName();
      _builder.append(_name_3);
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
        String _name_4 = ap.getAgent().getName();
        _builder_1.append(_name_4);
        _builder_1.append("_");
        String _name_5 = sp.getSite().getName();
        _builder_1.append(_name_5);
        _builder_1.append("_SL);");
        _builder_1.newLineIfNotEmpty();
        _builder_1.append("SemiLink(");
        String _name_6 = ap.getAgent().getName();
        _builder_1.append(_name_6);
        _builder_1.append("_");
        String _name_7 = sp.getSite().getName();
        _builder_1.append(_name_7);
        _builder_1.append("_SL);");
        _builder_1.newLineIfNotEmpty();
        return _builder_1.toString();
      } else {
        if ((linkState instanceof WhatEver)) {
          StringConcatenation _builder_2 = new StringConcatenation();
          _builder_2.append("AgentInstanceLinkState.linkState.linkState(");
          String _aILSVariableName_2 = this.aILSVariableName(ap, sp);
          _builder_2.append(_aILSVariableName_2);
          _builder_2.append(", ");
          String _name_8 = ap.getAgent().getName();
          _builder_2.append(_name_8);
          _builder_2.append("_");
          String _name_9 = sp.getSite().getName();
          _builder_2.append(_name_9);
          _builder_2.append("_WEL);");
          _builder_2.newLineIfNotEmpty();
          _builder_2.append("WhatEver(");
          String _name_10 = ap.getAgent().getName();
          _builder_2.append(_name_10);
          _builder_2.append("_");
          String _name_11 = sp.getSite().getName();
          _builder_2.append(_name_11);
          _builder_2.append("_WEL);");
          _builder_2.newLineIfNotEmpty();
          return _builder_2.toString();
        } else {
          if ((linkState instanceof ExactLink)) {
            StringConcatenation _builder_3 = new StringConcatenation();
            _builder_3.append("AgentInstanceLinkState.linkState.linkState(");
            String _aILSVariableName_3 = this.aILSVariableName(ap, sp);
            _builder_3.append(_aILSVariableName_3);
            _builder_3.append(", ");
            String _name_12 = ap.getAgent().getName();
            _builder_3.append(_name_12);
            _builder_3.append("_");
            String _name_13 = sp.getSite().getName();
            _builder_3.append(_name_13);
            _builder_3.append("_EL);");
            _builder_3.newLineIfNotEmpty();
            _builder_3.append("WhatEver(");
            String _name_14 = ap.getAgent().getName();
            _builder_3.append(_name_14);
            _builder_3.append("_");
            String _name_15 = sp.getSite().getName();
            _builder_3.append(_name_15);
            _builder_3.append("_EL);");
            _builder_3.newLineIfNotEmpty();
            return _builder_3.toString();
          } else {
            StringConcatenation _builder_4 = new StringConcatenation();
            _builder_4.append("AgentInstanceLinkState.site(");
            String _aILSVariableName_4 = this.aILSVariableName(ap, sp);
            _builder_4.append(_aILSVariableName_4);
            _builder_4.append(", ");
            String _name_16 = ap.getAgent().getName();
            _builder_4.append(_name_16);
            _builder_4.append("_");
            String _name_17 = sp.getSite().getName();
            _builder_4.append(_name_17);
            _builder_4.append("_IL);");
            _builder_4.newLineIfNotEmpty();
            _builder_4.append("AgentInstanceLinkState.attachedSite(");
            String _aILSVariableName_5 = this.aILSVariableName(ap, sp);
            _builder_4.append(_aILSVariableName_5);
            _builder_4.append(", ");
            String _otherIndexedLinkSite = this.getOtherIndexedLinkSite(ap, sp);
            _builder_4.append(_otherIndexedLinkSite);
            _builder_4.append(");");
            _builder_4.newLineIfNotEmpty();
            _builder_4.append("AgentInstanceLinkState.attachedAgentInstance(");
            String _aILSVariableName_6 = this.aILSVariableName(ap, sp);
            _builder_4.append(_aILSVariableName_6);
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
  
  public String getOtherIndexedLinkAgent(final AgentPattern ap, final SitePattern sp) {
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
          AgentPattern agentPattern = ((AgentPattern) null);
          SitePattern sitePattern = ((SitePattern) null);
          EObject eObj2 = candidate.eContainer();
          while (((!(eObj2 instanceof SitePattern)) && (eObj2 != null))) {
            eObj2 = eObj2.eContainer();
          }
          if ((eObj2 instanceof SitePattern)) {
            sitePattern = ((SitePattern) eObj2);
          }
          while (((!(eObj2 instanceof AgentPattern)) && (eObj2 != null))) {
            eObj2 = eObj2.eContainer();
          }
          if ((eObj2 instanceof AgentPattern)) {
            agentPattern = ((AgentPattern) eObj2);
          }
          if (((agentPattern != null) && (sitePattern != null))) {
            StringConcatenation _builder = new StringConcatenation();
            String _name = agentPattern.getAgent().getName();
            _builder.append(_name);
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
        InputOutput.<String>println(cand.toString());
        final IndexedLink candidate = ((IndexedLink) cand);
        if (((!candidate.equals(iLink)) && iLink.getState().equals(candidate.getState()))) {
          AgentPattern agentPattern = ((AgentPattern) null);
          SitePattern sitePattern = ((SitePattern) null);
          EObject eObj2 = candidate.eContainer();
          while (((!(eObj2 instanceof SitePattern)) && (eObj2 != null))) {
            eObj2 = eObj2.eContainer();
          }
          if ((eObj2 instanceof SitePattern)) {
            sitePattern = ((SitePattern) eObj2);
          }
          while (((!(eObj2 instanceof AgentPattern)) && (eObj2 != null))) {
            eObj2 = eObj2.eContainer();
          }
          if ((eObj2 instanceof AgentPattern)) {
            agentPattern = ((AgentPattern) eObj2);
          }
          if (((agentPattern != null) && (sitePattern != null))) {
            StringConcatenation _builder = new StringConcatenation();
            String _name = agentPattern.getAgent().getName();
            _builder.append(_name);
            _builder.append("_");
            String _name_1 = sitePattern.getSite().getName();
            _builder.append(_name_1);
            _builder.append("_IL");
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
      SitePatterns _sitePatterns = aPattern.getSitePatterns();
      boolean _tripleNotEquals_2 = (_sitePatterns != null);
      if (_tripleNotEquals_2) {
        sitePatterns.addAll(aPattern.getSitePatterns().getSitePatterns());
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
  
  public String generateAgentPatternContext(final AgentPattern ap) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = ap.getAgent().getName();
    _builder.append(_name);
    _builder.append(": AgentInstance");
    return _builder.toString();
  }
  
  public String aILSVariableName(final AgentPattern ap, final SitePattern sp) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = ap.getAgent().getName();
    String _plus = (_name + "_");
    String _name_1 = sp.getSite().getName();
    String _plus_1 = (_plus + _name_1);
    _builder.append(_plus_1);
    _builder.append("_ILS");
    return _builder.toString();
  }
}
