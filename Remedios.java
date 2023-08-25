package PetShopEveterinaria;

public class Remedios extends ProdutoseProcedimentos {
	String qualRemedio;
	public Remedios(String remedio, double preço ){
		super("Remedio",preço);
		this.qualRemedio = remedio;
	}
	
}
