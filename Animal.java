package PetShopEveterinaria;

abstract class Animal {

	String especie;
	String tipo;
	String nomeAnimal;
	String raça;
	int idade;
	double valorTotal;
	Atendimento atendimento;
	
 public Animal(String especie, String tipo , 	String nomeAnimal, String raça, int idade ){
		this.especie = especie;
		this.tipo = tipo;
		this.nomeAnimal = nomeAnimal;
		this.raça= raça;
		this.idade = idade;
	}
	
	public void Atendimento(Atendimento atendimento){
		this.atendimento = atendimento;
	}
	
}
