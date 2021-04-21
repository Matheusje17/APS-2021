package mainPack;

import calculos.DesvioPadrao;
import calculos.Variancia;

public class MainTest {

	public static void main(String[] args) {
		Variancia var = new Variancia();
		DesvioPadrao desvio = new DesvioPadrao();
		
		System.out.printf("Variância: %.2f",var.getVarianca());
		System.out.println("");
		System.out.printf("Desvio padrão é: %.2f",desvio.getDesvio());

	}

}
