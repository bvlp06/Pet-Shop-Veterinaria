package PetShopEveterinaria;

public class Selvagem extends Animal{
	
	boolean venenoso;
	
	public Selvagem (String especie,String tipo,String nomeAnimal, String ra�a, int idade, boolean venenoso){
		super( especie,tipo, nomeAnimal, ra�a, idade);
		this.venenoso = venenoso;
	}
	

}
