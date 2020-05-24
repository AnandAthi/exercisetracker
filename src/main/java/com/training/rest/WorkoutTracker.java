/**
 * 
 */
package com.training.rest;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.training.workout.model.Workout;
import com.training.workout.stub.WorkoutStub;

/**
 * @author kiamz
 *
 */
@Path("workouts")
public class WorkoutTracker {

	private WorkoutStub stub = new WorkoutStub();
	
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Workout> getWorkouts(){
		return stub.getAllWorkouts();
	}

}
