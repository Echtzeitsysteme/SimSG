package org.simsg.test.gt;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Collection;

import org.junit.FixMethodOrder;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.runners.MethodSorters;

import org.simsg.container.Container;
import org.simsg.core.gt.ModelGraphTransformer;
import org.simsg.core.persistence.PersistenceManager;
import org.simsg.core.persistence.PersistenceManagerEnum;
import org.simsg.core.persistence.PersistenceManagerFactory;
import org.simsg.core.pm.match.IMatch;
import org.simsg.core.pm.match.PatternMatchingEngine;
import org.simsg.core.pm.match.PatternMatchingEngineEnum;
import org.simsg.core.pm.match.PatternMatchingEngineFactory;
import org.simsg.core.pmc.PatternMatchingController;
import org.simsg.core.pmc.PatternMatchingControllerEnum;
import org.simsg.core.pmc.PatternMatchingControllerFactory;
import org.simsg.core.utils.PersistenceUtils;
import org.simsg.simsgl.simSGL.SimSGLModel;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
abstract class GraphTransformAttributeTest {
	
	protected PersistenceManagerEnum persistenceType;
	protected PersistenceManager persistence;
	
	protected SimSGLModel ruleModel;
	protected Container containerModel;
	protected PatternMatchingController pmc;
	
	protected PatternMatchingEngineEnum engineType;
	protected PatternMatchingControllerEnum pmcType;
	
	protected ModelGraphTransformer gt;
	
	protected GraphTransformAttributeTest() {
		setPersistenceType();
		persistence = PersistenceManagerFactory.create(persistenceType);
		persistence.setModelFolderPath(System.getProperty("user.dir")+"//models");
		persistence.init();
		setEngineType();
		setPMCType();
	}
	
	abstract protected void setPersistenceType();
	
	abstract protected void setEngineType();
	
	abstract protected void setPMCType();
	
	@BeforeAll
	void beforeAllTest() throws Exception {
		PatternMatchingEngine engine = PatternMatchingEngineFactory.create(engineType);
		pmc = PatternMatchingControllerFactory.create(pmcType);
		pmc.setEngine(engine);
		ruleModel = persistence.loadReactionRuleModel("GraphTransformAttributeTest");
		containerModel = persistence.loadReactionContainerModel("GraphTransformAttributeTest");
		pmc.loadModels(ruleModel, containerModel);
		pmc.initEngine();
		pmc.initController();
		gt = new ModelGraphTransformer(pmc.getPatternContainer(), containerModel, pmc.getEPackageWrapper());
		gt.init();
	}
	
	@AfterAll
	void afterAllTest() throws Exception {
		pmc.discardEngine();
		persistence.unloadReactionContainerModel("GraphTransformAttributeTest");
	}
	
	private void collectMatches(String lhs, String rhs) {
		try {
			pmc.collectMatches(lhs);
		} catch (Exception e) {
			fail(e.getMessage());
		}
		try {
			pmc.collectMatches(rhs);
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}
	
	private IMatch getLhsAndCheckMatches(String lhs, String rhs, int lhsCount, int rhsCount) {
		Collection<IMatch> lhsMatches = pmc.getMatches(lhs);
		pmc.getMatches(rhs);
		assertEquals(lhsCount, pmc.getMatchCount(lhs), "Number of matches weren't equal!");
		assertEquals(rhsCount, pmc.getMatchCount(rhs), "Number of matches weren't equal!");
		return lhsMatches.iterator().next();
	}
	
	private IMatch getRhsAndCheckMatches(String lhs, String rhs, int lhsCount, int rhsCount) {
		pmc.getMatches(lhs);
		Collection<IMatch> rhsMatches = pmc.getMatches(rhs);
		assertEquals(lhsCount, pmc.getMatchCount(lhs), "Number of matches weren't equal!");
		assertEquals(rhsCount, pmc.getMatchCount(rhs), "Number of matches weren't equal!");
		return rhsMatches.iterator().next();
	}

	@Test
	void connectTest() {
		final int lhsPre = 8;
		final int lhsPost = 2;
		final int rhsPre = 0;
		final int rhsPost = 2;
		final String lhs = "connectFwd_lhs";
		final String rhs = "connectBwd_lhs";
		
		collectMatches(lhs, rhs);
		IMatch lhsMatch = getLhsAndCheckMatches(lhs, rhs, lhsPre, rhsPre);
		gt.applyRuleToMatch(lhsMatch, lhs);
		
		collectMatches(lhs, rhs);
		IMatch rhsMatch = getRhsAndCheckMatches(lhs, rhs, lhsPost, rhsPost);
		gt.applyRuleToMatch(rhsMatch, rhs);
		
		collectMatches(lhs, rhs);
		getLhsAndCheckMatches(lhs, rhs, lhsPre, rhsPre);

	}
	
	
	
}
