package br.ubc.locadora;

import java.util.ArrayList;

public class Filme {
	
	String nomeFilme;
	int codigoF;
	
	ArrayList<Filme> filmes = new ArrayList<Filme>();
	
	Filme(String nome, int codigo){
		this.nomeFilme = nome;
		this.codigoF = codigo;
		
	}
	
	void inserirFilme(Filme c) {
		this.filmes.add(c);
		
	}
	

}
