package com.itau.felipe.jersey.services;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * https://imasters.com.br/back-end/faca-sua-api-rest-retornar-um-json-em-5-minutos-com-jersey
 * @author felipe
 * @Path – aqui estamos dizendo que caminho seguir para acessar esse serviço. E para obter um cliente é através do /client sendo a url completa assim /hello/client
 *
 */
@Path("/hello")
public class HelloJerseyService {
	@GET
	@Path("/client")
	@Produces(MediaType.APPLICATION_JSON)
	public Client getCliente() {
		Client client = new Client();
		client.setName("Hello World Felipe");
		return client;
	}
}