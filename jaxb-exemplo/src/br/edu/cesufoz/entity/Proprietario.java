package br.edu.cesufoz.entity;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Proprietario {
	private String nome;
	@XmlList//(@XMLValue) (@XmlElementWrapper @XmlElement)
	private List<String> telefones = new ArrayList<>();
	
	
	@Override
	public String toString() {
		return "Proprietario [nome=" + nome + ", telefones=" + telefones + "]";
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List<String> getTelefones() {
		return telefones;
	}
	public void setTelefones(List<String> telefones) {
		this.telefones = telefones;
	}
}
