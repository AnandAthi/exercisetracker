package com.training.rest;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.training.workout.model.Workout;
import com.training.workout.stub.WorkoutStub;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("myresource")
public class MyResource {

	private WorkoutStub stub = new WorkoutStub();
	
	
	/**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getIt() {
        return "<Got it>!";
    }
    
	/*@Path("workouts")
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Workout> getWorkouts(){
		return stub.getAllWorkouts();
	}*/

}
