package calculos;
public class Variancia {
	
	Media media = new Media();
	private double[] dados = {158,143,66,38,24,15,11,8,5};
	private double variancia;
	
	
	public void calculaVarianca() {
		
		variancia = (Math.pow(dados[0] - media.getMedia(),2)) 
				+ (Math.pow(dados[1] - media.getMedia(),2)) 
				+ (Math.pow(dados[2] - media.getMedia(),2)) 
				+ (Math.pow(dados[3] - media.getMedia(),2))
				+ (Math.pow(dados[4] - media.getMedia(),2)) 
				+ (Math.pow(dados[5] - media.getMedia(),2))
				+ (Math.pow(dados[6] - media.getMedia(),2))  
				+ (Math.pow(dados[7] - media.getMedia(),2))
				+ (Math.pow(dados[8] - media.getMedia(),2));
		
		this.variancia /=media.getMedia();
		
		
	}
	
	public double getVarianca() {
		calculaVarianca();
		
		return variancia;
	}
	
}
