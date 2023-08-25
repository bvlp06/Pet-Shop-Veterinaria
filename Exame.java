package PetShopEveterinaria;

public class Exame extends ProdutoseProcedimentos{
	String qualExame;
	public Exame(double preço, String exame ){
		super("Exame",preço);
		this.qualExame = exame;
	}

}
