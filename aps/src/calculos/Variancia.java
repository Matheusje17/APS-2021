package calculos;
public class Variancia {
	
	Media media = new Media();
	private double[] dados = {158,143,66,38,24,15,11,8,5};
	private double variancia;
	private double soma;
	
	public void calculaVarianca() {
		double m = media.getMedia();
		for(int i = 0; i < dados.length;i++) {
			soma = Math.pow(dados[i] - m,2);
			variancia +=soma;
		}
		variancia /=m;
	}
	
	public double getVarianca() {
		calculaVarianca();
		
		return variancia;
	}
	
}
