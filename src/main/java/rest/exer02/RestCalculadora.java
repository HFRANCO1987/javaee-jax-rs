package rest.exer02;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

//application.wasdl
@Path("/calculadora")
public class RestCalculadora {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String somar(@QueryParam("v1") Integer valor1, @QueryParam("v2") Integer valor2) {
		return "Valor da soma:" + valor1 + " " + valor2 + "=" + (valor1 + valor2);
	}
	
}
