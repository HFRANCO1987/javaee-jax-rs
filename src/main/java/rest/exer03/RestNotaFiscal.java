package rest.exer03;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.Produces;

@Path("/notafiscal/{id:[0-9]*}")
public class RestNotaFiscal {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String processarNota(@PathParam("id") Long id) {
		return "Obrigado por consultar a Nota fiscal : " + id;
	}

}
