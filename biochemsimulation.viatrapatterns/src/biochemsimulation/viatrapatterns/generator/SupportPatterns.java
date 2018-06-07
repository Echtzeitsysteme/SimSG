package biochemsimulation.viatrapatterns.generator;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SupportPatterns {
	
	final public static String PATTERN_SIMLINKSTATE = "support_SimLinkState";
	
	private static SupportPatterns instance;
	
	private Map<String, SupportPatternTemplate> supportPatterns;
	
	private SupportPatterns() {
		supportPatterns = new HashMap<String, SupportPatternTemplate>();
	};
	
	public static synchronized SupportPatterns getInstance() {
		if(instance == null){
            instance = new SupportPatterns();
        }
        return instance;
	}
	
	public Collection<SupportPatternTemplate> getAllSupportPatterns () {
		return supportPatterns.values();
	}
	
	public SupportPatternTemplate getSupportPatternTemplate(String patternName) {
		return supportPatterns.getOrDefault(patternName, null);
	}
	
	public boolean insertSupportPatternTemplate(SupportPatternTemplate patternTemplate) {
		return supportPatterns.putIfAbsent(patternTemplate.getPatternName(), patternTemplate) != null;
	}
	
	public String getSupportPatternCall(String patternName, List<String> args, boolean doUpdate) {
		SupportPatternTemplate pattern =  supportPatterns.getOrDefault(patternName, null);
		if(pattern == null) {
			return "";
		}else {
			return pattern.getPatternCall(args, doUpdate);
		}
	}
}
