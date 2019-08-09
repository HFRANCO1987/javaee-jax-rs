package rest.exer04;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/venda")
public class RestVenda {

	@GET
	@Produces(MediaType.TEXT_HTML)
	public String vender(@QueryParam("nome") String nome, @QueryParam("produto") String produto, @QueryParam("tipo") @DefaultValue("pdf") String tipo) {
		System.out.println("Já é possível realizar a venda!");
		System.out.println(nome + " - " + produto + " " + tipo);
		return "<h1>Segue os dados da nota fiscal " + nome + " - " + produto + " " + tipo + "</h1>";
	}

}
