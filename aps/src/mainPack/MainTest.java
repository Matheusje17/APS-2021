package mainPack;

import calculos.DesvioPadrao;
import calculos.Media;
import calculos.Mediana;
//import calculos.Moda;
import calculos.Variancia;

public class MainTest {

	public static void main(String[] args) {
		Variancia var = new Variancia();
		DesvioPadrao desvio = new DesvioPadrao();
		Mediana meio = new Mediana();
		//Moda moda = new Moda();
		Media media = new Media();
		
		
		System.out.println("Resultados Obtidos a partir do gr�fico");
		System.out.println("");
		System.out.printf("Vari�ncia: " + var.getVarianca());
		System.out.println("");
		System.out.println("");
		System.out.printf("Desvio padr�o �: "  +desvio.getDesvio());
		System.out.println("");
		System.out.println("");
		System.out.println("Mediana �: " + meio.getResultado());
		System.out.println("");
		System.out.println("Media �: " + media.getMedia());
		System.out.println("");
		//moda.getModa();
		
	}

}
