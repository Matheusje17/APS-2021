package design;

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
	
	Media calcMedia = new Media();
	Mediana calcMediana = new Mediana();
	Moda calcModa = new Moda();
	DesvioPadrao calcDesvio = new DesvioPadrao();
	Variancia calcVariancia = new Variancia();
	
	@SuppressWarnings("unused")
	private PreencheDados mainTela;
	
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
		
	}
	
	public void setPreencheDados(PreencheDados preencheDados) {
		this.mainTela = preencheDados;
		dadosTable.setItems(preencheDados.getCasosApontados());
		
	}
}
	
