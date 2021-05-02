package es.upm.dit.isst.commBike.rest;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


import es.upm.dit.isst.commBike.dao.*;
import es.upm.dit.isst.commBike.model.*;


@Path("/bicicletas")

public class bicicletaResource {
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<bicicleta> readAll () {
			List<bicicleta> list = bicicletaDAOImplementation.getInstance().readAll();
			System.out.println("bicis:"+list);
	        return list;

	}


	@GET

	@Path("usuario/{id}")

	@Produces(MediaType.APPLICATION_JSON)

	public List<bicicleta> readAll (@PathParam("id") String id) {

	        return bicicletaDAOImplementation.getInstance().readAll(id);

	}

@POST

@Consumes(MediaType.APPLICATION_JSON)

public Response create(bicicleta tnew) throws URISyntaxException {

    bicicleta t = bicicletaDAOImplementation.getInstance().create(tnew);

    if (t != null) {

            URI uri = new URI("/commBike/rest/bicicletas/" + t.getBikeCode());

            return Response.created(uri).build();

    }

    return Response.status(Response.Status.NOT_FOUND).build();

}

@GET

@Path("{id}")

@Produces(MediaType.APPLICATION_JSON)

public Response read(@PathParam("id") String id) {

    bicicleta t = bicicletaDAOImplementation.getInstance().read(id);

    if (t == null)

      return Response.status(Response.Status.NOT_FOUND).build();

    return Response.ok(t, MediaType.APPLICATION_JSON).build();

}        


@POST

@Consumes(MediaType.APPLICATION_JSON)

@Path("{id}")

public Response update(@PathParam("id") String id, bicicleta t) {

        System.out.println("Update request for" + id + " " + t.toString());

    bicicleta told = bicicletaDAOImplementation.getInstance().read(id);

    if ((told == null) || (! told.getBikeCode().contentEquals(t.getBikeCode())))

      return Response.notModified().build();

    bicicletaDAOImplementation.getInstance().update(t);

    return Response.ok().build();                

}


@DELETE

@Path("{id}")

public Response delete(@PathParam("id") String  id) {

    bicicleta rold = bicicletaDAOImplementation.getInstance().read(id);

    if (rold == null)

        return Response.notModified().build();

    bicicletaDAOImplementation.getInstance().delete(rold);

    return Response.ok().build();

}
	
	
	
}
