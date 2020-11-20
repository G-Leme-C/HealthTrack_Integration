package br.com.fiap.healthtrack.entities;

import java.util.ArrayList;
import java.util.Date;

public class Evento {
	
	public Evento(int idEvento, Date dhInicioEvento, Date dhFinalEvento, String latitudeLocalEvento,
			String longitudeLocalEvento, String descricaoEvento, int qtMaximaParticipantes) {
		
		this.idEvento = idEvento;
		this.dhInicioEvento = dhInicioEvento;
		this.dhFinalEvento = dhFinalEvento;
		this.latitudeLocalEvento = latitudeLocalEvento;
		this.longitudeLocalEvento = longitudeLocalEvento;
		this.descricaoEvento = descricaoEvento;
		this.qtMaximaParticipantes = qtMaximaParticipantes;
	
	}
	
	
	public Evento(Date dhInicioEvento, Date dhFinalEvento, String latitudeLocalEvento,
			String longitudeLocalEvento, String descricaoEvento, int qtMaximaParticipantes) {
		
		this.dhInicioEvento = dhInicioEvento;
		this.dhFinalEvento = dhFinalEvento;
		this.latitudeLocalEvento = latitudeLocalEvento;
		this.longitudeLocalEvento = longitudeLocalEvento;
		this.descricaoEvento = descricaoEvento;
		this.qtMaximaParticipantes = qtMaximaParticipantes;
	
	}
	
	
	public Evento(int idEvento) {
		this.idEvento = idEvento;
	}

	private int idEvento;
	private Date dhInicioEvento;
	private Date dhFinalEvento;
	private String latitudeLocalEvento;
	private String longitudeLocalEvento;
	private String descricaoEvento;
	private int qtMaximaParticipantes;
	private ArrayList<AtividadeFisica> atividadesFisicasInclusas;
	
	public int getIdEvento() {
		return idEvento;
	}

	public void setIdEvento(int idEvento) {
		this.idEvento = idEvento;
	}

	public Date getDhInicioEvento() {
		return dhInicioEvento;
	}

	public void setDhInicioEvento(Date dhInicioEvento) {
		this.dhInicioEvento = dhInicioEvento;
	}

	public Date getDhFinalEvento() {
		return dhFinalEvento;
	}

	public void setDhFinalEvento(Date dhFinalEvento) {
		this.dhFinalEvento = dhFinalEvento;
	}

	public String getLatitudeLocalEvento() {
		return latitudeLocalEvento;
	}

	public void setLatitudeLocalEvento(String latitudeLocalEvento) {
		this.latitudeLocalEvento = latitudeLocalEvento;
	}

	public String getLongitudeLocalEvento() {
		return longitudeLocalEvento;
	}

	public void setLongitudeLocalEvento(String longitudeLocalEvento) {
		this.longitudeLocalEvento = longitudeLocalEvento;
	}

	public String getDescricaoEvento() {
		return descricaoEvento;
	}

	public void setDescricaoEvento(String descricaoEvento) {
		this.descricaoEvento = descricaoEvento;
	}

	public int getQtMaximaParticipantes() {
		return qtMaximaParticipantes;
	}

	public void setQtMaximaParticipantes(int qtMaximaParticipantes) {
		this.qtMaximaParticipantes = qtMaximaParticipantes;
	}

	public ArrayList<AtividadeFisica> getAtividadesFisicasInclusas() {
		return atividadesFisicasInclusas;
	}

	public void setAtividadesFisicasInclusas(ArrayList<AtividadeFisica> atividadesFisicasInclusas) {
		this.atividadesFisicasInclusas = atividadesFisicasInclusas;
	}

}
