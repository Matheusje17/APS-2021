package calculos;

public class DesvioPadrao {
	
	private double desvioPadrao;
	
	public void calculaDesvio() {
		Variancia var = new Variancia();
		desvioPadrao = Math.sqrt(var.getVarianca());
	}
	
	public double getDesvio() {
		calculaDesvio();

		return desvioPadrao;
		
		sdfsdfsfsdfsd
	}
	
}
