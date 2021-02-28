package br.ubc.locadora;

import java.util.ArrayList;

public class Filial {
	String nome;
	int codigo;
	
	ArrayList<Filial> filias= new ArrayList<Filial>(); 
	
	
	Filial(String nome, int codigo){
		this.nome = nome;
		this.codigo = codigo;
	}

	
	void criarFilial(Filial f) {
		this.filias.add(f);
		
	}
}
