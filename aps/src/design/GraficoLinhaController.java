package design;

import dados.CasosApontados;
import dados.PreencheDados;
import javafx.fxml.FXML;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;

public class GraficoLinhaController {
	
	private PreencheDados preencheDados;
	GraficoLinhaController(PreencheDados preencheDados){
		this.setPreencheDados(preencheDados);
	}
	
	@FXML
	private LineChart<String, Integer> lineChart;
	
	
	public void setLine(PreencheDados item) {
		if (item!=null) {
			for(CasosApontados caso: item.getCasosApontados()) {
				XYChart.Series<String, Integer> series = new XYChart.Series<>();
				series.getData().add(new XYChart.Data<>(caso.getCidade().getNomeCidade(),caso.getQtdeCasos()));
				lineChart.getData().add(series);
			}
		}

	}


	
	
	public PreencheDados getPreencheDados() {
		return preencheDados;
	}


	public void setPreencheDados(PreencheDados preencheDados) {
		this.preencheDados = preencheDados;
	}
	
	
	
}
