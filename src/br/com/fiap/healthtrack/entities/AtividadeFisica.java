package br.com.fiap.healthtrack.entities;

public class AtividadeFisica {
	private int idAtividadeFisica;
	public String descricaoAtividadeF;
	public String tipoAtividadeF;
	public int valorKCalMinuto;
	
	public int getIdAtividadeFisica() {
		return idAtividadeFisica;
	}

	public void setIdAtividadeFisica(int idAtividadeFisica) {
		this.idAtividadeFisica = idAtividadeFisica;
	}

	public String getDescricaoAtividadeF() {
		return descricaoAtividadeF;
	}

	public void setDescricaoAtividadeF(String descricaoAtividadeF) {
		this.descricaoAtividadeF = descricaoAtividadeF;
	}

	public String getTipoAtividadeF() {
		return tipoAtividadeF;
	}

	public void setTipoAtividadeF(String tipoAtividadeF) {
		this.tipoAtividadeF = tipoAtividadeF;
	}

	public int getValorKCalMinuto() {
		return valorKCalMinuto;
	}

	public void setValorKCalMinuto(int valorKCalMinuto) {
		this.valorKCalMinuto = valorKCalMinuto;
	}
	
	public AtividadeFisica(int idAtividadeFisica, String descricaoAtividadeF, String tipoAtividadeF,
			int valorKCalMinuto) {
		this.idAtividadeFisica = idAtividadeFisica;
		this.descricaoAtividadeF = descricaoAtividadeF;
		this.tipoAtividadeF = tipoAtividadeF;
		this.valorKCalMinuto = valorKCalMinuto;
	}
	
	public AtividadeFisica(String descricaoAtividadeF, String tipoAtividadeF,
			int valorKCalMinuto) {
		this.descricaoAtividadeF = descricaoAtividadeF;
		this.tipoAtividadeF = tipoAtividadeF;
		this.valorKCalMinuto = valorKCalMinuto;
	}
	
	public AtividadeFisica(int idAtividadeFisica) {
		this.idAtividadeFisica = idAtividadeFisica;
	}
}
