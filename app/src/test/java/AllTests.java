import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import comp3350.plantr.tests.business.UserManagerTest;
import comp3350.plantr.tests.model.GardenTest;
import comp3350.plantr.tests.model.PersonalPlantTest;
import comp3350.plantr.tests.model.PlantTest;
import comp3350.plantr.tests.model.TemperatureTest;
import comp3350.plantr.tests.persistence.DatabaseTest;

/**
 * 6/4/2017
 * Raman Maan
 * Purpose: Encompasses all test suite classes for easy run
 */

@RunWith(Suite.class)
@Suite.SuiteClasses({
		TemperatureTest.class, DatabaseTest.class, PlantTest.class, PersonalPlantTest.class, GardenTest.class, UserManagerTest.class
})
public class AllTests {
}
