package PetShopEveterinaria;

import java.util.ArrayList;

class Atendimento {
	
	double pre�oTotal;
	boolean statusPAGO;
	boolean statusRemedio;
	boolean statusRa��o;
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
	public void setStatusRa��o(boolean status){
		this.statusRa��o = status;
		System.out.println("Pre�o do Ra��o:");
	}
	public void setStatusAntipulga(boolean status){
		this.statusAntipulga = status;
		System.out.println("Pre�o do Antipulga:");
	}
	
	
	
	
	
	
}
