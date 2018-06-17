package biochemsimulation.viatrapatterns.generator;

import biochemsimulation.reactionrules.reactionRules.AssignFromPattern;
import biochemsimulation.reactionrules.reactionRules.AssignFromVariable;
import biochemsimulation.reactionrules.reactionRules.Pattern;
import biochemsimulation.reactionrules.reactionRules.PatternAssignment;
import biochemsimulation.reactionrules.reactionRules.ReactionProperty;
import biochemsimulation.reactionrules.reactionRules.ReactionRuleModel;
import biochemsimulation.reactionrules.reactionRules.Rule;
import biochemsimulation.viatrapatterns.generator.AgentPatternViatraTemplate;
import biochemsimulation.viatrapatterns.generator.PatternViatraTemplate;
import biochemsimulation.viatrapatterns.generator.SitePatternViatraTemplate;
import biochemsimulation.viatrapatterns.generator.SupportPatternTemplate;
import biochemsimulation.viatrapatterns.generator.SupportPatterns;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class PatternTemplate {
  public final static String PATTERN_NAME_SUFFIX_RHS = "_rhs";
  
  public final static String PATTERN_NAME_SUFFIX_LHS = "_lhs";
  
  public final static String RULE_OPERATOR_UNI = "->";
  
  public final static String RULE_OPERATOR_BI = "<->";
  
  private LinkedHashMap<EPackage, String> importAliases;
  
  private List<Rule> rules;
  
  private List<PatternViatraTemplate> patternTemplates;
  
  public PatternTemplate(final LinkedHashMap<EPackage, String> importAliases, final ReactionRuleModel model) {
    this.importAliases = importAliases;
    LinkedList<Rule> _linkedList = new LinkedList<Rule>();
    this.rules = _linkedList;
    final Function1<ReactionProperty, Boolean> _function = (ReactionProperty x) -> {
      return Boolean.valueOf((x instanceof Rule));
    };
    final Consumer<ReactionProperty> _function_1 = (ReactionProperty x) -> {
      this.rules.add(((Rule) x));
    };
    IterableExtensions.<ReactionProperty>filter(model.getReactionProperties(), _function).forEach(_function_1);
    this.initSupportPatterns();
    this.initPatternTemplates();
  }
  
  public boolean initSupportPatterns() {
    boolean _xblockexpression = false;
    {
      final SupportPatterns sPatterns = SupportPatterns.getInstance();
      final SupportPatternTemplate sPattern = new SupportPatternTemplate(SupportPatterns.PATTERN_SIMLINKSTATE);
      sPattern.addArgument("ss", SitePatternViatraTemplate.TYPE_SIMSITE);
      final String ref = ((SitePatternViatraTemplate.TYPE_SIMSITE + AgentPatternViatraTemplate.OP_REFERENCE) + SitePatternViatraTemplate.ATTR_SIMLINKSTATE);
      sPattern.addConstraint(ref, "ss", SitePatternViatraTemplate.OP_WILDCARD);
      sPattern.updateSupportPattern();
      _xblockexpression = sPatterns.insertSupportPatternTemplate(sPattern);
    }
    return _xblockexpression;
  }
  
  public List<PatternViatraTemplate> initPatternTemplates() {
    List<PatternViatraTemplate> _xblockexpression = null;
    {
      LinkedList<PatternViatraTemplate> _linkedList = new LinkedList<PatternViatraTemplate>();
      this.patternTemplates = _linkedList;
      final Consumer<Rule> _function = (Rule x) -> {
        String _name = x.getName();
        String _plus = (_name + PatternTemplate.PATTERN_NAME_SUFFIX_LHS);
        Pattern _patternFromPatternAssignment = this.patternFromPatternAssignment(x.getRule().getLhs());
        PatternViatraTemplate _patternViatraTemplate = new PatternViatraTemplate(_plus, _patternFromPatternAssignment);
        this.patternTemplates.add(_patternViatraTemplate);
        boolean _equals = x.getRule().getOperator().equals(PatternTemplate.RULE_OPERATOR_BI);
        if (_equals) {
          String _name_1 = x.getName();
          String _plus_1 = (_name_1 + PatternTemplate.PATTERN_NAME_SUFFIX_RHS);
          Pattern _patternFromPatternAssignment_1 = this.patternFromPatternAssignment(x.getRule().getRhs());
          PatternViatraTemplate _patternViatraTemplate_1 = new PatternViatraTemplate(_plus_1, _patternFromPatternAssignment_1);
          this.patternTemplates.add(_patternViatraTemplate_1);
        }
      };
      this.rules.forEach(_function);
      final Function1<PatternViatraTemplate, Boolean> _function_1 = (PatternViatraTemplate x) -> {
        return Boolean.valueOf((!x.isVoidPattern));
      };
      _xblockexpression = this.patternTemplates = IterableExtensions.<PatternViatraTemplate>toList(IterableExtensions.<PatternViatraTemplate>filter(this.patternTemplates, _function_1));
    }
    return _xblockexpression;
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
      Collection<SupportPatternTemplate> _allSupportPatterns = SupportPatterns.getInstance().getAllSupportPatterns();
      boolean _hasElements = false;
      for(final SupportPatternTemplate supPattern : _allSupportPatterns) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate("\n", "");
        }
        String _supportPattern = supPattern.getSupportPattern(false);
        _builder.append(_supportPattern);
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    {
      boolean _hasElements_1 = false;
      for(final PatternViatraTemplate pT : this.patternTemplates) {
        if (!_hasElements_1) {
          _hasElements_1 = true;
        } else {
          _builder.appendImmediate("\n", "");
        }
        _builder.append("pattern ");
        String _patternName = pT.getPatternName();
        _builder.append(_patternName);
        _builder.append("(");
        {
          List<String> _patternArgumentList = pT.getPatternArgumentList();
          boolean _hasElements_2 = false;
          for(final String arg : _patternArgumentList) {
            if (!_hasElements_2) {
              _hasElements_2 = true;
            } else {
              _builder.appendImmediate(", ", "");
            }
            _builder.append(" ");
            _builder.append(arg);
          }
        }
        _builder.append(") {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        {
          List<String> _patternBody = pT.getPatternBody();
          boolean _hasElements_3 = false;
          for(final String body : _patternBody) {
            if (!_hasElements_3) {
              _hasElements_3 = true;
            } else {
              _builder.appendImmediate("\n", "\t");
            }
            _builder.append(" ");
            _builder.append(body, "\t");
          }
        }
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        {
          List<String> _injectivityConstraints = pT.getInjectivityConstraints();
          boolean _hasElements_4 = false;
          for(final String injConst : _injectivityConstraints) {
            if (!_hasElements_4) {
              _hasElements_4 = true;
            } else {
              _builder.appendImmediate("\n", "\t");
            }
            _builder.append(" ");
            _builder.append(injConst, "\t");
          }
        }
        _builder.newLineIfNotEmpty();
        _builder.append("}");
        _builder.newLine();
      }
    }
    return _builder.toString();
  }
}
