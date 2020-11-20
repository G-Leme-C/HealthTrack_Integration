package br.com.fiap.healthtrack.entities;

public class Administrador extends Usuario {

	private boolean permissaoAlterarAlimentos;
	private boolean permissaoAlterarAtvFisica;
	
	public boolean isPermissaoAlterarAlimentos() {
		return permissaoAlterarAlimentos;
	}
	public void setPermissaoAlterarAlimentos(boolean permissaoAlterarAlimentos) {
		this.permissaoAlterarAlimentos = permissaoAlterarAlimentos;
	}
	public boolean isPermissaoAlterarAtvFisica() {
		return permissaoAlterarAtvFisica;
	}
	public void setPermissaoAlterarAtvFisica(boolean permissaoAlterarAtvFisica) {
		this.permissaoAlterarAtvFisica = permissaoAlterarAtvFisica;
	}
}
