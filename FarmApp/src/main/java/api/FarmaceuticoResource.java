package api;

import Model.Dao.FarmaceuticoDao;
import Model.Entity.Farmaceutico;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

@Path("/apifarmaceutico")
public class FarmaceuticoResource {
    FarmaceuticoDao farmaDao = new FarmaceuticoDao();
    
    @GET
    @Path("/farmaceutico")
    public Response consultar()
    {
        List<Farmaceutico> farmas = new ArrayList<>();
        farmas = farmaDao.consultar();
         return Response
                .status(200)
                .entity(farmas)
                .build();
    }
   @GET
   @Path("/farmaceutico/{cedula}")
   @Produces(MediaType.APPLICATION_JSON)
    public Response consultarId(@PathParam("cedula") String cedula){
        Farmaceutico farma = new Farmaceutico(cedula);
        return Response
                .status(200)
                .entity(farmaDao.consultarId(farma))
                .build();
    }
     @POST
    @Path("/farmaceutico")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response crear(Farmaceutico farma)
            
    {
        try{
            farmaDao.Insertar(farma);
            return Response.status(Response.Status.CREATED).entity(farma).build();
        }
        catch(Exception ex)
        {
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(ex.getMessage()).build();
        } 
    } 
     @DELETE
    @Path("/farmaceutico/{cedula}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response borrar(@PathParam("cedula") String cedula) {
        Farmaceutico farma = new Farmaceutico(cedula);
        int i = farmaDao.borrar(farma);
        if (i == 0) {
            return Response
                    .status(Response.Status.BAD_REQUEST)
                    .entity("farmaceutico not found")
                    .build();
        } else {
            return Response.ok("Correcto").build();
        }
    }
    @Path("/farmaceutico")
    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response actualizar(Farmaceutico farma) {
       try{
            farmaDao.actualizar(farma);
            return Response.status(Response.Status.CREATED).entity(farma).build();
        }
        catch(Exception ex)
        {
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(ex.getMessage()).build();
        } 
    }
}
