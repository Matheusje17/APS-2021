package calculos;

public class Media {
	
	private double[] dados = {158,143,66,38,24,15,11,8,5};
	private double media;
	
	public double getMedia() {
		for(int i = 0; i < dados.length;i++) {
			media += dados[i];
		}
		return media/=dados.length;	
	}
	
}
