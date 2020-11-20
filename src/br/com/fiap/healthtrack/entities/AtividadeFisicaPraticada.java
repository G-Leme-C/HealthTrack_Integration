package br.com.fiap.healthtrack.entities;

import java.util.Date;

public class AtividadeFisicaPraticada {
	
	public AtividadeFisicaPraticada(int idAtvFisicaPraticada, AtividadeFisica atividadeFisica, int idUsuario,
			long tempoPraticado, Date dhPratica, long distanciaPercorridaMetros, long elevacaoMetros,
			int bpmMedio) {
		this.idAtvFisicaPraticada = idAtvFisicaPraticada;
		this.atividadeFisica = atividadeFisica;
		this.idUsuario = idUsuario;
		this.tempoPraticado = tempoPraticado;
		this.dhPratica = dhPratica;
		this.distanciaPercorridaMetros = distanciaPercorridaMetros;
		this.elevacaoMetros = elevacaoMetros;
		this.bpmMedio = bpmMedio;
	}

	
	public AtividadeFisicaPraticada(AtividadeFisica atividadeFisica, int idUsuario,
			long tempoPraticado, Date dhPratica, long distanciaPercorridaMetros, long elevacaoMetros,
			int bpmMedio) {
		this.atividadeFisica = atividadeFisica;
		this.idUsuario = idUsuario;
		this.tempoPraticado = tempoPraticado;
		this.dhPratica = dhPratica;
		this.distanciaPercorridaMetros = distanciaPercorridaMetros;
		this.elevacaoMetros = elevacaoMetros;
		this.bpmMedio = bpmMedio;
	}
	
	private int idAtvFisicaPraticada;
	private AtividadeFisica atividadeFisica;
	private int idUsuario;
	private long tempoPraticado;
	private Date dhPratica;
	private long distanciaPercorridaMetros;
	private long elevacaoMetros;
	private int bpmMedio;
	
	public int getIdAtvFisicaPraticada() {
		return idAtvFisicaPraticada;
	}

	public void setIdAtvFisicaPraticada(int idAtvFisicaPraticada) {
		this.idAtvFisicaPraticada = idAtvFisicaPraticada;
	}

	public AtividadeFisica getAtividadeFisica() {
		return atividadeFisica;
	}

	public void setAtividadeFisica(AtividadeFisica atividadeFisica) {
		this.atividadeFisica = atividadeFisica;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
	
	public long getTempoPraticado() {
		return tempoPraticado;
	}

	public void setTempoPraticado(long tempoPraticado) {
		this.tempoPraticado = tempoPraticado;
	}

	public Date getDhPratica() {
		return dhPratica;
	}

	public void setDhPratica(Date dhPratica) {
		this.dhPratica = dhPratica;
	}

	public long getDistanciaPercorridaMetros() {
		return distanciaPercorridaMetros;
	}

	public void setDistanciaPercorridaMetros(long distanciaPercorridaMetros) {
		this.distanciaPercorridaMetros = distanciaPercorridaMetros;
	}

	public long getElevacaoMetros() {
		return elevacaoMetros;
	}

	public void setElevacaoMetros(long elevacaoMetros) {
		this.elevacaoMetros = elevacaoMetros;
	}

	public int getBpmMedio() {
		return bpmMedio;
	}

	public void setBpmMedio(int bpmMedio) {
		this.bpmMedio = bpmMedio;
	}
}
