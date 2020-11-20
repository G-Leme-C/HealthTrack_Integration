package br.com.fiap.healthtrack.entities;

public class InscricaoEvento {

	public InscricaoEvento(int idInscricao, Usuario usuarioInscrito, Evento evento) {
		this.idInscricao = idInscricao;
		this.usuarioInscrito = usuarioInscrito;
		this.evento = evento;
	}

	private int idInscricao;
	private Usuario usuarioInscrito;
	private Evento evento; 
	
	public int getIdInscricao() {
		return idInscricao;
	}

	public void setIdInscricao(int idInscricao) {
		this.idInscricao = idInscricao;
	}

	public Usuario getUsuarioInscrito() {
		return usuarioInscrito;
	}

	public void setUsuarioInscrito(Usuario usuarioInscrito) {
		this.usuarioInscrito = usuarioInscrito;
	}

	public Evento getEvento() {
		return evento;
	}

	public void setEvento(Evento evento) {
		this.evento = evento;
	}

}
