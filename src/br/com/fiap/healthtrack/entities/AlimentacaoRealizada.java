package br.com.fiap.healthtrack.entities;

import java.util.Date;

public class AlimentacaoRealizada {

	public AlimentacaoRealizada(int idAlimentacao, int idUsuario, Date dhAlimentacao, int quantidadeAlimentoGramas,
			Alimento alimento) {
		this.idAlimentacao = idAlimentacao;
		this.idUsuario = idUsuario;
		this.dhAlimentacao = dhAlimentacao;
		this.quantidadeAlimentoGramas = quantidadeAlimentoGramas;
		this.alimento = alimento;
	}

	private int idAlimentacao;
	private int idUsuario;
	private Date dhAlimentacao;
	private int quantidadeAlimentoGramas;
	private Alimento alimento;
	
	public int getIdAlimentacao() {
		return idAlimentacao;
	}

	public void setIdAlimentacao(int idAlimentacao) {
		this.idAlimentacao = idAlimentacao;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public Date getDhAlimentacao() {
		return dhAlimentacao;
	}

	public void setDhAlimentacao(Date dhAlimentacao) {
		this.dhAlimentacao = dhAlimentacao;
	}

	public int getQuantidadeAlimentoGramas() {
		return quantidadeAlimentoGramas;
	}

	public void setQuantidadeAlimentoGramas(int quantidadeAlimentoGramas) {
		this.quantidadeAlimentoGramas = quantidadeAlimentoGramas;
	}

	public Alimento getAlimento() {
		return alimento;
	}

	public void setAlimento(Alimento alimento) {
		this.alimento = alimento;
	}
}
