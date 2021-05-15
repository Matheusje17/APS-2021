package calculos;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import dados.CasosApontados;

public class Moda {
	boolean condicao =false;
	private List<CasosApontados>dados;
	public Moda(List<CasosApontados>dados) {
		this.dados = dados;
	}
	public float calcularModa () {
		Map<Integer, Integer> frequenciaNumeros = new HashMap<>();
		int maiorFrequencia = 0;		
		for (CasosApontados casos : dados) {
			@SuppressWarnings("unlikely-arg-type")
			Integer quantidade = frequenciaNumeros.get(casos);
			
			if (quantidade == null) {
				quantidade = 1;
			} else {
				quantidade += 1;
			}
			frequenciaNumeros.put(casos.getQtdeCasos(), quantidade);
			
			if (maiorFrequencia < quantidade) {
				maiorFrequencia = quantidade;
			}
		}
		for (int numeroChave : frequenciaNumeros.keySet()) {
			int quantidade = frequenciaNumeros.get(numeroChave);
			if (maiorFrequencia == quantidade && maiorFrequencia>1) {
				return numeroChave;
				
			}else {
				condicao=false;	
			}
		}
		return 0f;
	}
	public boolean getModa() {
		return condicao;
	}
}
