package PetShopEveterinaria;

public class Ração extends ProdutoseProcedimentos {
	String qualRação;
	public Ração(String ração, double preço ){
		super("Ração",preço);
		this.qualRação = ração;
	}
}
