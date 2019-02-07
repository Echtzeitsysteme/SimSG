package org.simsg.test.gt;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Collection;
import java.util.LinkedList;

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
	
	private boolean collectMatches(String pattern) {
		try {
			pmc.collectMatches(pattern);
		} catch (Exception e) {
			fail(e.getMessage());
			return false;
		}
		return true;
	}
	
	private int getMatchCount(String pattern) {
		if(collectMatches(pattern)) {
			return pmc.getMatchCount(pattern);
		}else {
			return -1;
		}
		
	}
	
	private Collection<IMatch> getMatches(String pattern) {
		if(collectMatches(pattern)) {
			return pmc.getMatches(pattern);
		}else {
			return new LinkedList<>();
		}
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
	
	protected void checkConsistency() {
		String p = "checkConsistency";
		try {
			pmc.collectMatches(p);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		assertEquals(1, pmc.getMatchCount(p), "Number of matches weren't equal!");
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
	
	@Test
	void powerDownTest() {
		final String powerDown = "kTC_powerDown_lhs";
		final String reactivate = "reactivate_lhs";
		
		checkConsistency();
		
		assertEquals(8, getMatchCount(powerDown), "Number of matches weren't equal!");
		
		while(getMatchCount(powerDown)>0) {
			IMatch match = getMatches(powerDown).iterator().next();
			gt.applyRuleToMatch(match, powerDown);
		}
		
		assertEquals(0, getMatchCount(powerDown), "Number of matches weren't equal!");
		
		assertEquals(4, getMatchCount(reactivate), "Number of matches weren't equal!");
		
		while(getMatchCount(reactivate)>0) {
			IMatch match = getMatches(reactivate).iterator().next();
			gt.applyRuleToMatch(match, reactivate);
		}
		
		assertEquals(0, getMatchCount(reactivate), "Number of matches weren't equal!");
		
		checkConsistency();
	}
	
	@Test
	void powerUpTest() {
		final String powerUp = "kTC_powerUp_lhs";
		final String deactivate = "deactivate_lhs";
		final String reactivate = "reactivate_lhs";
		
		checkConsistency();
		
		assertEquals(13, getMatchCount(deactivate), "Number of matches weren't equal!");
		
		while(getMatchCount(deactivate)>0) {
			IMatch match = getMatches(deactivate).iterator().next();
			gt.applyRuleToMatch(match, deactivate);
		}
		
		assertEquals(0, getMatchCount(deactivate), "Number of matches weren't equal!");
		
		assertEquals(34, getMatchCount(powerUp), "Number of matches weren't equal!");
		
		while(getMatchCount(powerUp)>0) {
			IMatch match = getMatches(powerUp).iterator().next();
			gt.applyRuleToMatch(match, powerUp);
		}
		
		assertEquals(2, getMatchCount(reactivate), "Number of matches weren't equal!");
		
		while(getMatchCount(reactivate)>0) {
			IMatch match = getMatches(reactivate).iterator().next();
			gt.applyRuleToMatch(match, reactivate);
		}
		
		assertEquals(0, getMatchCount(reactivate), "Number of matches weren't equal!");
		
		checkConsistency();
	}
	
	@Test
	public void increaseWeightTest() {
		final String increase = "increaseWeight_lhs";
		final String decrease = "decreaseWeight_lhs";
		
		assertEquals(13, getMatchCount(increase), "Number of matches weren't equal!");
		
		for(IMatch match : getMatches(increase)) {
			gt.applyRuleToMatch(match, increase);
		}
		
		assertEquals(13, getMatchCount(decrease), "Number of matches weren't equal!");
		
		for(IMatch match : getMatches(decrease)) {
			gt.applyRuleToMatch(match, decrease);
		}
		
		checkConsistency();
		
		
	}
	
	@Test
	public void decreaseWeightTest() {
		final String increase = "increaseWeight_lhs";
		final String decrease = "decreaseWeight_lhs";
		
		checkConsistency();
		
		assertEquals(10, getMatchCount(decrease), "Number of matches weren't equal!");
		
		Collection<IMatch> matches = getMatches(decrease);
		for(IMatch match : matches) {
			gt.applyRuleToMatch(match, decrease);
		}
		
		assertEquals(7, getMatchCount(decrease), "Number of matches weren't equal!");
		
		assertEquals(13, getMatchCount(increase), "Number of matches weren't equal!");
		
		for(IMatch match : matches) {
			gt.applyRuleToMatch(match, increase);
		}
		
		assertEquals(10, getMatchCount(decrease), "Number of matches weren't equal!");
		
		checkConsistency();
		
		
	}
	
	@Test
	public void removeEdgeTest() {
		final String markRemoveActive = "deleteEdgeActive_lhs";
		final String markRemoveInactive = "deleteEdgeInactive_lhs";
		final String cleanDeleted = "cleanDeleted_lhs";
		final String revertDelete = "revertDelete_lhs";
		final String reactivate = "reactivate_lhs";
		
		checkConsistency();
		
		assertEquals(13, getMatchCount(markRemoveActive), "Number of matches weren't equal!");
		assertEquals(0, getMatchCount(markRemoveInactive), "Number of matches weren't equal!");
		
		Collection<IMatch> matches = getMatches(markRemoveActive);
		for(IMatch match : matches) {
			gt.applyRuleToMatch(match, markRemoveActive);
		}
		
		assertEquals(13, getMatchCount(cleanDeleted), "Number of matches weren't equal!");
		assertEquals(13, getMatchCount(revertDelete), "Number of matches weren't equal!");
		
		matches = getMatches(revertDelete);
		for(IMatch match : matches) {
			gt.applyRuleToMatch(match, revertDelete);
		}
		
		assertEquals(13, getMatchCount(reactivate), "Number of matches weren't equal!");
		assertEquals(13, getMatchCount(markRemoveInactive), "Number of matches weren't equal!");
		
		matches = getMatches(markRemoveInactive);
		for(IMatch match : matches) {
			gt.applyRuleToMatch(match, markRemoveInactive);
		}
		
		assertEquals(13, getMatchCount(cleanDeleted), "Number of matches weren't equal!");
		assertEquals(13, getMatchCount(revertDelete), "Number of matches weren't equal!");
		
		matches = getMatches(revertDelete);
		for(IMatch match : matches) {
			gt.applyRuleToMatch(match, revertDelete);
		}
		
		assertEquals(13, getMatchCount(reactivate), "Number of matches weren't equal!");
		
		matches = getMatches(reactivate);
		for(IMatch match : matches) {
			gt.applyRuleToMatch(match, reactivate);
		}
		
		checkConsistency();
		
	}
	
}
