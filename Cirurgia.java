package PetShopEveterinaria;

public class Cirurgia extends ProdutoseProcedimentos {
	String qualCirurgia;
	public Cirurgia (String cirurgia, double preço ){
		super("Cirurgia",preço);
		this.qualCirurgia = cirurgia;
	}
}
