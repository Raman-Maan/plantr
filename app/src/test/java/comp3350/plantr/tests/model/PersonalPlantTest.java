package comp3350.plantr.tests.model;

import org.junit.Test;
import static org.junit.Assert.*;

import comp3350.plantr.model.PersonalPlant;
import comp3350.plantr.model.Plant;
import comp3350.plantr.model.Temperature;
import comp3350.plantr.model.TemperatureRange;

/**
 * Created by Michael on 27/06/2017
 *
 * Class that currently only tests plant object creation.
 */

public class PersonalPlantTest {


	@Test
	public void personalPlant_testEquals(){

		Plant dummyPlantOne = new Plant(1);
		Plant dummyPlantTwo = new Plant(2);

		PersonalPlant firstPlant = new PersonalPlant(null, "myTestPlant", 1, null);
		PersonalPlant secondPlant = new PersonalPlant(dummyPlantOne, "myTestPlant2", 2, null);

		//testing the equals function
		assertTrue(firstPlant.equals(firstPlant.getID()));
		assertTrue(secondPlant.equals(secondPlant.getID()));

		assertTrue(!firstPlant.equals(secondPlant));
		assertTrue(!secondPlant.equals(firstPlant));

		assertNotEquals(firstPlant, secondPlant);

		//same everything
		firstPlant = new PersonalPlant(dummyPlantOne, "sameString", 1, null);
		secondPlant = new PersonalPlant(dummyPlantOne, "sameString", 1, null);

		assertEquals(firstPlant,firstPlant);

		//different ID, same plant and string though
		firstPlant = new PersonalPlant(dummyPlantOne, "sameString", 1, null);
		secondPlant = new PersonalPlant(dummyPlantOne, "sameString", 2, null);

		assertNotEquals(firstPlant, secondPlant);

		//different ID, diff plant, diff string
		firstPlant = new PersonalPlant(dummyPlantOne, "I am a string", 1, null);
		secondPlant = new PersonalPlant(dummyPlantTwo, "I am a string that is different", 2, null);

		assertNotEquals(firstPlant, secondPlant);
	}
}
