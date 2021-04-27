package dados;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;

public class CasosApontados {
	
	private final ObjectProperty<Cidade> cidade;
	private final IntegerProperty qtdeCasos;
	
	public CasosApontados() {
		this(null, 0);
	}
	
	public CasosApontados(Cidade cidade, int qtdeCasos) {
		this.cidade = new SimpleObjectProperty<Cidade>(cidade);
		this.qtdeCasos = new SimpleIntegerProperty(qtdeCasos);
	}
	
	public Cidade getCidade() {
		return cidade.get();
	}
	public void setCidade(Cidade cidade) {
		this.cidade.set(cidade);
	}
	
	public ObjectProperty<Cidade> cidadeProperty() {
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
