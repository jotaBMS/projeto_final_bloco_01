package site.model;

public class FilialArcoiris extends Filial {
	
	int marrom;

	public FilialArcoiris(int vermelho, int azulBebe, int amarelo, int branco, boolean estacionamento, String telefone,
			String endereço, int marrom) {
		super(vermelho, azulBebe, amarelo, branco, estacionamento, telefone, endereço);
		this.marrom = marrom;
	}

	public int getMarrom() {
		return marrom;
	}

	public void setMarrom(int marrom) {
		this.marrom = marrom;
	}

	@Override
	public void consultarLoja() {
		super.consultarLoja();
		System.out.println("nesta filial tambem temos "+ marrom +" unidades da cor marrom");
		
	}
	
	@Override
	public void consulestoque() {
		super.consulestoque();
		System.out.println("Marrom: "+ marrom);
		
	}

}
