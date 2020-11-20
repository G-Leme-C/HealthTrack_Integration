package br.com.fiap.healthtrack.entities;

import java.util.ArrayList;

public class Cliente extends Usuario {

	public Cliente() {
		super();
	}
	
	public float valorAltura;
	private int tipoPlanoAssinatura;
	public ArrayList<AlimentacaoRealizada> alimentacaoRealizada;
	public ArrayList<AtividadeFisicaPraticada> atvFisicasPraticadas;
	public ArrayList<InscricaoEvento> inscricoesEventos;
	public ArrayList<Pesagem> pesagens;
	
	public float getValorAltura() {
		return valorAltura;
	}
	public void setValorAltura(float valorAltura) {
		this.valorAltura = valorAltura;
	}
	public int getTipoPlanoAssinatura() {
		return tipoPlanoAssinatura;
	}
	public void setTipoPlanoAssinatura(int tipoPlanoAssinatura) {
		this.tipoPlanoAssinatura = tipoPlanoAssinatura;
	}
	public ArrayList<AlimentacaoRealizada> getAlimentacaoRealizada() {
		return alimentacaoRealizada;
	}
	public void setAlimentacaoRealizada(ArrayList<AlimentacaoRealizada> alimentacaoRealizada) {
		this.alimentacaoRealizada = alimentacaoRealizada;
	}
	public ArrayList<AtividadeFisicaPraticada> getAtvFisicasPraticadas() {
		return atvFisicasPraticadas;
	}
	public void setAtvFisicasPraticadas(ArrayList<AtividadeFisicaPraticada> atvFisicasPraticadas) {
		this.atvFisicasPraticadas = atvFisicasPraticadas;
	}
	public ArrayList<InscricaoEvento> getInscricoesEventos() {
		return inscricoesEventos;
	}
	public void setInscricoesEventos(ArrayList<InscricaoEvento> inscricoesEventos) {
		this.inscricoesEventos = inscricoesEventos;
	}
	public ArrayList<Pesagem> getPesagens() {
		return pesagens;
	}
	public void setPesagens(ArrayList<Pesagem> pesagens) {
		this.pesagens = pesagens;
	}

}
