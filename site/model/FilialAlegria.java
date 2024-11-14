package site.model;

public class FilialAlegria extends Filial {
	
	private int  rosa;
	
	public FilialAlegria(int vermelho, int azulBebe, int amarelo, int branco, boolean estacionamento, String telefone,
			String endereço, int rosa) {
		super(vermelho, azulBebe, amarelo, branco, estacionamento, telefone, endereço);
		
		this.rosa = rosa;
	}

	

	
	public int getRosa() {
		return rosa;
	}

	public void setRosa(int rosa) {
		this.rosa = rosa;
	}

	@Override
	public void consultarLoja() {
		super.consultarLoja();
		System.out.println("nesta filial tambem temos "+ rosa +" unidades da cor rosa");
		
	}
	
	@Override
	public void consulestoque() {
		super.consulestoque();
		System.out.println("Rosa: "+ rosa);
		
	}

	

	
	
		
	
	
	
	

}
