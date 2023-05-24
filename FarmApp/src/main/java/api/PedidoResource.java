package api;

import Model.Dao.PedidoDao;
import Model.Entity.Pedido;
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

@Path("/apipedidos")

public class PedidoResource {
     PedidoDao pedidoDao = new PedidoDao();
    
    @GET
    @Path("/pedido")
    public Response consultar()
    {
        List<Pedido> pedido = new ArrayList<>();
        pedido = pedidoDao.consultar();
         return Response
                .status(200)
                .header("Access-Control-Allow-Origin", "*")
                .entity(pedido)
                .build();
    }
   @GET
   @Path("/pedido/{id_pedido}")
   @Produces(MediaType.APPLICATION_JSON)
    public Response consultarId(@PathParam("id_pedido") int id_pedido){
        Pedido pedido = new Pedido(id_pedido);
        return Response
                .status(200)
                .header("Access-Control-Allow-Origin", "*")
                .entity(pedidoDao.consultarId(pedido))
                .build();
    }
     @POST
    @Path("/pedido")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response crear(Pedido pedido)     
    {
        try{
            pedidoDao.Insertar(pedido);
            return Response.status(Response.Status.CREATED).entity(pedido).build();
        }
        catch(Exception ex)
        {
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(ex.getMessage()).build();
        } 
    } 
     @DELETE
    @Path("/pedido/{id_pedido}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response borrar(@PathParam("id_pedido") int id_pedido) {
        Pedido pedido = new Pedido(id_pedido);
        int i = pedidoDao.borrar(pedido);
        if (i == 0) {
            return Response
                    .status(Response.Status.BAD_REQUEST)
                    .header("Access-Control-Allow-Origin", "*")
                    .entity("pedido not found")
                    .build();
        } else {
            return Response.ok("Correcto").build();
        }
    }
    @Path("/pedido")
    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response actualizar(Pedido pedido) {
       try{
            pedidoDao.actualizar(pedido);
            return Response.status(Response.Status.CREATED).entity(pedido).build();
        }
        catch(Exception ex)
        {
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(ex.getMessage()).build();
        } 
    }
}
