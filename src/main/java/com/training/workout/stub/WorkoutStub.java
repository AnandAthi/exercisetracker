/**
 * 
 */
package com.training.workout.stub;

import java.util.ArrayList;
import java.util.List;

import com.training.workout.model.Workout;

/**
 * @author kiamz
 * @param <Workout>
 *
 */
public class WorkoutStub {
	
	public List<Workout> getAllWorkouts(){
		
		List<Workout> workoutList = new ArrayList<Workout>(); 
		
		Workout exercise = new Workout();
		exercise.description = "Treadmill";
		exercise.duration = "20";
		workoutList.add(exercise);
		return workoutList;
		
	}

}
