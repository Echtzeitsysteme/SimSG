package SimSG.Test.GT;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.Collection;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import SimSG.Container.Container;
import SimSG.Core.GT.ReactionRuleTransformer;
import SimSG.Core.PM.Match.IMatch;
import SimSG.Core.PM.Match.PatternMatchingEngine;
import SimSG.Core.PM.Match.PatternMatchingEngineEnum;
import SimSG.Core.PM.Match.PatternMatchingEngineFactory;
import SimSG.Core.PMC.PatternMatchingController;
import SimSG.Core.PMC.PatternMatchingControllerEnum;
import SimSG.Core.PMC.PatternMatchingControllerFactory;
import SimSG.Core.Persistence.PersistenceManager;
import SimSG.Core.Persistence.PersistenceManagerEnum;
import SimSG.Core.Persistence.PersistenceManagerFactory;
import biochemsimulation.reactionrules.reactionRules.ReactionRuleModel;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class GraphTransfromEGFScenarioTest {

	protected PersistenceManagerEnum persistenceType;
	protected PersistenceManager persistence;
	
	protected ReactionRuleModel ruleModel;
	protected Container containerModel;
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
		gt = new ReactionRuleTransformer(pmc.getPatternContainer(), containerModel, pmc.getEPackageWrapper());
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
	
	void fromEGFtoEGF_EGFR_monomer_FWD() {
		fromEGFto2xEGFR_FWD();
		fwdRuleApplication("int_monomer", 2, 1, 0, 1);
	}
	
	void fromEGFtoEGF_EGFR_monomer_BWD() {
		bwdRuleApplication("int_monomer", 2, 1, 0, 1);
		fromEGFto2xEGFR_BWD();
	}
	
	void fromEGFtoEGFR_EGFR_dimer_FWD() {
		fromEGFtoEGFR_EGFR_FWD();
		fwdRuleApplication("int_dimer", 2, 0, 0, 2);
	}
	
	void fromEGFtoEGFR_EGFR_dimer_BWD() {
		bwdRuleApplication("int_dimer", 2, 0, 0, 2);
		fromEGFtoEGFR_EGFR_BWD();
	}
	
	void fromEGFtoEGF_EGFR_monomer_op_FWD() {
		fromEGFtoEGF_EGFR_monomer_FWD();
		fwdRuleApplication("EGF_EGFR_op", 1, 0, 0, 1);
	}
	
	void fromEGFtoEGF_EGFR_monomer_op_BWD() {
		bwdRuleApplication("EGF_EGFR_op", 1, 0, 0, 1);
		fromEGFtoEGF_EGFR_monomer_BWD();
	}
	
	void fromEGFtoEGFR_EGFR_dimer_op_FWD() {
		fromEGFtoEGFR_EGFR_dimer_FWD();
		fwdRuleApplication("EGFR_EGFR_op", 2, 0, 0, 2);
	}
	
	void fromEGFtoEGFR_EGFR_dimer_op_BWD() {
		bwdRuleApplication("EGFR_EGFR_op", 2, 0, 0, 2);
		fromEGFtoEGFR_EGFR_dimer_BWD();
	}
	
	void to_Shc_at_318_FWD() {
		fromEGFtoEGFR_EGFR_at_1148_FWD();
		fwdRuleApplication("EGFR_Shc", 2, 0, 0, 1);
		fwdRuleApplication("Shc_at_318", 1, 0, 0, 1);
	}
	
	void to_Shc_at_318_BWD() {
		bwdRuleApplication("Shc_at_318", 1, 0, 0, 1);
		bwdRuleApplication("EGFR_Shc", 2, 0, 0, 1);
		fromEGFtoEGFR_EGFR_at_1148_BWD();
	}
	
	void to_Shc_Grb2_FWD() {
		to_Shc_at_318_FWD();
		fwdRuleApplication("Shc_Grb2", 2, 0, 0, 1);
	}
	
	void to_Shc_Grb2_BWD() {
		bwdRuleApplication("Shc_Grb2", 2, 0, 0, 1);
		to_Shc_at_318_BWD();
	}
	
	void to_EGFR_Grb2_FWD() {
		fromEGFtoEGFR_EGFR_at_1068_FWD();
		fwdRuleApplication("EGFR_Grb2", 2, 0, 0, 1);
	}
	
	void to_EGFR_Grb2_BWD() {
		bwdRuleApplication("EGFR_Grb2", 2, 0, 0, 1);
		fromEGFtoEGFR_EGFR_at_1068_BWD();
	}
	
	void to_long_arm_SoS_Ras_FWD() {
		to_Shc_Grb2_FWD();
		fwdRuleApplication("long_arm_SoS_Ras", 1, 0, 0, 1);
	}
	
	void to_long_arm_SoS_Ras_BWD() {
		bwdRuleApplication("long_arm_SoS_Ras", 1, 0, 0, 1);
		to_Shc_Grb2_BWD();
	}
	
	void to_EGFR_RasGAP_FWD() {
		fromEGFtoEGFR_EGFR_at_992_FWD();
		fwdRuleApplication("EGFR_RasGAP", 2, 0, 0, 1);
	}
	
	void to_EGFR_RasGAP_BWD() {
		bwdRuleApplication("EGFR_RasGAP", 2, 0, 0, 1);
		fromEGFtoEGFR_EGFR_at_992_BWD();
	}
	
	void to_direct_RasGap_Ras_FWD() {
		fwdRuleApplication("EGF_EGFR", 36, 25, 0, 1);
		fwdRuleApplication("EGF_EGFR", 25, 16, 1, 2);
		fwdRuleApplication("EGF_EGFR", 16, 9, 2, 3);
		fwdRuleApplication("EGF_EGFR", 9, 4, 3, 4);
		
		fwdRuleApplication("EGFR_EGFR", 12, 2, 0, 2);
		fwdRuleApplication("EGFR_EGFR", 2, 0, 2, 4);
		
		fwdRuleApplication("EGFR_at_992", 4, 3, 0, 1);
		fwdRuleApplication("EGFR_at_1148", 4, 3, 0, 1);
		
		fwdRuleApplication("EGFR_Shc", 2, 0, 0, 1);
		fwdRuleApplication("Shc_at_318", 1, 0, 0, 1);
		fwdRuleApplication("Shc_Grb2", 2, 0, 0, 1);
		fwdRuleApplication("long_arm_SoS_Ras", 1, 0, 0, 1);
		fwdRuleApplication("Ras_GTP", 1, 0, 0, 1);
		fwdRuleApplication("SoS_Ras_op", 1, 0, 0, 2);
		
		fwdRuleApplication("EGFR_RasGAP", 2, 0, 0, 1);
		fwdRuleApplication("direct_RasGap_Ras", 1, 0, 0, 1);
	}
	
	void to_direct_RasGap_Ras_BWD() {
		bwdRuleApplication("direct_RasGap_Ras", 1, 0, 0, 1);
		bwdRuleApplication("EGFR_RasGAP", 2, 0, 0, 1);
		
		bwdRuleApplication("SoS_Ras_op", 1, 0, 0, 2);
		bwdRuleApplication("Ras_GTP", 1, 0, 0, 1);
		bwdRuleApplication("long_arm_SoS_Ras", 1, 0, 0, 1);
		bwdRuleApplication("Shc_Grb2", 2, 0, 0, 1);
		bwdRuleApplication("Shc_at_318", 1, 0, 0, 1);
		bwdRuleApplication("EGFR_Shc", 2, 0, 0, 1);
		
		bwdRuleApplication("EGFR_at_1148", 4, 3, 0, 1);
		bwdRuleApplication("EGFR_at_992", 4, 3, 0, 1);
		
		bwdRuleApplication("EGFR_EGFR", 2, 0, 2, 4);
		bwdRuleApplication("EGFR_EGFR", 12, 2, 0, 2);
		
		bwdRuleApplication("EGF_EGFR", 9, 4, 3, 4);
		bwdRuleApplication("EGF_EGFR", 16, 9, 2, 3);
		bwdRuleApplication("EGF_EGFR", 25, 16, 1, 2);
		bwdRuleApplication("EGF_EGFR", 36, 25, 0, 1);
	}
	
	void to_Ras_GDP_FWD() {
		to_direct_RasGap_Ras_FWD();
		fwdRuleApplication("Ras_GDP", 1, 0, 0, 1);
	}
	
	void to_Ras_GDP_BWD() {
		bwdRuleApplication("Ras_GDP", 1, 0, 0, 1);
		to_direct_RasGap_Ras_BWD();
	}
	
	void to_RasGAP_Ras_op_FWD() {
		to_Ras_GDP_FWD();
		fwdRuleApplication("RasGAP_Ras_op", 1, 0, 1, 2);
	}
	
	void to_RasGAP_Ras_op_BWD() {
		bwdRuleApplication("RasGAP_Ras_op", 1, 0, 1, 2);
		to_Ras_GDP_BWD();
	}
	
	void to_RasGTP_free_FWD() {
		to_long_arm_SoS_Ras_FWD();
		fwdRuleApplication("Ras_GTP", 1, 0, 0, 1);
		fwdRuleApplication("SoS_Ras_op", 1, 0, 0, 2);
	}
	
	void to_RasGTP_free_BWD() {
		bwdRuleApplication("SoS_Ras_op", 1, 0, 0, 2);
		bwdRuleApplication("Ras_GTP", 1, 0, 0, 1);
		to_long_arm_SoS_Ras_BWD();
	}
	
	void to_Ras_Raf_FWD() {
		to_RasGTP_free_FWD();
		fwdRuleApplication("Ras_Raf", 1, 0, 0, 1);
	}
	
	void to_Ras_Raf_BWD() {
		bwdRuleApplication("Ras_Raf", 1, 0, 0, 1);
		to_RasGTP_free_BWD();
	}
	
	void to_Ras_Raf_op_FWD() {
		to_Ras_Raf_FWD();
		fwdRuleApplication("Ras_Raf_op", 1, 0, 0, 1);
	}
	
	void to_Ras_Raf_op_BWD() {
		bwdRuleApplication("Ras_Raf_op", 1, 0, 0, 1);
		to_Ras_Raf_BWD();
	}
	
	void to_Raf_active_FWD() {
		to_Ras_Raf_FWD();
		fwdRuleApplication("Raf", 1, 0, 0, 1);
		fwdRuleApplication("Ras_Raf_op", 1, 0, 0, 1);
	}
	
	void to_Raf_active_BWD() {
		bwdRuleApplication("Ras_Raf_op", 1, 0, 0, 1);
		bwdRuleApplication("Raf", 1, 0, 0, 1);
		to_Ras_Raf_BWD();
	}
	
	void to_PP2A1_Raf_FWD() {
		to_Raf_active_FWD();
		fwdRuleApplication("PP2A1_Raf", 1, 0, 0, 1);
	}
	
	void to_PP2A1_Raf_BWD() {
		bwdRuleApplication("PP2A1_Raf", 1, 0, 0, 1);
		to_Raf_active_BWD();
	}
	
	void to_MEK_active_free_FWD() {
		to_Raf_active_FWD();
		fwdRuleApplication("Raf_MEK_at_222", 1, 0, 0, 1);
		fwdRuleApplication("MEK_at_222", 1, 0, 0, 1);
		fwdRuleApplication("Raf_MEK_at_222_op", 1, 0, 0, 1);
		fwdRuleApplication("Raf_MEK_at_218", 1, 0, 0, 1);
		fwdRuleApplication("MEK_at_218", 1, 0, 0, 1);
		fwdRuleApplication("Raf_MEK_at_218_op", 1, 0, 0, 1);
	}
	
	void to_MEK_active_free_BWD() {
		bwdRuleApplication("Raf_MEK_at_218_op", 1, 0, 0, 1);
		bwdRuleApplication("MEK_at_218", 1, 0, 0, 1);
		bwdRuleApplication("Raf_MEK_at_218", 1, 0, 0, 1);
		bwdRuleApplication("Raf_MEK_at_222_op", 1, 0, 0, 1);
		bwdRuleApplication("MEK_at_222", 1, 0, 0, 1);
		bwdRuleApplication("Raf_MEK_at_222", 1, 0, 0, 1);
		to_Raf_active_BWD();
	}
	
	void to_ERK_active_free_FWD() {
		to_MEK_active_free_FWD();
		fwdRuleApplication("MEK_ERK_at_185", 1, 0, 0, 1);
		fwdRuleApplication("ERK_at_185", 1, 0, 0, 1);
		fwdRuleApplication("MEK_ERK_at_185_op", 1, 0, 0, 1);
		fwdRuleApplication("MEK_ERK_at_187", 1, 0, 0, 1);
		fwdRuleApplication("ERK_at_187", 1, 0, 0, 1);
		fwdRuleApplication("MEK_ERK_at_187_op", 1, 0, 0, 1);
	}
	
	void to_ERK_active_free_BWD() {
		bwdRuleApplication("MEK_ERK_at_187_op", 1, 0, 0, 1);
		bwdRuleApplication("ERK_at_187", 1, 0, 0, 1);
		bwdRuleApplication("MEK_ERK_at_187", 1, 0, 0, 1);
		bwdRuleApplication("MEK_ERK_at_185_op", 1, 0, 0, 1);
		bwdRuleApplication("ERK_at_185", 1, 0, 0, 1);
		bwdRuleApplication("MEK_ERK_at_185", 1, 0, 0, 1);
		to_MEK_active_free_BWD();	
	}
	
	// Actual Test Cases
	
	// Part1: Activating receptor dimers
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
	
	//@Test
	void EGFR_at_x_op_Test() {
		// This test case has non-deterministic results, which might result in occasional failures.
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
	
	// Part2: Internalization, degradation, recycling
	
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
	
	@Test
	void EGFR_EGFR_op_Test() {
		fromEGFtoEGFR_EGFR_dimer_FWD();
		neutralRuleApplication("EGFR_EGFR_op", 2, 0, 0, 2);
		fromEGFtoEGFR_EGFR_dimer_BWD();
	}
	
	@Test
	void EGF_EGFR_op_Test() {
		fromEGFtoEGF_EGFR_monomer_FWD();
		neutralRuleApplication("EGF_EGFR_op", 1, 0, 0, 1);
		fromEGFtoEGF_EGFR_monomer_BWD();
	}
	
	@Test
	void deg_EGF_Test() {
		fromEGFtoEGF_EGFR_monomer_op_FWD();
		neutralRuleApplication("deg_EGF", 1, 0, 1, 1);
		fromEGFtoEGF_EGFR_monomer_op_BWD();
	}
	
	@Test
	void deg_EGFR_Test() {
		fromEGFtoEGF_EGFR_monomer_op_FWD();
		neutralRuleApplication("deg_EGFR", 1, 0, 1, 1);
		fromEGFtoEGF_EGFR_monomer_op_BWD();
	}
	
	@Test
	void rec_EGFR_Test() {
		fromEGFtoEGF_EGFR_monomer_op_FWD();
		neutralRuleApplication("rec_EGFR", 1, 0, 4, 5);
		fromEGFtoEGF_EGFR_monomer_op_BWD();
	}
	
	// Part3: SoS and RasGAP recruitment
	/*
	@Test
	void EGFR_RasGAP_Test() {
		fromEGFtoEGFR_EGFR_at_992_FWD();
		neutralRuleApplication("EGFR_RasGAP", 2, 0, 0, 1);
		fromEGFtoEGFR_EGFR_at_992_BWD();
	}
	
	@Test
	void EGFR_Grb2_Test() {
		fromEGFtoEGFR_EGFR_at_1068_FWD();
		neutralRuleApplication("EGFR_Grb2", 2, 0, 0, 1);
		fromEGFtoEGFR_EGFR_at_1068_BWD();
	}
	
	@Test
	void Grb2_SoS_op_Test() {
		neutralRuleApplication("Grb2_SoS_op", 2, 1, 0, 1);
	}
	
	@Test
	void Grb2_SoS_Test() {
		fwdRuleApplication("Grb2_SoS_op", 2, 1, 0, 1);
		neutralRuleApplication("Grb2_SoS", 1, 0, 1, 2);
		bwdRuleApplication("Grb2_SoS_op", 2, 1, 0, 1);
	}
	
	@Test
	void EGFR_Shc_Test() {
		fromEGFtoEGFR_EGFR_at_1148_FWD();
		neutralRuleApplication("EGFR_Shc", 2, 0, 0, 1);
		fromEGFtoEGFR_EGFR_at_1148_BWD();
	}
	
	@Test
	void Shc_at_318_Test() {
		fromEGFtoEGFR_EGFR_at_1148_FWD();
		fwdRuleApplication("EGFR_Shc", 2, 0, 0, 1);
		neutralRuleApplication("Shc_at_318", 1, 0, 0, 1);
		bwdRuleApplication("EGFR_Shc", 2, 0, 0, 1);
		fromEGFtoEGFR_EGFR_at_1148_BWD();
	}
	
	@Test
	void Shc_at_318_op_Test() {
		// This test case has non-deterministic results, which might result in occasional failures.
		to_Shc_at_318_FWD();
		neutralRuleApplication("Shc_at_318_op", 1, 0, 1, 2);
		to_Shc_at_318_BWD();
		
	}
	
	@Test
	void Shc_Grb2_Test() {
		to_Shc_at_318_FWD();
		neutralRuleApplication("Shc_Grb2", 2, 0, 0, 1);
		to_Shc_at_318_BWD();
	}
	
	// Part4: Activating Ras
	@Test
	void long_arm_SoS_Ras_Test() {
		to_Shc_Grb2_FWD();
		neutralRuleApplication("long_arm_SoS_Ras", 1, 0, 0, 1);
		to_Shc_Grb2_BWD();
	}
	
	@Test
	void short_arm_SoS_Ras_Test() {
		to_EGFR_Grb2_FWD();
		neutralRuleApplication("short_arm_SoS_Ras", 1, 0, 0, 1);
		to_EGFR_Grb2_BWD();
	}
	
	
	@Test
	void Ras_GTP_Test() {
		to_long_arm_SoS_Ras_FWD();
		neutralRuleApplication("Ras_GTP", 1, 0, 0, 1);
		to_long_arm_SoS_Ras_BWD();
	}
	
	@Test
	void SoS_Ras_op_Test() {
		// This test case has non-deterministic results, which might result in occasional failures.
		to_long_arm_SoS_Ras_FWD();
		neutralRuleApplication("SoS_Ras_op", 1, 0, 0, 2);
		to_long_arm_SoS_Ras_BWD();
		
	}
	
	@Test
	void direct_RasGap_Ras_Test() {
		// This test case has non-deterministic results, which results in failures.	
		fwdRuleApplication("EGF_EGFR", 36, 25, 0, 1);
		fwdRuleApplication("EGF_EGFR", 25, 16, 1, 2);
		fwdRuleApplication("EGF_EGFR", 16, 9, 2, 3);
		fwdRuleApplication("EGF_EGFR", 9, 4, 3, 4);
		
		fwdRuleApplication("EGFR_EGFR", 12, 2, 0, 2);
		fwdRuleApplication("EGFR_EGFR", 2, 0, 2, 4);
		
		fwdRuleApplication("EGFR_at_992", 4, 3, 0, 1);
		fwdRuleApplication("EGFR_at_1148", 4, 3, 0, 1);
		
		fwdRuleApplication("EGFR_Shc", 2, 0, 0, 1);
		fwdRuleApplication("Shc_at_318", 1, 0, 0, 1);
		fwdRuleApplication("Shc_Grb2", 2, 0, 0, 1);
		fwdRuleApplication("long_arm_SoS_Ras", 1, 0, 0, 1);
		fwdRuleApplication("Ras_GTP", 1, 0, 0, 1);
		fwdRuleApplication("SoS_Ras_op", 1, 0, 0, 2);
		
		fwdRuleApplication("EGFR_RasGAP", 2, 0, 0, 1);
		neutralRuleApplication("direct_RasGap_Ras", 1, 0, 0, 1);
		bwdRuleApplication("EGFR_RasGAP", 2, 0, 0, 1);
		
		bwdRuleApplication("SoS_Ras_op", 1, 0, 0, 2);
		bwdRuleApplication("Ras_GTP", 1, 0, 0, 1);
		bwdRuleApplication("long_arm_SoS_Ras", 1, 0, 0, 1);
		bwdRuleApplication("Shc_Grb2", 2, 0, 0, 1);
		bwdRuleApplication("Shc_at_318", 1, 0, 0, 1);
		bwdRuleApplication("EGFR_Shc", 2, 0, 0, 1);
		
		bwdRuleApplication("EGFR_at_1148", 4, 3, 0, 1);
		bwdRuleApplication("EGFR_at_992", 4, 3, 0, 1);
		
		bwdRuleApplication("EGFR_EGFR", 2, 0, 2, 4);
		bwdRuleApplication("EGFR_EGFR", 12, 2, 0, 2);
		
		bwdRuleApplication("EGF_EGFR", 9, 4, 3, 4);
		bwdRuleApplication("EGF_EGFR", 16, 9, 2, 3);
		bwdRuleApplication("EGF_EGFR", 25, 16, 1, 2);
		bwdRuleApplication("EGF_EGFR", 36, 25, 0, 1);
		
		
	}
	
	@Test
	void Ras_GDP_Test() {
		// This test case has non-deterministic results, which results in failures.
		to_direct_RasGap_Ras_FWD();
		neutralRuleApplication("Ras_GDP", 1, 0, 0, 1);
		to_direct_RasGap_Ras_BWD();
		
	}
	
	@Test
	void RasGAP_Ras_op_Test() {
		// This test case has non-deterministic results, which results in failures.
		to_Ras_GDP_FWD();
		neutralRuleApplication("RasGAP_Ras_op", 1, 0, 0, 2);
		to_Ras_GDP_BWD();
		
	}
	
	@Test
	void intrinsic_Ras_GDP_Test() {
		// This test case has non-deterministic results, which results in failures.
		to_RasGTP_free_FWD();
		neutralRuleApplication("intrinsic_Ras_GDP", 1, 0, 0, 1);
		to_RasGTP_free_BWD();
		
	}
	
	// Part5: Activating Raf
	@Test
	void Ras_Raf_Test() {
		// This test case has non-deterministic results, which results in failures.
		to_RasGTP_free_FWD();
		neutralRuleApplication("Ras_Raf", 1, 0, 0, 1);
		to_RasGTP_free_BWD();
		
	}
	
	@Test
	void Raf_Test() {
		// This test case has non-deterministic results, which results in failures.
		to_Ras_Raf_FWD();
		neutralRuleApplication("Raf", 1, 0, 0, 1);
		to_Ras_Raf_BWD();
	}
	
	@Test
	void Ras_Raf_op_Test() {
		// This test case has non-deterministic results, which results in failures.
		to_Ras_Raf_FWD();
		neutralRuleApplication("Ras_Raf_op", 1, 0, 0, 1);
		to_Ras_Raf_BWD();
	}
	
	@Test
	void PP2A1_Raf_Test() {
		// This test case has non-deterministic results, which results in failures.
		to_Raf_active_FWD();
		neutralRuleApplication("PP2A1_Raf", 1, 0, 0, 1);
		to_Raf_active_BWD();
	}
	
	@Test
	void Raf_op_Test() {
		// This test case has non-deterministic results, which results in failures.
		to_PP2A1_Raf_FWD();
		neutralRuleApplication("Raf_op", 1, 0, 0, 1);
		to_PP2A1_Raf_BWD();
	}
	
	@Test
	void PP2A1_Raf_op_Test() {
		// This test case has non-deterministic results, which results in failures.
		to_PP2A1_Raf_FWD();
		neutralRuleApplication("PP2A1_Raf_op", 1, 0, 0, 1);
		to_PP2A1_Raf_BWD();
	}
	
	// Part6: Activating MEK
	@Test 
	void Raf_MEK_at_222_Test() {
		// This test case has non-deterministic results, which results in failures.
		to_Raf_active_FWD();
		neutralRuleApplication("Raf_MEK_at_222", 1, 0, 0, 1);
		to_Raf_active_BWD();
	}
	
	@Test
	void MEK_at_222_Test() {
		// This test case has non-deterministic results, which results in failures.
		to_Raf_active_FWD();
		fwdRuleApplication("Raf_MEK_at_222", 1, 0, 0, 1);
		neutralRuleApplication("MEK_at_222", 1, 0, 0, 1);
		bwdRuleApplication("Raf_MEK_at_222", 1, 0, 0, 1);
		to_Raf_active_BWD();
	}
	
	@Test
	void Raf_MEK_at_222_op_Test() {
		// This test case has non-deterministic results, which results in failures.
		to_Raf_active_FWD();
		fwdRuleApplication("Raf_MEK_at_222", 1, 0, 0, 1);
		neutralRuleApplication("Raf_MEK_at_222_op", 1, 0, 0, 1);
		bwdRuleApplication("Raf_MEK_at_222", 1, 0, 0, 1);
		to_Raf_active_BWD();
	}
	
	@Test
	void Raf_MEK_at_218_Test() {
		// This test case has non-deterministic results, which results in failures.
		to_Raf_active_FWD();
		neutralRuleApplication("Raf_MEK_at_218", 1, 0, 0, 1);
		to_Raf_active_BWD();
	}
	
	@Test
	void MEK_at_218_Test() {
		// This test case has non-deterministic results, which results in failures.
		to_Raf_active_FWD();
		fwdRuleApplication("Raf_MEK_at_218", 1, 0, 0, 1);
		neutralRuleApplication("MEK_at_218", 1, 0, 0, 1);
		bwdRuleApplication("Raf_MEK_at_218", 1, 0, 0, 1);
		to_Raf_active_BWD();
	}
	
	@Test
	void Raf_MEK_at_218_op_Test() {
		// This test case has non-deterministic results, which results in failures.
		to_Raf_active_FWD();
		fwdRuleApplication("Raf_MEK_at_218", 1, 0, 0, 1);
		neutralRuleApplication("Raf_MEK_at_218_op", 1, 0, 0, 1);
		bwdRuleApplication("Raf_MEK_at_218", 1, 0, 0, 1);
		to_Raf_active_BWD();
	}
	
	@Test
	void PP2A2_MEK_at_222_Test() {
		// This test case has non-deterministic results, which results in failures.
		to_MEK_active_free_FWD();
		neutralRuleApplication("PP2A2_MEK_at_222", 1, 0, 0, 1);
		to_MEK_active_free_BWD();
	}
	
	@Test
	void MEK_at_222_op_Test() {
		// This test case has non-deterministic results, which results in failures.
		to_MEK_active_free_FWD();
		fwdRuleApplication("PP2A2_MEK_at_222", 1, 0, 0, 1);
		neutralRuleApplication("MEK_at_222_op", 1, 0, 0, 1);
		bwdRuleApplication("PP2A2_MEK_at_222", 1, 0, 0, 1);
		to_MEK_active_free_BWD();
	}
	
	@Test
	void PP2A2_MEK_at_222_op_Test() {
		// This test case has non-deterministic results, which results in failures.
		to_MEK_active_free_FWD();
		fwdRuleApplication("PP2A2_MEK_at_222", 1, 0, 0, 1);
		neutralRuleApplication("PP2A2_MEK_at_222_op", 1, 0, 0, 1);
		bwdRuleApplication("PP2A2_MEK_at_222", 1, 0, 0, 1);
		to_MEK_active_free_BWD();
	}
	
	@Test
	void PP2A2_MEK_at_218_Test() {
		// This test case has non-deterministic results, which results in failures.
		to_MEK_active_free_FWD();
		neutralRuleApplication("PP2A2_MEK_at_218", 1, 0, 0, 1);
		to_MEK_active_free_BWD();
	}
	
	@Test
	void MEK_at_218_op_Test() {
		// This test case has non-deterministic results, which results in failures.
		to_MEK_active_free_FWD();
		fwdRuleApplication("PP2A2_MEK_at_218", 1, 0, 0, 1);
		neutralRuleApplication("MEK_at_218_op", 1, 0, 0, 1);
		bwdRuleApplication("PP2A2_MEK_at_218", 1, 0, 0, 1);
		to_MEK_active_free_BWD();
	}
	
	@Test
	void PP2A2_MEK_at_218_op_Test() {
		// This test case has non-deterministic results, which results in failures.
		to_MEK_active_free_FWD();
		fwdRuleApplication("PP2A2_MEK_at_218", 1, 0, 0, 1);
		neutralRuleApplication("PP2A2_MEK_at_218_op", 1, 0, 0, 1);
		bwdRuleApplication("PP2A2_MEK_at_218", 1, 0, 0, 1);
		to_MEK_active_free_BWD();
	}
	
	// Part7: Activating ERK
	@Test
	void MEK_ERK_at_185_Test() {
		// This test case has non-deterministic results, which results in failures.
		to_MEK_active_free_FWD();
		neutralRuleApplication("MEK_ERK_at_185", 1, 0, 0, 1);
		to_MEK_active_free_BWD();
	}
	
	@Test
	void ERK_at_185_Test() {
		// This test case has non-deterministic results, which results in failures.
		to_MEK_active_free_FWD();
		fwdRuleApplication("MEK_ERK_at_185", 1, 0, 0, 1);
		neutralRuleApplication("ERK_at_185", 1, 0, 0, 1);
		bwdRuleApplication("MEK_ERK_at_185", 1, 0, 0, 1);
		to_MEK_active_free_BWD();
	}
	
	@Test
	void MEK_ERK_at_185_op_Test() {
		// This test case has non-deterministic results, which results in failures.
		to_MEK_active_free_FWD();
		fwdRuleApplication("MEK_ERK_at_185", 1, 0, 0, 1);
		neutralRuleApplication("MEK_ERK_at_185_op", 1, 0, 0, 1);
		bwdRuleApplication("MEK_ERK_at_185", 1, 0, 0, 1);
		to_MEK_active_free_BWD();
	}
	
	@Test
	void MEK_ERK_at_187_Test() {
		// This test case has non-deterministic results, which results in failures.
		to_MEK_active_free_FWD();
		neutralRuleApplication("MEK_ERK_at_187", 1, 0, 0, 1);
		to_MEK_active_free_BWD();
	}
	
	@Test
	void ERK_at_187_Test() {
		// This test case has non-deterministic results, which results in failures.
		to_MEK_active_free_FWD();
		fwdRuleApplication("MEK_ERK_at_187", 1, 0, 0, 1);
		neutralRuleApplication("ERK_at_187", 1, 0, 0, 1);
		bwdRuleApplication("MEK_ERK_at_187", 1, 0, 0, 1);
		to_MEK_active_free_BWD();
	}
	
	@Test
	void MEK_ERK_at_187_op_Test() {
		// This test case has non-deterministic results, which results in failures.
		to_MEK_active_free_FWD();
		fwdRuleApplication("MEK_ERK_at_187", 1, 0, 0, 1);
		neutralRuleApplication("MEK_ERK_at_187_op", 1, 0, 0, 1);
		bwdRuleApplication("MEK_ERK_at_187", 1, 0, 0, 1);
		to_MEK_active_free_BWD();
	}
	
	@Test
	void MKP_ERK_at_185_Test() {
		// This test case has non-deterministic results, which results in failures.
		to_ERK_active_free_FWD();
		neutralRuleApplication("MKP_ERK_at_185", 1, 0, 0, 1);
		to_ERK_active_free_BWD();
	}
	
	@Test
	void ERK_at_185_op_Test() {
		// This test case has non-deterministic results, which results in failures.
		to_ERK_active_free_FWD();
		fwdRuleApplication("MKP_ERK_at_185", 1, 0, 0, 1);
		neutralRuleApplication("ERK_at_185_op", 1, 0, 0, 1);
		bwdRuleApplication("MKP_ERK_at_185", 1, 0, 0, 1);
		to_ERK_active_free_BWD();
	}
	
	@Test
	void MKP_ERK_at_185_op_Test() {
		// This test case has non-deterministic results, which results in failures.
		to_ERK_active_free_FWD();
		fwdRuleApplication("MKP_ERK_at_185", 1, 0, 0, 1);
		neutralRuleApplication("MKP_ERK_at_185_op", 1, 0, 0, 1);
		bwdRuleApplication("MKP_ERK_at_185", 1, 0, 0, 1);
		to_ERK_active_free_BWD();
	}
	
	@Test
	void MKP_ERK_at_187_Test() {
		// This test case has non-deterministic results, which results in failures.
		to_ERK_active_free_FWD();
		neutralRuleApplication("MKP_ERK_at_187", 1, 0, 0, 1);
		to_ERK_active_free_BWD();
	}
	
	@Test
	void ERK_at_187_op_Test() {
		// This test case has non-deterministic results, which results in failures.
		to_ERK_active_free_FWD();
		fwdRuleApplication("MKP_ERK_at_187", 1, 0, 0, 1);
		neutralRuleApplication("ERK_at_187_op", 1, 0, 0, 1);
		bwdRuleApplication("MKP_ERK_at_187", 1, 0, 0, 1);
		to_ERK_active_free_BWD();
	}
	
	@Test
	void MKP_ERK_at_187_op_Test() {
		// This test case has non-deterministic results, which results in failures.
		to_ERK_active_free_FWD();
		fwdRuleApplication("MKP_ERK_at_187", 1, 0, 0, 1);
		neutralRuleApplication("MKP_ERK_at_187_op", 1, 0, 0, 1);
		bwdRuleApplication("MKP_ERK_at_187", 1, 0, 0, 1);
		to_ERK_active_free_BWD();
	}
	
	// Part8: Deactivating SoS & feedback recovery
	@Test
	void SoS_ERK_Test() {
		// This test case has non-deterministic results, which results in failures.
		to_ERK_active_free_FWD();
		neutralRuleApplication("SoS_ERK", 2, 0, 0, 1);
		to_ERK_active_free_BWD();
	}
	
	@Test
	void SoS_ERK_op_Test() {
		// This test case has non-deterministic results, which results in failures.
		to_ERK_active_free_FWD();
		fwdRuleApplication("SoS_ERK", 2, 0, 0, 1);
		neutralRuleApplication("SoS_ERK_op", 1, 0, 0, 2);
		bwdRuleApplication("SoS_ERK", 2, 0, 0, 1);
		to_ERK_active_free_BWD();
	}
	
	@Test
	void SoS_at_SS_Test() {
		// This test case has non-deterministic results, which results in failures.
		to_ERK_active_free_FWD();
		fwdRuleApplication("SoS_ERK", 2, 0, 0, 1);
		neutralRuleApplication("SoS_at_SS", 1, 0, 0, 1);
		bwdRuleApplication("SoS_ERK", 2, 0, 0, 1);
		to_ERK_active_free_BWD();
	}
	
	@Test
	void SoS_at_SS_op_Test() {
		to_ERK_active_free_FWD();
		fwdRuleApplication("SoS_ERK", 2, 0, 0, 1);
		fwdRuleApplication("SoS_at_SS", 1, 0, 0, 1);
		fwdRuleApplication("SoS_ERK_op", 1, 0, 0, 2);
		neutralRuleApplication("SoS_at_SS_op", 1, 0, 1, 2);
		bwdRuleApplication("SoS_ERK_op", 1, 0, 0, 2);
		bwdRuleApplication("SoS_at_SS", 1, 0, 0, 1);
		bwdRuleApplication("SoS_ERK", 2, 0, 0, 1);
		to_ERK_active_free_BWD();
	}
	*/
}
