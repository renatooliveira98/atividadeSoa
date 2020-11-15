package br.ucsal.atividadesoa.atividadesoa.domain;

import java.util.ArrayList;
import java.util.List;

public class Repository {
	public List<MedicoModel> medicos = new ArrayList<MedicoModel>();
	
	public List<MedicoModel> retornarMedicos() {
		MedicoModel m = new MedicoModel();
		m.setCrm("12345");
		m.setCpf("12345");
		m.setNome("Renato");
		
		medicos.add(m);
		return medicos;
	}
	
	public String obterMedico(String crm) {
		for (MedicoModel medicoModel : medicos) {
			if(medicoModel.getCrm().equals(crm)) {
				return medicoModel.getNome();
			}
		}
		return null;
	}
}
