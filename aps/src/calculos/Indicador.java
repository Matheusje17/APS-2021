package calculos;

import java.util.List;

import dados.CasosApontados;

public class Indicador {
	private List<CasosApontados> casos;
	
	public Indicador(List<CasosApontados> casos) {
		this.casos=casos;
	}

	public String getMedia() {
		Media m = new Media(this.casos);
		return Double.toString(m.getMedia());
	}


	public String getCalcMediana() {
		Mediana mediana = new Mediana(this.casos);
		return Double.toString(mediana.getMediana());
	}

	public String getCalcModa() {
		
		Moda moda = new Moda(this.casos);
		if(moda.getModa()) {
			return "Amodal";
		}else {
			
			return Double.toString(moda.calcularModa());
		}
			
		
		
	}

	public String getCalcDesvio() {
		DesvioPadrao d = new DesvioPadrao(new Variancia(this.casos,Double.parseDouble(this.getMedia())));
		return d.getDesvio();
	}
	

	public String getCalcVariancia() {
		Variancia v= new Variancia(this.casos,Double.parseDouble(this.getMedia())); 
		return v.getVarianca();
	}
	
	

}
