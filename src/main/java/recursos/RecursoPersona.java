package recursos;

import java.util.List;

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

import modelo.entities.Persona;
import modelo.servicios.PersonaService;

@Path("/personas")
public class RecursoPersona {

    private PersonaService servicio;

    public RecursoPersona() {
        servicio = new PersonaService();
    }

    @GET
    @Path("/buscar/{cedula}")
    @Produces(MediaType.APPLICATION_JSON)
    public Persona buscar(@PathParam("cedula") String cedula) {
        return servicio.buscarPorCedula(cedula);
    }

    @POST
    @Path("/crear")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response add(Persona p) {
        servicio.agregarCiudadano(p);
        return Response.status(Response.Status.CREATED).entity(p).build();
    }

    @PUT
    @Path("/actualizar")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response update(Persona p) {
        servicio.actualizarRegistro(p);
        return Response.ok(p).build();
    }

    @DELETE
    @Path("/eliminar/{id}")
    public void delete(@PathParam("id") int id) {
        servicio.darDeBaja(id);
    }

    @GET
    @Path("/listar")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Persona> todos() {
        return servicio.listar();
    }
}