package calculos;

import java.text.DecimalFormat;
import java.util.List;

import dados.CasosApontados;

public class Variancia {
	
	private double vlMedia ;
	private List<CasosApontados> casos ;
	private double variancia;
	private double soma;
	
	public  Variancia(List<CasosApontados> casos,Double vlMedia) {
		this.casos=casos;
		this.vlMedia=vlMedia;
	}
	
	public void calculaVarianca() {

		for(CasosApontados c:this.casos) {
			soma = Math.pow(c.getQtdeCasos() - vlMedia,2);
			variancia +=soma;
		}
		variancia /=vlMedia;
	}
	
	public String getVarianca() {
		calculaVarianca();
		DecimalFormat df = new DecimalFormat("###.000");
		return df.format(variancia);
	}
	
	public Double getVarianciaDouble() {
		calculaVarianca();

		return variancia;
	}
	
}
