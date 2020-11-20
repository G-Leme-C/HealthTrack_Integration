package br.com.fiap.healthtrack.entities;

import java.time.LocalDate;

public class Usuario {
	
	public Usuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
	
	public Usuario() {	}
	
	
	private int idUsuario;
	public String nomeUsuario;
	public LocalDate dtNascUsuario;
	private String email;
	private String senhaUsuario;
	
	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNomeUsuario() {
		return nomeUsuario;
	}

	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}

	public LocalDate getDtNascUsuario() {
		return dtNascUsuario;
	}

	public void setDtNascUsuario(LocalDate dtNascUsuario) {
		this.dtNascUsuario = dtNascUsuario;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenhaUsuario() {
		return senhaUsuario;
	}

	public void setSenhaUsuario(String senhaUsuario) {
		this.senhaUsuario = senhaUsuario;
	}

}
