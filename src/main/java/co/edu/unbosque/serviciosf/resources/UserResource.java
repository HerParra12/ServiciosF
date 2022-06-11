package co.edu.unbosque.serviciosf.resources;
import co.edu.unbosque.serviciosf.model.UserApp;
import co.edu.unbosque.serviciosf.services.UserService;
import javax.ws.rs.*;
import javax.ws.rs.core.*;

@Path("/users")
public class UserResource {

    private UserService service;

    public UserResource(){
        service = new UserService();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response registered(UserApp userApp){
        return Response.ok()
                       .status(201)
                       .entity(service.addElement(userApp.getName(), userApp.getEmail(), userApp.getPassword(), userApp.getRole()))
                       .build();
    }

    @POST
    @Path("/login")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response login(UserApp userApp){
        return Response.ok()
                       .entity(service.login(userApp.getName(), userApp.getPassword()))
                       .build();
    }





}
