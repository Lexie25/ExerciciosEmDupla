package br.com.zup.lista;
//import java.util.ArrayList;
//import java.util.List;
import java.util.Scanner;
public class ListaComSeparacao {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
//		List<Integer> sequencia = new ArrayList<Integer>();
		System.out.println("Digite o numero que você quer que comece : ");
		int controle = scan.nextInt();
		System.out.println("Que numero você que que termine:");
		int numeroDeSaida = scan.nextInt();
		for( int cont = controle; cont <= numeroDeSaida;cont++) {
			System.out.print(cont + ", ");
//			sequencia.add(cont);
		}
		
//		System.out.println("\n " + sequencia);
		
	}

}
