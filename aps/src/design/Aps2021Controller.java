package design;

import java.util.Arrays;

import calculos.DesvioPadrao;
import calculos.Media;
import calculos.Mediana;
import calculos.Moda;
import calculos.Variancia;
import dados.CasosApontados;
import dados.PreencheDados;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
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
	private ObservableList<String> cidade = FXCollections.observableArrayList();
	
	@FXML
	private ObservableList<Integer> qtdCasos = FXCollections.observableArrayList();

	Media calcMedia = new Media();
	Mediana calcMediana = new Mediana();
	Moda calcModa = new Moda();
	DesvioPadrao calcDesvio = new DesvioPadrao();
	Variancia calcVariancia = new Variancia();
	
	@SuppressWarnings("unused")
	private PreencheDados mainTela;
	//private Cidade nomeCidade;
	//private CasosApontados grafico;
	

	public Aps2021Controller() {
		
	}
	
	
	public void mostraCalculo() {
		media.setText(Double.toString(calcMedia.getMedia()));
		mediana.setText(Double.toString(calcMediana.getResultado()));
		//moda.setText(Float.toString(calcModa.getModa()));
		desvioPadrao.setText(calcDesvio.getDesvio());
		variancia.setText(calcVariancia.getVarianca());
	}
	
	
	@FXML
	private void initialize() {
		nomeCidadeColumn.setCellValueFactory(cellData-> cellData.getValue().cidadeProperty().get().nomeCidadeProperty());
		qtdCasosColumn.setCellValueFactory(cellData -> cellData.getValue().qtdCasosProperty().asObject());
		
		
		String[] arrayCidades = {"Guarujá","Cubatão","S.Vicente","P.Grande","Peruíbe","Bertioga","Santos","Mongaguá","Itanhém"};
		cidade.addAll(Arrays.asList(arrayCidades));
		eixoX.setCategories(cidade);
		
		Integer[] arrayCasos = {158,143,66,38,24,15,11,8,5};
		qtdCasos.addAll(Arrays.asList(arrayCasos));		
	}
	
	public void setPreencheDados(PreencheDados preencheDados) {
		this.mainTela = preencheDados;
		dadosTable.setItems(preencheDados.getCasosApontados());
		
	}
	
	public void setBarra(CasosApontados casos) {
		//this.grafico = casos;
		
		for(int i = 0; i < 9;i++) {
			XYChart.Series<String, Integer> series = new XYChart.Series<>();
			series.getData().add(new XYChart.Data<>(cidade.get(i),qtdCasos.get(i)));
			barChart.getData().add(series);
			
		}

	}
	
}
	
