package br.com.zup.aula7;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class Exercicio1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("digite um numero : ");	
		int parImpar = scan.nextInt();
		List<Integer> listaImpas = new ArrayList<Integer>();
		List<Integer> par = new ArrayList<Integer>();	
		while(parImpar != 0  ) {
			if (parImpar % 2 ==0) {
				par.add(parImpar);

				System.out.println("É par! ");

			}else {
				listaImpas.add(parImpar);
				System.out.println("É impar! ");
			}
			System.out.println("digite um numero : ");	
			parImpar = scan.nextInt();
		}	
		int media = 0;
		for (Integer integer : par) {
			media += integer ;

		}
		System.out.println( "Lista dos valores impas :" + listaImpas);
		System.out.println("Lista de valores pares : " + par );
		System.out.println("A media dos valores da lista é :" + media/par.size());


		scan.close();
	}
}

