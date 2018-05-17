package patterngenerator;

import biochemsimulation.reactionrules.reactionRules.AgentPattern;
import biochemsimulation.reactionrules.reactionRules.AssignFromPattern;
import biochemsimulation.reactionrules.reactionRules.AssignFromVariable;
import biochemsimulation.reactionrules.reactionRules.Pattern;
import biochemsimulation.reactionrules.reactionRules.PatternAssignment;
import biochemsimulation.reactionrules.reactionRules.Rule;
import biochemsimulation.reactionrules.reactionRules.SitePattern;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtend2.lib.StringConcatenation;

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
        _builder.append(", ");
        String _name_2 = ap_1.getAgent().getName();
        String _plus_2 = ("Agent_" + _name_2);
        String _plus_3 = (_plus_2 + "_Name");
        _builder.append(_plus_3, "\t");
        _builder.append(");");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("check (");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t");
        String _name_3 = ap_1.getAgent().getName();
        String _plus_4 = ("Agent_" + _name_3);
        String _plus_5 = (_plus_4 + "_Name");
        _builder.append(_plus_5, "\t\t\t");
        _builder.append(".matches(\"");
        String _name_4 = ap_1.getAgent().getName();
        _builder.append(_name_4, "\t\t\t");
        _builder.append("\")");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append(");");
        _builder.newLine();
        {
          EList<SitePattern> _sitePatterns = ap_1.getSitePatterns().getSitePatterns();
          for(final SitePattern sp : _sitePatterns) {
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("AgentInstance.linkStates(");
            String _name_5 = ap_1.getAgent().getName();
            _builder.append(_name_5, "\t\t");
            _builder.append(", ");
            String _name_6 = ap_1.getAgent().getName();
            String _plus_6 = (_name_6 + "_");
            String _name_7 = sp.getSite().getName();
            String _plus_7 = (_plus_6 + _name_7);
            _builder.append(_plus_7, "\t\t");
            _builder.append("ILS);");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("AgentInstanceLinkState.site.name(");
            String _name_8 = ap_1.getAgent().getName();
            String _plus_8 = (_name_8 + "_");
            String _name_9 = sp.getSite().getName();
            String _plus_9 = (_plus_8 + _name_9);
            _builder.append(_plus_9, "\t\t");
            _builder.append("ILS, ");
            String _name_10 = ap_1.getAgent().getName();
            String _plus_10 = (_name_10 + "_");
            String _name_11 = sp.getSite().getName();
            String _plus_11 = (_plus_10 + _name_11);
            _builder.append(_plus_11, "\t\t");
            _builder.append("_ILS_name);");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("check (");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("\t\t");
            String _name_12 = ap_1.getAgent().getName();
            String _plus_12 = (_name_12 + "_");
            String _name_13 = sp.getSite().getName();
            String _plus_13 = (_plus_12 + _name_13);
            _builder.append(_plus_13, "\t\t\t\t");
            _builder.append("_ILS_name.matches(\"");
            String _name_14 = sp.getSite().getName();
            _builder.append(_name_14, "\t\t\t\t");
            _builder.append("\")");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("\t");
            _builder.append(");");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("AgentInstanceLinkState.linkState.linkState(");
            String _name_15 = ap_1.getAgent().getName();
            String _plus_14 = (_name_15 + "_");
            String _name_16 = sp.getSite().getName();
            String _plus_15 = (_plus_14 + _name_16);
            _builder.append(_plus_15, "\t\t");
            _builder.append("ILS, ");
            String _name_17 = ap_1.getAgent().getName();
            String _plus_16 = (_name_17 + "_");
            String _name_18 = sp.getSite().getName();
            String _plus_17 = (_plus_16 + _name_18);
            _builder.append(_plus_17, "\t\t");
            _builder.append("_ILS_state);");
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
  
  public String generateAgentPatternContext(final AgentPattern ap) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = ap.getAgent().getName();
    _builder.append(_name);
    _builder.append(": AgentInstance, ");
    String _name_1 = ap.getAgent().getName();
    String _plus = ("Agent_" + _name_1);
    String _plus_1 = (_plus + "_Name");
    _builder.append(_plus_1);
    _builder.append(": java String, ");
    String _generateSitePatternContext = this.generateSitePatternContext(ap);
    _builder.append(_generateSitePatternContext);
    return _builder.toString();
  }
  
  public String generateSitePatternContext(final AgentPattern ap) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<SitePattern> _sitePatterns = ap.getSitePatterns().getSitePatterns();
      boolean _hasElements = false;
      for(final SitePattern sp : _sitePatterns) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(", ", "");
        }
        _builder.append(" ");
        String _name = ap.getAgent().getName();
        String _plus = (_name + "_");
        String _name_1 = sp.getSite().getName();
        String _plus_1 = (_plus + _name_1);
        _builder.append(_plus_1);
        _builder.append("ILS: AgentInstanceLinkState, ");
        String _name_2 = ap.getAgent().getName();
        String _plus_2 = (_name_2 + "_");
        String _name_3 = sp.getSite().getName();
        String _plus_3 = (_plus_2 + _name_3);
        _builder.append(_plus_3);
        _builder.append("_ILS_name: java String, ");
        String _name_4 = ap.getAgent().getName();
        String _plus_4 = (_name_4 + "_");
        String _name_5 = sp.getSite().getName();
        String _plus_5 = (_plus_4 + _name_5);
        _builder.append(_plus_5);
        _builder.append("_ILS_state: ");
        String _name_6 = sp.getLinkState().getLinkState().eClass().getName();
        _builder.append(_name_6);
      }
    }
    return _builder.toString();
  }
  
  /**
   * def generateLinkStateParameter(AgentPattern ap, SitePattern sp) {
   * var param = ap.agent.name+"."+sp.site.name+ ".ILS.state: "
   * val s = sp.linkState.linkState
   * if(s instanceof LimitLink) {
   * val ll = s as LimitLink
   * param  += "java Integer"
   * }else if(s instanceof ExactLink) {
   * 
   * }
   * }
   */
  public Pattern patternFromPatternAssignment(final PatternAssignment pa) {
    if ((pa instanceof AssignFromPattern)) {
      final AssignFromPattern afp = ((AssignFromPattern) pa);
      return afp.getPattern();
    } else {
      final AssignFromVariable afv = ((AssignFromVariable) pa);
      return afv.getPatternVar().getPattern();
    }
  }
}
