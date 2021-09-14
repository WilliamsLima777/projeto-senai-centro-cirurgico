package org.senai.model;

public class Paciente {
	private int id ;
	private String nome = "";
	private String status = "";
	private String local = "";
	private String inicioPrevisto = "";
	private	String inicioCirurgia = "";
	private	String saidaCirurgia = "";
	private	String saidaPrevisto = "";
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	public String getInicioPrevisto() {
		return inicioPrevisto;
	}
	public void setInicioPrevisto(String inicioPrevisto) {
		this.inicioPrevisto = inicioPrevisto;
	}
	public String getInicioCirurgia() {
		return inicioCirurgia;
	}
	public void setInicioCirurgia(String inicioCirurgia) {
		this.inicioCirurgia = inicioCirurgia;
	}
	public String getSaidaCirurgia() {
		return saidaCirurgia;
	}
	public void setSaidaCirurgia(String saidaCirurgia) {
		this.saidaCirurgia = saidaCirurgia;
	}
	public String getSaidaPrevisto() {
		return saidaPrevisto;
	}
	public void setSaidaPrevisto(String saidaPrevisto) {
		this.saidaPrevisto = saidaPrevisto;
	}
	
	

}
