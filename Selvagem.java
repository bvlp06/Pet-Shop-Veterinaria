package PetShopEveterinaria;

public class Selvagem extends Animal{
	
	boolean venenoso;
	
	public Selvagem (String especie,String tipo,String nomeAnimal, String raça, int idade, boolean venenoso){
		super( especie,tipo, nomeAnimal, raça, idade);
		this.venenoso = venenoso;
	}
	

}
