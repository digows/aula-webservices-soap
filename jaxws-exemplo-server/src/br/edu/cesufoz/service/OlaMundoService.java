package br.edu.cesufoz.service;

import javax.jws.WebService;

@WebService(serviceName="OlaMundoService")
public class OlaMundoService {
	
	public String showMessage( String nome ) {
		return "Olá "+nome+", este é um serviço WS.";
	}
}