package PetShopEveterinaria;

abstract class Animal {

	String especie;
	String tipo;
	String nomeAnimal;
	String ra�a;
	int idade;
	double valorTotal;
	Atendimento atendimento;
	
 public Animal(String especie, String tipo , 	String nomeAnimal, String ra�a, int idade ){
		this.especie = especie;
		this.tipo = tipo;
		this.nomeAnimal = nomeAnimal;
		this.ra�a= ra�a;
		this.idade = idade;
	}
	
	public void Atendimento(Atendimento atendimento){
		this.atendimento = atendimento;
	}
	
}
