package br.com.zup.votos;

public class Candidato {

	String nome;
	int numero;
	int voto;
	public Candidato(String nome, int numero, int voto) {
		this.nome = nome;
		this.numero = numero;
		this.voto = voto;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getVoto() {
		return voto;
	}
	public void setVoto(int voto) {
		this.voto = voto;
	}
	
	public String toString() {
		String modelo = "";
		modelo +="Nome do candidato ->" + this.getNome() + "\n";
		modelo += "Numero do candidato -> " + this.getNumero() + "\n";
		modelo+= " voto -> " + this.getVoto() + "\n";
		return modelo;
	}
	 
}
