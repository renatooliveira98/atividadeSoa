package br.ucsal.atividadesoa.atividadesoa.domain;

import javax.jws.WebService;

import java.util.Date;

import javax.jws.WebMethod;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style = Style.RPC)
public interface IMedico {
	@WebMethod String retornarNome(String crm); 
	@WebMethod Date retornarData(String crm);
}
