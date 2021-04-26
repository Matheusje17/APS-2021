package dados;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Cidade {
	
	private final StringProperty cidade;
	private final IntegerProperty qtdeCasos;
	
	public Cidade() {
		this(null, 0);
	}
	
	public Cidade(String cidade, int qtdeCasos) {
		this.cidade = new SimpleStringProperty(cidade);
		this.qtdeCasos = new SimpleIntegerProperty(qtdeCasos);
	}
	
	public String getCidade() {
		return cidade.get();
	}
	public void setCidade(String cidade) {
		this.cidade.set(cidade);
	}
	
	public StringProperty cidadeProperty() {
		return cidade;
	}
	
	public int getQtdeCasos() {
		return qtdeCasos.get();
	}
	
	public void setQtdeCasos(int qtdeCasos) {
		this.qtdeCasos.set(qtdeCasos);
	}
	public IntegerProperty qtdeCasosPorperty(){
		return qtdeCasos;
	}
	
	
}
