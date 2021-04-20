package mainPack;

import calculos.DesvioPadrao;
import calculos.Variancia;

public class MainTest {

	public static void main(String[] args) {
		Variancia var = new Variancia();
		DesvioPadrao desvio = new DesvioPadrao();
		
		System.out.printf("A Variancia é %.2f",var.getVarianca());
		System.out.println("");
		System.out.printf("O desvio é %.2f",desvio.getDesvio());

	}

}
