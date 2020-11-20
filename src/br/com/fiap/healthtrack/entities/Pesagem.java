package br.com.fiap.healthtrack.entities;

import java.sql.Date;

public class Pesagem {

	private int idPesagem;
	private int idUsuario;
	public Date dhPeso;
	public float valorPeso;
	
	public Pesagem(int idPesagem, int idUsuario, Date dhPeso, float valorPeso) {
		this.idPesagem = idPesagem;
		this.idUsuario = idUsuario;
		this.dhPeso = dhPeso;
		this.valorPeso = valorPeso;
	}
	
	public int getIdPesagem() {
		return idPesagem;
	}

	public void setIdPesagem(int idPesagem) {
		this.idPesagem = idPesagem;
	}

	public Date getDhPeso() {
		return dhPeso;
	}

	public void setDhPeso(Date dhPeso) {
		this.dhPeso = dhPeso;
	}

	public float getValorPeso() {
		return valorPeso;
	}

	public void setValorPeso(float valorPeso) {
		this.valorPeso = valorPeso;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public void registrarPesagem() {

	}

	public void alterarPesagem() {

	}

	public void deletarPesagem() {

	}

	public Pesagem consultarPesagem() {
		return null;
	}
}
