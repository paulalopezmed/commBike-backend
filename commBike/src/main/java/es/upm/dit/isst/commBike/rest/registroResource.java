package es.upm.dit.isst.commBike.rest;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


import es.upm.dit.isst.commBike.dao.*;
import es.upm.dit.isst.commBike.model.*;


@Path("/registros")

public class registroResource {
	
	@GET

	@Produces(MediaType.APPLICATION_JSON)

	public List<registro> readAll () {

	        return registroDAOImplementation.getInstance().readAll();

	}


	@GET

	@Path("usuario/{id}")

	@Produces(MediaType.APPLICATION_JSON)

	public List<registro> readAll (@PathParam("id") String id) {

	        return registroDAOImplementation.getInstance().readAll(id);

	}

@POST

@Consumes(MediaType.APPLICATION_JSON)

public Response create(registro tnew) throws URISyntaxException {

	registro t = registroDAOImplementation.getInstance().create(tnew);

    if (t != null) {

            URI uri = new URI("/commBike/rest/registros/" + t.getRecordCode());

            return Response.created(uri).build();

    }

    return Response.status(Response.Status.NOT_FOUND).build();

}

@GET

@Path("{id}")

@Produces(MediaType.APPLICATION_JSON)

public Response read(@PathParam("id") String id) {

	registro t = registroDAOImplementation.getInstance().read(id);

    if (t == null)

      return Response.status(Response.Status.NOT_FOUND).build();

    return Response.ok(t, MediaType.APPLICATION_JSON).build();

}        


@POST

@Consumes(MediaType.APPLICATION_JSON)

@Path("{id}")

public Response update(@PathParam("id") String id, registro t) {

        System.out.println("Update request for" + id + " " + t.toString());

        registro told = registroDAOImplementation.getInstance().read(id);

    if ((told == null) || (! told.getRecordCode().contentEquals(t.getRecordCode())))

      return Response.notModified().build();

    registroDAOImplementation.getInstance().update(t);

    return Response.ok().build();                

}


@DELETE

@Path("{id}")

public Response delete(@PathParam("id") String  id) {

	registro rold = registroDAOImplementation.getInstance().read(id);

    if (rold == null)

        return Response.notModified().build();

    registroDAOImplementation.getInstance().delete(rold);

    return Response.ok().build();

}
	
	
	
}