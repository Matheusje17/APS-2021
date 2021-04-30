package calculos;

import java.text.DecimalFormat;



public class DesvioPadrao {
	
	private double desvioPadrao;
	private Variancia varianca; 
	
	public DesvioPadrao(Variancia varianca) {
		this.varianca=varianca;
		
	}
	public void calculaDesvio() {
		desvioPadrao = Math.sqrt(this.varianca.getVarianciaDouble());
	}
	
	public String getDesvio() {
		calculaDesvio();
		DecimalFormat df = new DecimalFormat("##.00");
		return df.format(desvioPadrao);
		
		
	}
	
}
