package rest.exer01;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/ola")
public class OlaImp implements Ola {
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String ola() {
		System.out.println("Executando o rest");
		return "Sem bem vindo";
	}

	
	
}
