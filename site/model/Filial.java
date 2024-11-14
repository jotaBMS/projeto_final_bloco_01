package site.model;

import java.util.HashMap;

public abstract class Filial {

	private String tintaVermelho, tintaAzulBebe, tintaAmarelo, tintaBranco;
	private int vermelho=50, azulBebe, amarelo, branco;
	private boolean estacionamento;
	private String telefone, endereço;

	public Filial(int vermelho, int azulBebe, int amarelo, int branco, boolean estacionamento, String telefone,
			String endereço) {

		this.vermelho = vermelho;
		this.azulBebe = azulBebe;
		this.amarelo = amarelo;
		this.branco = branco;
		this.estacionamento = estacionamento;
		this.telefone = telefone;
		this.endereço = endereço;
	}

	public int getVermelho() {
		return vermelho;
	}

	public void setVermelho(int vermelho) {
		this.vermelho = vermelho;
	}

	public int getAzulBebe() {
		return azulBebe;
	}

	public void setAzulBebe(int azulBebe) {
		this.azulBebe = azulBebe;
	}

	public int getAmareloSol() {
		return amarelo;
	}

	public void setAmareloSol(int amareloSol) {
		this.amarelo = amareloSol;
	}

	public int getBranco() {
		return branco;
	}

	public void setBranco(int branco) {
		this.branco = branco;
	}

	public boolean isEstacionamento() {
		return estacionamento;
	}

	public void setEstacionamento(boolean estacionamento) {
		this.estacionamento = estacionamento;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEndereço() {
		return endereço;
	}

	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}
	
	public void consultarLoja() {
		
		HashMap<String, Integer> estoque = new HashMap<>();
		
		estoque.put("tintaVermelho", vermelho);
		estoque.put("tintaBranco", branco);
		estoque.put("tintaAzulBebe", azulBebe);
		estoque.put("tintaAmarelo", amarelo);
		
		System.out.println("tem estacionamento: "+ estacionamento);
		System.out.println("Telefone para contato: "+telefone);
		System.out.println("Endereço do estabelecimento: "+endereço);
		System.out.println(estoque);
		
		
		
	}
	
	public void consulestoque() {
		System.out.println("Vermelho: "+ vermelho);
		System.out.println("Branco: "+ branco);
		System.out.println("Azul beê: "+ azulBebe);
		System.out.println("Amarelo: "+ amarelo);
		
	}
	
	

}

















