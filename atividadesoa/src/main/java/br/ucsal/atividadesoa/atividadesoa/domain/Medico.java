package br.ucsal.atividadesoa.atividadesoa.domain;

import java.util.Date;

import javax.jws.WebService;

@WebService(endpointInterface = "br.ucsal.atividadesoa.atividadesoa.domain.IMedico")
public class Medico implements IMedico {

	public String retornarNome(String crm) {
		Repository r = new Repository();
		return r.obterMedico(crm);
	}

	@Override
	public Date retornarData(String crm) {
		
		return null;
	}

}
