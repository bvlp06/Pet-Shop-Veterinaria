package PetShopEveterinaria;

import java.util.ArrayList;

public class BancoDeDados {
	
	ArrayList<Cliente> listaCliente = new ArrayList<Cliente>();
	
	public void addCliente(Cliente cliente){
			listaCliente.add(cliente);
	}
	public Cliente buscarCliente(String CPF){
		Cliente cliente;
		for(int i=0; i<listaCliente.size(); i++){
			if(CPF.equals(listaCliente.get(i).getCPF())){
				cliente = listaCliente.get(i);
				return cliente;
			}
		}
		System.out.println("Esse cliente não esta cadastrado nesse sistema:");
		return null;
	}
	
	public void addAnimaldoCliente(String CPF, Animal animal){
		Cliente cliente = buscarCliente(CPF);	
		cliente.addAnimal(animal);
	}
}

