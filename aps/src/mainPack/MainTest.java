package mainPack;

import calculos.DesvioPadrao;
import calculos.Mediana;
import calculos.Moda;
import calculos.Variancia;

public class MainTest {

	public static void main(String[] args) {
		Variancia var = new Variancia();
		DesvioPadrao desvio = new DesvioPadrao();
		Mediana meio = new Mediana();
		
		System.out.println("Resultados Obtidos a partir do gráfico");
		System.out.println("");
		System.out.printf("Variância: %.2f",var.getVarianca());
		System.out.println("");
		System.out.println("");
		System.out.printf("Desvio padrão é: %.2f",desvio.getDesvio());
		System.out.println("");
		System.out.println("");
		System.out.println("Mediana é: " + meio.getResultado());
		System.out.println("");
		
		Moda moda = new Moda();
		
	}

}
