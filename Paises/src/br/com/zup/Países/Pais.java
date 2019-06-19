package br.com.zup.Países;
import java.util.List;
import java.util.ArrayList;
public class Pais {

	private String codigoISO= "BRA";
	private String nome;
	private double populacao;
	private double dimencao;
	List<String> paisesFronteiras = new ArrayList<String>();
	public Pais(String codigoISO, String nome, double populacao, double dimencao, List<String> paisesfronteiras) {

		this.codigoISO = codigoISO;
		this.nome = nome;
		this.populacao = populacao;
		this.dimencao = dimencao;
		this.paisesFronteiras = paisesfronteiras;

	}

	public String getCodigoISO() {
		return codigoISO;
	}

	public void setCodigoISO(String codigoISO) {
		this.codigoISO = codigoISO;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPopulacao() {
		return populacao;
	}

	public void setPopulacao(double populacao) {
		this.populacao = populacao;
	}

	public double getDimencao() {
		return dimencao;
	}

	public void setDimencao(double dimencao) {
		this.dimencao = dimencao;
	}

	public List<String> getPaisesFronteiras() {
		return paisesFronteiras;
	}

	public void setPaisesFronteiras(List<String> paisesFronteiras) {
		this.paisesFronteiras = paisesFronteiras;
	}

	public void setPaisesfronteiras(List<String> paisesfronteiras) {
		this.paisesFronteiras = paisesfronteiras;
	}

	public String verifaSaoIgual(Pais pais) {
		if(this.getCodigoISO().equalsIgnoreCase(pais.codigoISO)) {
			return "Os países são semelhantes";
		}else {
			return "Os países não são semelhantes";
		}	
	}

	public double colcularDensidade(int pessoas, double dimensao) {
		double densidade;
		densidade = pessoas / dimensao;

		return densidade;

	}




	@Override
	public String toString() {
		String modelo = "";
		modelo += "Código ISO -> " + this.getCodigoISO();
		modelo += "Nome do país -> " + this.getNome();
		modelo += "População -> " + this.getPopulacao();
		modelo += "Dimensão -> " + this.getDimencao();
		modelo += "Países que fazem fronteira " + this.getPaisesFronteiras();

		return modelo;

	}




}
