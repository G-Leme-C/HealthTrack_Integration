package br.com.fiap.healthtrack.entities;

public class Alimento {
	
	public Alimento(int idAlimento, String nomeAlimento, long valorkCalGrama, long valorGordGrama, long valorCarbGrama,
			long valorProtGrama) {
		
		this.idAlimento = idAlimento;
		this.nomeAlimento = nomeAlimento;
		this.valorkCalGrama = valorkCalGrama;
		this.valorGordGrama = valorGordGrama;
		this.valorCarbGrama = valorCarbGrama;
		this.valorProtGrama = valorProtGrama;
	}

	public Alimento(String nomeAlimento, long valorkCalGrama, long valorGordGrama, long valorCarbGrama,
			long valorProtGrama) {
		
		this.nomeAlimento = nomeAlimento;
		this.valorkCalGrama = valorkCalGrama;
		this.valorGordGrama = valorGordGrama;
		this.valorCarbGrama = valorCarbGrama;
		this.valorProtGrama = valorProtGrama;
	}

	
	public Alimento(int idAlimento) {
		this.idAlimento = idAlimento;
	}

	private int idAlimento;
	public String nomeAlimento;
	public long valorkCalGrama;
	public long valorGordGrama;
	public long valorCarbGrama;
	public long valorProtGrama;
	

	public int getIdAlimento() {
		return idAlimento;
	}

	public void setIdAlimento(int idAlimento) {
		this.idAlimento = idAlimento;
	}

	public String getNomeAlimento() {
		return nomeAlimento;
	}

	public void setNomeAlimento(String nomeAlimento) {
		this.nomeAlimento = nomeAlimento;
	}

	public long getValorkCalGrama() {
		return valorkCalGrama;
	}

	public void setValorkCalGrama(long valorkCalGrama) {
		this.valorkCalGrama = valorkCalGrama;
	}

	public long getValorGordGrama() {
		return valorGordGrama;
	}

	public void setValorGordGrama(long valorGordGrama) {
		this.valorGordGrama = valorGordGrama;
	}

	public long getValorCarbGrama() {
		return valorCarbGrama;
	}

	public void setValorCarbGrama(long valorCarbGrama) {
		this.valorCarbGrama = valorCarbGrama;
	}

	public long getValorProtGrama() {
		return valorProtGrama;
	}

	public void setValorProtGrama(long valorProtGrama) {
		this.valorProtGrama = valorProtGrama;
	}
}
