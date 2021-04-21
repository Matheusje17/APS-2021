package calculos;
public class Variancia {
	
	private static final double testeMedia = 52;
	private double[] dados = {158,143,66,38,24,15,11,8,5};
	private double variancia;
	
	
	public void calculaVarianca() {
		
		variancia = (Math.pow(dados[0] - testeMedia,2)) 
				+ (Math.pow(dados[1] - testeMedia,2)) 
				+ (Math.pow(dados[2] - testeMedia,2)) 
				+ (Math.pow(dados[3] - testeMedia,2))
				+ (Math.pow(dados[4] - testeMedia,2)) 
				+ (Math.pow(dados[5] - testeMedia,2))
				+ (Math.pow(dados[6] - testeMedia,2))  
				+ (Math.pow(dados[7] - testeMedia,2))
				+ (Math.pow(dados[8] - testeMedia,2));
		
		this.variancia /=testeMedia;
		
		
	}
	
	public double getVarianca() {
		calculaVarianca();
		
		return variancia;
	}
	
}
