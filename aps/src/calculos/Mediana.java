package calculos;

import java.util.List;

import dados.CasosApontados;

public class Mediana {

	private double resultado;
	private List <CasosApontados> dados;
	
	
	public Mediana(List <CasosApontados> dados) {	
		this.dados = dados;
	}

	
	public double getMediana() {
		
		double resultado;
		
		if(dados.size()% 2 != 0) {
			
			int posicaoNumero = ((dados.size() + 1) / 2) -1;
			resultado = dados.get(posicaoNumero).getQtdeCasos();		
			
		} else {
			int posicaoNumero = Math.round(dados.size() + 1) / 2 - 1;
			resultado = ((dados.get(posicaoNumero).getQtdeCasos() + dados.get(posicaoNumero + 1).getQtdeCasos()) /2);	
		}
		
		this.resultado = resultado;
		
		return this.resultado;
	}
	
	

}
