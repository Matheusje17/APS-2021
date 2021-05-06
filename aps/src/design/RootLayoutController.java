package design;

import javafx.fxml.FXML;

public class RootLayoutController {
	@FXML
	private void opcaoGraficoLinha() {
		MainTela mainTela = new MainTela();
		mainTela.showLineChart();
	}
	
}
