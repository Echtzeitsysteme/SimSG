package biochemsimulation.simulation.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.Collection;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import biochemsimulation.reactioncontainer.ReactionContainer;
import biochemsimulation.reactionrules.reactionRules.ReactionRuleModel;
import biochemsimulation.simulation.matching.IMatch;
import biochemsimulation.simulation.matching.PatternMatchingEngine;
import biochemsimulation.simulation.matching.PatternMatchingEngineEnum;
import biochemsimulation.simulation.matching.PatternMatchingEngineFactory;
import biochemsimulation.simulation.persistence.PersistenceManager;
import biochemsimulation.simulation.persistence.PersistenceManagerEnum;
import biochemsimulation.simulation.persistence.PersistenceManagerFactory;
import biochemsimulation.simulation.pmc.PatternMatchingController;
import biochemsimulation.simulation.pmc.PatternMatchingControllerEnum;
import biochemsimulation.simulation.pmc.PatternMatchingControllerFactory;
import biochemsimulation.simulation.pmc.GT.ReactionRuleTransformer;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class GraphTransfromEGFScenarioTest {

	protected PersistenceManagerEnum persistenceType;
	protected PersistenceManager persistence;
	
	protected ReactionRuleModel ruleModel;
	protected ReactionContainer containerModel;
	protected PatternMatchingController pmc;
	
	protected PatternMatchingEngineEnum engineType;
	protected PatternMatchingControllerEnum pmcType;
	
	protected ReactionRuleTransformer gt;
	
	public GraphTransfromEGFScenarioTest() {
		persistenceType = PersistenceManagerEnum.SimplePersistence;
		persistence = PersistenceManagerFactory.create(persistenceType);
		persistence.init();
		engineType = PatternMatchingEngineEnum.ViatraEngine;
		pmcType = PatternMatchingControllerEnum.SimplePMC;
	}
	
	@BeforeAll
	void beforeAllTest() throws Exception {
		PatternMatchingEngine engine = PatternMatchingEngineFactory.create(engineType);
		pmc = PatternMatchingControllerFactory.create(pmcType);
		pmc.setEngine(engine);
		ruleModel = persistence.loadReactionRuleModel("EGF_Pathway_test1");
		containerModel = persistence.loadReactionContainerModel("EGF_Pathway_test1");
		pmc.loadModels(ruleModel, containerModel);
		pmc.initEngine();
		pmc.initController();
		gt = new ReactionRuleTransformer(pmc.getPatternContainer(), containerModel);
		gt.init();
	}
	
	@AfterAll
	void afterAllTest() throws Exception {
		pmc.discardEngine();
		persistence.unloadReactionContainerModel("EGF_Pathway_test1");
	}
	
	private void collectPatternMatches(String pattern) {
		try {
			pmc.collectMatches(pattern);
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}
	
	private void collectRuleMatches(String lhs, String rhs) {
		collectPatternMatches(lhs);
		collectPatternMatches(rhs);
	}
	
	private IMatch getLhsAndCheckMatches(String lhs, String rhs, int lhsCount, int rhsCount) {
		Collection<IMatch> lhsMatches = pmc.getMatches(lhs);
		pmc.getMatches(rhs);
		assertEquals(lhsCount, pmc.getMatchCount(lhs), "Number of lhs matches weren't equal!");
		assertEquals(rhsCount, pmc.getMatchCount(rhs), "Number of rhs matches weren't equal!");
		return lhsMatches.iterator().next();
	}
	
	private IMatch getRhsAndCheckMatches(String lhs, String rhs, int lhsCount, int rhsCount) {
		pmc.getMatches(lhs);
		Collection<IMatch> rhsMatches = pmc.getMatches(rhs);
		assertEquals(lhsCount, pmc.getMatchCount(lhs), "Number of lhs matches weren't equal!");
		assertEquals(rhsCount, pmc.getMatchCount(rhs), "Number of rhs matches weren't equal!");
		return rhsMatches.iterator().next();
	}
	
	void fwdRuleApplication(String rule, int lhsPre, int lhsPost, int rhsPre, int rhsPost) {
		String lhs = rule+"_lhs";
		String rhs = rule+"_rhs";
		collectRuleMatches(lhs, rhs);
		IMatch lhsMatch = getLhsAndCheckMatches(lhs, rhs, lhsPre, rhsPre);
		gt.applyRuleToMatch(lhsMatch, lhs);
		// check result
		collectRuleMatches(lhs, rhs);
		getRhsAndCheckMatches(lhs, rhs, lhsPost, rhsPost);
	}
	
	void bwdRuleApplication(String rule, int lhsPre, int lhsPost, int rhsPre, int rhsPost) {
		String lhs = rule+"_lhs";
		String rhs = rule+"_rhs";
		collectRuleMatches(lhs, rhs);
		IMatch rhsMatch = getRhsAndCheckMatches(lhs, rhs, lhsPost, rhsPost);
		gt.applyRuleToMatch(rhsMatch, rhs);
		// check result
		collectRuleMatches(lhs, rhs);
		getLhsAndCheckMatches(lhs, rhs, lhsPre, rhsPre);
		
	}
	
	void neutralRuleApplication(String rule, int lhsPre, int lhsPost, int rhsPre, int rhsPost) {
		fwdRuleApplication(rule, lhsPre, lhsPost, rhsPre, rhsPost);
		bwdRuleApplication(rule, lhsPre, lhsPost, rhsPre, rhsPost);
	}
	
	/* Helper Methods..*/
	void fromEGFto2xEGFR_FWD() {
		fwdRuleApplication("EGF_EGFR", 36, 25, 0, 1);
		fwdRuleApplication("EGF_EGFR", 25, 16, 1, 2);
	}
	
	void fromEGFto2xEGFR_BWD() {
		bwdRuleApplication("EGF_EGFR", 25, 16, 1, 2);
		bwdRuleApplication("EGF_EGFR", 36, 25, 0, 1);
	}
	
	void fromEGFtoEGFR_EGFR_FWD() {
		fromEGFto2xEGFR_FWD();
		fwdRuleApplication("EGFR_EGFR", 2, 0, 0, 2);
	}
	
	void fromEGFtoEGFR_EGFR_BWD() {
		bwdRuleApplication("EGFR_EGFR", 2, 0, 0, 2);
		fromEGFto2xEGFR_BWD();
	}
	
	void fromEGFtoEGFR_EGFR_at_992_FWD() {
		fromEGFtoEGFR_EGFR_FWD();
		fwdRuleApplication("EGFR_at_992", 2, 1, 0, 1);
	}
	
	void fromEGFtoEGFR_EGFR_at_1068_FWD() {
		fromEGFtoEGFR_EGFR_FWD();
		fwdRuleApplication("EGFR_at_1068", 2, 1, 0, 1);
	}
	
	void fromEGFtoEGFR_EGFR_at_1148_FWD() {
		fromEGFtoEGFR_EGFR_FWD();
		fwdRuleApplication("EGFR_at_1148", 2, 1, 0, 1);
	}
	
	void fromEGFtoEGFR_EGFR_at_992_BWD() {
		bwdRuleApplication("EGFR_at_992", 2, 1, 0, 1);
		fromEGFtoEGFR_EGFR_BWD();
	}
	
	void fromEGFtoEGFR_EGFR_at_1068_BWD() {
		bwdRuleApplication("EGFR_at_1068", 2, 1, 0, 1);
		fromEGFtoEGFR_EGFR_BWD();
	}
	
	void fromEGFtoEGFR_EGFR_at_1148_BWD() {
		bwdRuleApplication("EGFR_at_1148", 2, 1, 0, 1);
		fromEGFtoEGFR_EGFR_BWD();
	}
	
	/* Actual Test Cases */
	@Test
	void EGF_EGFR_Test() {
		neutralRuleApplication("EGF_EGFR", 36, 25, 0, 1);
	}
	
	@Test
	void EGFR_EGFR_Test() {
		fromEGFto2xEGFR_FWD();
		neutralRuleApplication("EGFR_EGFR", 2, 0, 0, 2);
		fromEGFto2xEGFR_BWD();
	}
	
	@Test
	void EGFR_at_x_Test() {
		fromEGFtoEGFR_EGFR_FWD();
		neutralRuleApplication("EGFR_at_992", 2, 1, 0, 1);
		neutralRuleApplication("EGFR_at_1068", 2, 1, 0, 1);
		neutralRuleApplication("EGFR_at_1148", 2, 1, 0, 1);
		fromEGFtoEGFR_EGFR_BWD();
	}
	
	@Test
	void EGFR_at_x_op_Test() {
		fromEGFtoEGFR_EGFR_at_992_FWD();
		neutralRuleApplication("_992_op", 1, 0, 5, 6);
		fromEGFtoEGFR_EGFR_at_992_BWD();
		
		fromEGFtoEGFR_EGFR_at_1068_FWD();
		neutralRuleApplication("_1068_op", 1, 0, 5, 6);
		fromEGFtoEGFR_EGFR_at_1068_BWD();
		
		fromEGFtoEGFR_EGFR_at_1148_FWD();
		neutralRuleApplication("_1148_op", 1, 0, 5, 6);
		fromEGFtoEGFR_EGFR_at_1148_BWD();
	}
	
	@Test
	void int_monomer_Test() {
		fromEGFto2xEGFR_FWD();
		neutralRuleApplication("int_monomer", 2, 1, 0, 1);
		fromEGFto2xEGFR_BWD();
	}
	
	@Test
	void int_dimer_Test() {
		fromEGFtoEGFR_EGFR_FWD();
		neutralRuleApplication("int_dimer", 2, 0, 0, 2);
		fromEGFtoEGFR_EGFR_BWD();
	}
}
