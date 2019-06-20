package br.com.zup.Países;
import java.util.ArrayList;
import java.util.List;
public class TestePais {

	package br.com.zup.teste;

	import java.util.ArrayList;
	import java.util.List;

	import br.com.zup.modelo.Pais;

	public class TestePais {

		public static void main(String[] args) {
			
			// Lista de países 
			List<Pais> paisesFronteiras = new ArrayList<Pais>();
			
			
			Pais pais = new Pais("BRA", "Brasil", 8514876);
			Pais segundoPais = new Pais("EUA", "Estados Unidos", 8514876);
			Pais terceiroPais = new Pais("FRA", "França", 8514876);
			Pais quartoPais = new Pais("CAN", "Canada", 8514876);
			
			paisesFronteiras.add(segundoPais);
			paisesFronteiras.add(terceiroPais);
			paisesFronteiras.add(quartoPais);
			
			pais.setpaisesFronteiras(paisesFronteiras);
			pais.setPopulacao(2000000000);
			segundoPais.setPopulacao(300000000);
			
			// Verificando se os países são iguais
			System.out.println(pais.verifaSaoIguais(segundoPais));
			
			// Verificando densidade populacional
			System.out.println(pais.calculaDensidade(pais.getPopulacao(), pais.getDimensao()));
			
			// Mostrando os países vizinhos
			System.out.println(pais);
			
		}

	}



