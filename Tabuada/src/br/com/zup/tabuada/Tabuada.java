package br.com.zup.tabuada;
import java.util.Scanner;
public class Tabuada {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int cont = 1;
		while(cont == 1) {
			System.out.println("Digite o numero da tabuada : " );
			int numero = scan.nextInt(); 
			System.out.println( "numero que você quer que comece sua tabuada");
			for(int controle = scan.nextInt(); controle <=10 ;controle ++) {
				System.out.println(numero + " X " + controle +" = " +(numero * controle));
				
			}
			System.out.println("Quer continuar digite 1 ");
			cont = scan.nextInt();
		}
		

	}

}

