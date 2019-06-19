package br.com.zup.votos;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class candidatoteste {

	public static void main(String[] args) {
		Candidato cand = new Candidato("Brenda",25, 0);
		Candidato cand1 = new Candidato ("Andressa",1,0) ;
		Scanner scan = new Scanner(System.in);
		List<Candidato> listaCandidatos = new ArrayList<Candidato>();
		listaCandidatos.add(cand);
		listaCandidatos.add(cand1);
		
		
		for (Candidato candidato : listaCandidatos) {
			System.out.println("Digite o nummero do candidato: ");
			int numero = scan.nextInt();
			if(numero == candidato.getNumero()) {
				candidato.setVoto(candidato.getVoto());
				System.out.println("Voto" + candidato.getNome());
			}
			
		}		
		
	
	
	}

}
