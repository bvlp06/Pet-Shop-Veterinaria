package PetShopEveterinaria;

import java.util.ArrayList;

public class Cliente {
	private String nomeCompleto;
	private int idade;
	private String CPF;
	private String endereço;
	private String email;
	private String telefone;
	ArrayList<Animal> animais = new ArrayList<Animal>();
	
	public Cliente(String nome , int idade , String CPF, String endereço, String telefone, String email){
		this.nomeCompleto = nome;
		this.idade = idade;
		this.CPF = CPF;
		this.endereço = endereço;
		this.email = email;
		this.telefone = telefone;
	} 
	
	public void addAnimal(Animal animal){
			animais.add(animal);
	}
	
	public void imprimirTUDO(){
		imprimirCliente();
		System.out.println(animais);		
	}

	public void imprimirCliente(){
	 System.out.println("Nome :" + this.nomeCompleto  );
	 System.out.println("Idade :" + this.idade  );
	 System.out.println("CPF :" + this.CPF );
	 System.out.println(" Endereço :" + this.endereço);
		System.out.println("Email:" + this.email);
	System.out.println("Telefone:" + this.telefone );
	}
	
	public String getCPF(){
		return CPF;
	}
}
