package api;

import Model.Dao.ProductoDao;
import Model.Entity.Producto;
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

@Path("/apiproductos")

public class ProductoResource {
      ProductoDao producDao = new ProductoDao();
    
    @GET
    @Path("/producto")
    public Response consultar()
    {
        List<Producto> produc = new ArrayList<>();
        produc = producDao.consultar();
         return Response
                .status(200)
                .entity(produc)
                .build();
    }
   @GET
   @Path("/producto/{id_producto}")
   @Produces(MediaType.APPLICATION_JSON)
    public Response consultarId(@PathParam("id_producto") int id_producto){
        Producto producto = new Producto(id_producto);
        return Response
                .status(200)
                .entity(producDao.consultarId(producto))
                .build();
    }
    @GET
   @Path("/producto/referencia/{referencia}")
   @Produces(MediaType.APPLICATION_JSON)
    public Response buscarReferencia(@PathParam("referencia") String referencia){
        Producto producto = new Producto(referencia);
        return Response
                .status(200)
                .entity(producDao.buscarRef("referencia", referencia))
                .build();
    }
     @POST
    @Path("/producto")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response crear(Producto producto)
            
    {
        try{
            producDao.Insertar(producto);
            return Response.status(Response.Status.CREATED).entity(producto).build();
        }
        catch(Exception ex)
        {
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(ex.getMessage()).build();
        } 
    } 
     @DELETE
    @Path("/producto/{id_producto}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response borrar(@PathParam("id_producto") int id_producto) {
        Producto producto = new Producto(id_producto);
        int i = producDao.borrar(producto);
        if (i == 0) {
            return Response
                    .status(Response.Status.BAD_REQUEST)
                    .entity("producto not found")
                    .build();
        } else {
            return Response.ok("Correcto").build();
        }
    }
    @Path("/producto")
    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response actualizar(Producto producto) {
       try{
            producDao.actualizar(producto);
            return Response.status(Response.Status.CREATED).entity(producto).build();
        }
        catch(Exception ex)
        {
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(ex.getMessage()).build();
        } 
    }
}
