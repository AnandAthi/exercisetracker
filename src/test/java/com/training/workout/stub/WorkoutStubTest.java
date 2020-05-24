package com.training.workout.stub;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import com.training.workout.model.Workout;


public class WorkoutStubTest {

	WorkoutStub testStub;
	
	@Before
	public void setUp(){
		testStub = new WorkoutStub();
	}
	
	@Test
	public void testgetAllWorkouts() {
		List<Workout> allWorkouts = testStub.getAllWorkouts();
		assertNotNull("Failed for testGetAllWorkouts", testStub.getAllWorkouts());
	}

}
