package PetShopEveterinaria;

import java.util.ArrayList;

class Atendimento {
	
	double preçoTotal;
	boolean statusPAGO;
	boolean statusRemedio;
	boolean statusRação;
	boolean statusAntipulga;
	boolean statusExame;
	boolean statusBanhoeTosa;
	boolean statusCirurgia;
	boolean statusConsulta;
	boolean statusVacina;
	ArrayList <ProdutoseProcedimentos> PP = new ArrayList<ProdutoseProcedimentos>(); 
	
	public void setStatusRemedio(boolean status){
		this.statusRemedio = status;
		if(statusRemedio == true){
		
		}
	}
	public void setStatusRação(boolean status){
		this.statusRação = status;
		System.out.println("Preço do Ração:");
	}
	public void setStatusAntipulga(boolean status){
		this.statusAntipulga = status;
		System.out.println("Preço do Antipulga:");
	}
	
	
	
	
	
	
}
