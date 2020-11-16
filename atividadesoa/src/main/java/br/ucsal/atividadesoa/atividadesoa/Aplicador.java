package br.ucsal.atividadesoa.atividadesoa;

import javax.xml.ws.Endpoint;

import br.ucsal.atividadesoa.atividadesoa.domain.Medico;

public class Aplicador {

	public static void main(String[] args) {
		System.out.println("http://127.0.0.1:9876/medico?wsdl");
		Endpoint.publish("http://127.0.0.1:9876/medico", new Medico());

	}
}
