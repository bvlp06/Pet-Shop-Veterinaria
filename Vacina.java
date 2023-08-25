package PetShopEveterinaria;

public class Vacina extends ProdutoseProcedimentos {
	String qualVacina;
	public Vacina (String vacina, double preço ){
		super("Vacina",preço);
		this.qualVacina = vacina;
	}

}
