package design;

import dados.CasosApontados;
import dados.Cidade;
import dados.PreencheDados;
import javafx.beans.binding.StringBinding;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class Aps2021Controller {
	
	@FXML
	private TableView<CasosApontados> dadosTable;
	
	@FXML
	private TableColumn<CasosApontados, Cidade> nomeCidadeColumn;
	
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
	


	
	
	@SuppressWarnings("unused")
	private PreencheDados mainTela;
	
	public Aps2021Controller() {
		
	}
	
	@FXML
	private void initialize() {
		nomeCidadeColumn.setCellValueFactory(cellData-> cellData.getValue().cidadeProperty());
		qtdCasosColumn.setCellValueFactory(cellData -> cellData.getValue().qtdCasosProperty().asObject());
		
	}
	
	public void setPreencheDados(PreencheDados preencheDados) {
		this.mainTela = preencheDados;
		dadosTable.setItems(preencheDados.getCasosApontados());
		
	}
}
	
