package design;

import calculos.Indicador;
import dados.CasosApontados;
import dados.PreencheDados;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.XYChart;

public class Aps2021Controller {
	
	@FXML
	private TableView<CasosApontados> dadosTable;
	
	@FXML
	private TableColumn<CasosApontados,String> nomeCidadeColumn;
	
	@FXML
	private TableColumn<CasosApontados, Integer> qtdCasosColumn;
	
	@FXML
	private Label media;
	@FXML
	private Label mediana;
	@FXML
	private Label moda;
	@FXML
	private Label desvioPadrao;
	@FXML
	private Label variancia;
	
	@FXML
	private BarChart<String,Integer> barChart;
	
	@FXML
	private CategoryAxis eixoX;
	
	@FXML
	private CategoryAxis eixoXLine;
	
	
	@SuppressWarnings("unused")
	private PreencheDados preencheDados;
	//private Cidade nomeCidade;
	//private CasosApontados grafico;
	

	public Aps2021Controller() {
		
	}
	
	
	public void mostraCalculo() {
		Indicador ind= new Indicador(this.preencheDados.getCasosApontados()); 
		
		media.setText(ind.getMedia());
		mediana.setText(ind.getCalcMediana());
		moda.setText(ind.getCalcModa());
		desvioPadrao.setText(ind.getCalcDesvio());
		variancia.setText(ind.getCalcVariancia());
	}
	
	
	@FXML
	private void initialize() {
		nomeCidadeColumn.setCellValueFactory(cellData-> cellData.getValue().cidadeProperty().get().nomeCidadeProperty());
		qtdCasosColumn.setCellValueFactory(cellData -> cellData.getValue().qtdCasosProperty().asObject());
		
			
	}
	
	public void setPreencheDados(PreencheDados preencheDados) {
		this.preencheDados = preencheDados;
		dadosTable.setItems(preencheDados.getCasosApontados());
		
	}
	
	public void setBarra(PreencheDados item) {
		if (item!=null) {
			for(CasosApontados caso: item.getCasosApontados()) {
				XYChart.Series<String, Integer> series = new XYChart.Series<>();
				series.getData().add(new XYChart.Data<>(caso.getCidade().getNomeCidade(),caso.getQtdeCasos()));
				barChart.getData().add(series);
			}
		}

	}
	
	

	
}
	
