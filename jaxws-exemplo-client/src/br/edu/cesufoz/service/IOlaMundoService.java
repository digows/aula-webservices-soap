package br.edu.cesufoz.service;

import javax.jws.WebService;

@WebService(targetNamespace = "http://service.cesufoz.edu.br/", name="OlaMundoService")
public interface IOlaMundoService {
	public String showMessage( String nome );
}