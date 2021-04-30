package calculos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Moda {
	public static void main (String args []) {
		MainExecuta m = new MainExecuta();
		List<Float> numeros = new ArrayList<>();
		numeros.add(158.0f);
		numeros.add(148.0f);
		numeros.add(66.0f);
		numeros.add(38.0f);
		numeros.add(24.0f);
		numeros.add(15.0f);
		numeros.add(11.0f);
		numeros.add(8.0f);
		numeros.add(5.0f);
		
		m.calcularModa(numeros);
	}
	
}


class MainExecuta {
	

	
	
	
	
	boolean condicao = true;
	List<Float> numeros = new ArrayList<>();
	public MainExecuta() {
		

		//List<Float> numeros = new ArrayList<>();
		
		numeros.add(158.0f);
		numeros.add(158.0f);
		numeros.add(66.0f);
		numeros.add(38.0f);
		numeros.add(24.0f);
		numeros.add(15.0f);
		numeros.add(11.0f);
		numeros.add(8.0f);
		numeros.add(5.0f);
		
		
		//calcular a mediana = 24.0
				
			
			//System.out.println();

	}
	
	public float calcularModa (List<Float>numeros) {
		Map<Float, Integer> frequenciaNumeros = new HashMap<>();
		

		int maiorFrequencia = 0;
		
		for (Float numero : numeros) {
			Integer quantidade = frequenciaNumeros.get(numero);
			
			if (quantidade == null) {
				quantidade = 1;
			} else {
				quantidade += 1;
			}
			frequenciaNumeros.put(numero, quantidade);
			
			if (maiorFrequencia < quantidade) {
				maiorFrequencia = quantidade;
			}
		}
		
		System.out.print("A moda é : " );
		

		
		for (Float numeroChave : frequenciaNumeros.keySet()) {
			int quantidade = frequenciaNumeros.get(numeroChave);
			if (maiorFrequencia == quantidade && maiorFrequencia>1) {
				return numeroChave;
			}
		}
		
		return 0f;
		
	}
	

	public float getModa() {
		calcularModa(numeros);
		return this.getModa();
		
	}
	
	

}
