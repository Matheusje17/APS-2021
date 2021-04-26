package dados;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class PreencheDados {
	private ObservableList<Cidade> cidadeData = FXCollections.observableArrayList();

	public PreencheDados() {
		
		cidadeData.add(new Cidade("Guaruj�",158));
		cidadeData.add(new Cidade("Cubat�o",143));
		cidadeData.add(new Cidade("S�o Vicente",66));
		cidadeData.add(new Cidade("Praia Grande",38));
		cidadeData.add(new Cidade("Peru�be",24));
		cidadeData.add(new Cidade("Bertioga",15));
		cidadeData.add(new Cidade("Santos",11));
		cidadeData.add(new Cidade("Mongagu�",8));
		cidadeData.add(new Cidade("Itanha�m",5));
		

	}
	
	public ObservableList<Cidade> getCidadeData(){
		return cidadeData;
	}
	
	

}
