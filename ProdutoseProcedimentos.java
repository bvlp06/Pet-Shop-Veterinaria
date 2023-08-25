package PetShopEveterinaria;

public class ProdutoseProcedimentos {
	String nome;
	double preço;
	
	public ProdutoseProcedimentos (String nome, double preço){
		this.nome = nome;
		this.preço = preço;
	}
	public double getPreço(){
		return this.preço;
	}

}
