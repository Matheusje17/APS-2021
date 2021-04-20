package calculos;

import java.util.ArrayList;
import java.util.List;

public class Mediana {

	public static void main(String[] args) {
		
		List<Float> numeros = new ArrayList<>();
		
		numeros.add(158.0f);
		numeros.add(143.0f);
		numeros.add(66.0f);
		numeros.add(38.0f);
		numeros.add(24.0f);
		numeros.add(15.0f);
		numeros.add(11.0f);
		numeros.add(8.0f);
		numeros.add(5.0f);
		
		//calcular a mediana = 24.0
				
			calcularMediana(numeros);
			System.out.println();
			

	}
	
	public static void calcularMediana(List<Float>numeros) {
		
		float resultado = 0.0f;
		
		if(numeros.size()% 2 != 0) {
			
			int posicaoNumero = ((numeros.size() + 1) / 2) -1;
			resultado = numeros.get(posicaoNumero);		
			
			
		} else {
			int posicaoNumero = Math.round(numeros.size() + 1) / 2 - 1;
			resultado = ((numeros.get(posicaoNumero) + numeros.get(posicaoNumero + 1)) /2);
			
			
		}
		
		System.out.println("A mediana é : " + resultado);
	}

}
