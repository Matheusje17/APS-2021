package calculos;

import java.util.List;

import dados.CasosApontados;

public class Media {
	
	private List<CasosApontados> dados; 
	private double media,soma;
	
	public Media(List<CasosApontados> dados) {
		this.dados=dados;
	}

	public double getMedia() {
		for(CasosApontados v:dados) {
			soma += v.getQtdeCasos();
		}
		media = soma / dados.size();
		return media;
	}
	
}
