package dados;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class PreencheDados {
	private ObservableList<CasosApontados> casosApontados = FXCollections.observableArrayList();

	public PreencheDados() {
		
		casosApontados.add(new CasosApontados(new Cidade("Guaruj�"),158));
		casosApontados.add(new CasosApontados(new Cidade("Cubat�o"),143));
		casosApontados.add(new CasosApontados(new Cidade("S�o Vicente"),66));
		casosApontados.add(new CasosApontados(new Cidade("Praia Grande"),38));
		casosApontados.add(new CasosApontados(new Cidade("Peru�be"),24));
		casosApontados.add(new CasosApontados(new Cidade("Bertioga"),15));
		casosApontados.add(new CasosApontados(new Cidade("Santos"),11));
		casosApontados.add(new CasosApontados(new Cidade("Mongagu�"),8));
		casosApontados.add(new CasosApontados(new Cidade("Itanha�m"),5));

		

	}
	
	public ObservableList<CasosApontados> getcasosApontados(){
		return casosApontados;
	}
	
	

}
