package dados;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class PreencheDados {
	private ObservableList<CasosApontados> casosApontados = FXCollections.observableArrayList();

	public PreencheDados() {
		
		casosApontados.add(new CasosApontados(new Cidade("Guarujá"),158));
		casosApontados.add(new CasosApontados(new Cidade("Cubatão"),143));
		casosApontados.add(new CasosApontados(new Cidade("São Vicente"),66));
		casosApontados.add(new CasosApontados(new Cidade("Praia Grande"),38));
		casosApontados.add(new CasosApontados(new Cidade("Peruíbe"),24));
		casosApontados.add(new CasosApontados(new Cidade("Bertioga"),15));
		casosApontados.add(new CasosApontados(new Cidade("Santos"),11));
		casosApontados.add(new CasosApontados(new Cidade("Mongaguá"),8));
		casosApontados.add(new CasosApontados(new Cidade("Itanhaém"),5));

		

	}
	
	public ObservableList<CasosApontados> getcasosApontados(){
		return casosApontados;
	}
	
	

}
