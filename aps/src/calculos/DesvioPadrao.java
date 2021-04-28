package calculos;

import java.text.DecimalFormat;



public class DesvioPadrao {
	
	private double desvioPadrao;
	
	public void calculaDesvio() {
		Variancia var = new Variancia();
		desvioPadrao = Math.sqrt(var.getVarianciaDouble());

	}
	
	public String getDesvio() {
		calculaDesvio();
		DecimalFormat df = new DecimalFormat("##.00");
		return df.format(desvioPadrao);
		
		
	}
	
}
