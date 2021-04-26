package dados;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class PreencheDados {
	private ObservableList<Cidade> cidadeData = FXCollections.observableArrayList();

	public PreencheDados() {
		
		cidadeData.add(new Cidade("Guarujá",158));
		cidadeData.add(new Cidade("Cubatão",143));
		cidadeData.add(new Cidade("São Vicente",66));
		cidadeData.add(new Cidade("Praia Grande",38));
		cidadeData.add(new Cidade("Peruíbe",24));
		cidadeData.add(new Cidade("Bertioga",15));
		cidadeData.add(new Cidade("Santos",11));
		cidadeData.add(new Cidade("Mongaguá",8));
		cidadeData.add(new Cidade("Itanhaém",5));
		

	}
	
	public ObservableList<Cidade> getCidadeData(){
		return cidadeData;
	}
	
	

}
