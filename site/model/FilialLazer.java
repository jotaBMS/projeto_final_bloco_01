package site.model;

public class FilialLazer extends Filial {
	
	
	int bege;
	
	public FilialLazer(int vermelho, int azulBebe, int amarelo, int branco, boolean estacionamento, String telefone,
			String endereço,int bege) {
		super(vermelho, azulBebe, amarelo, branco, estacionamento, telefone, endereço);
				
		this.bege = bege;
		
	}
	
	

	public int getBege() {
		return bege;
	}

	public void setBege(int bege) {
		this.bege = bege;
	}
	
	@Override
	public void consultarLoja() {
		super.consultarLoja();
		System.out.println("nesta filial tambem temos "+ bege +" unidades da cor bege");
		
	}
	
	@Override
	public void consulestoque() {
		super.consulestoque();
		System.out.println("Bege: "+ bege);
		
	}



}
