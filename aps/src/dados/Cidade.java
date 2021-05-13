package dados;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Cidade {
	private StringProperty nomeCidade;
	private StringProperty uF;
	
	
	public Cidade(String nomeCidade) {
		this.nomeCidade = new SimpleStringProperty(nomeCidade);
	}
	public Cidade() {

	}
	
	public String getNomeCidade() {
		return nomeCidade.get();
	}
	public void setNomeCidade(String nomeCidade) {
		String teste;
		teste = nomeCidade;
		if(teste == null) {
			this.nomeCidade.set("Mano ferrou");
			
		}
		this.nomeCidade.set(nomeCidade);
	}
	
	public StringProperty nomeCidadeProperty() {
		return nomeCidade;
	}
	
	public String getuF() {
		return uF.get();
	}
	public void setuF(String uF) {
		this.uF.set(uF);
	}
	
	public StringProperty uFProperty() {
		return uF;
	}
	
	
	
}
