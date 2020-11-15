package br.ucsal.atividadesoa.atividadesoa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.ucsal.atividadesoa.atividadesoa.domain.MedicoModel;




@SpringBootApplication
public class AtividadesoaApplication {

	public static void main(String[] args) {
		SpringApplication.run(AtividadesoaApplication.class, args);
		Endpoint.publish("http://127.0.0.1:9876/calc", new MedicoModel());
	}

}
