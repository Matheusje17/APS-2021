package design;

import dados.CasosApontados;
import dados.PreencheDados;
import javafx.fxml.FXML;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;

public class GraficoLinhaController {
	
	
	@FXML
	private LineChart<String, Integer> lineChart;
	
	@FXML
	private CategoryAxis x;
	
	@FXML
	private NumberAxis y;
	
	
	public void setLine(PreencheDados item) {
		if (item!=null) {
			for(CasosApontados caso: item.getCasosApontados()) {
				XYChart.Series<String, Integer> series = new XYChart.Series<>();
				series.getData().add(new XYChart.Data<>(caso.getCidade().getNomeCidade(),caso.getQtdeCasos()));
				lineChart.getData().add(series);
				
			}
		}

	}
	
	
	
}
