package biochemsimulation.simulation.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
	PatternMatchingDemoclesTest.class,
	PatternMatchingViatraTest.class,
	GraphTransformViatraTest.class,
	GraphTransformDemoclesTest.class
})
public class AllTests {

}
