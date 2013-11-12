package br.edu.cesufoz.entity;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Veiculo {
	
	@XmlAttribute
	private int chassis;
	private String modelo;
	private String marca;
	@XmlElementWrapper
	@XmlElement(name="roda", nillable = false)
	private List<Roda> rodas = new ArrayList<>(4);
	@XmlElementWrapper
	@XmlElement(name="proprietario", nillable = false)
	private List<Proprietario> proprietarios = new ArrayList<>();
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public List<Roda> getRodas() {
		return rodas;
	}
	public void setRodas(List<Roda> rodas) {
		this.rodas = rodas;
	}
	public int getChassis() {
		return chassis;
	}
	public void setChassis(int id) {
		this.chassis = id;
	}
	public List<Proprietario> getProprietarios() {
		return proprietarios;
	}
	public void setProprietarios(List<Proprietario> proprietarios) {
		this.proprietarios = proprietarios;
	}
	@Override
	public String toString() {
		return "Veiculo [chassis=" + chassis + ", modelo=" + modelo
				+ ", marca=" + marca + ", rodas=" + rodas + ", proprietarios="
				+ proprietarios + "]";
	} 
	
	
}
