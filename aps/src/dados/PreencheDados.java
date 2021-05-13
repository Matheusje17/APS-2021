package dados;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.collections4.IteratorUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class PreencheDados {
	private ObservableList<CasosApontados> casosApontados = FXCollections.observableArrayList();

	public PreencheDados() throws IOException {
		PegaDadosExcel();
//		casosApontados.add(new CasosApontados(new Cidade("Guarujá"),158));
//		casosApontados.add(new CasosApontados(new Cidade("Cubatão"),143));
//		casosApontados.add(new CasosApontados(new Cidade("São Vicente"),66));
//		casosApontados.add(new CasosApontados(new Cidade("Praia Grande"),38));
//		casosApontados.add(new CasosApontados(new Cidade("Peruíbe"),24));
//		casosApontados.add(new CasosApontados(new Cidade("Bertioga"),15));
//		casosApontados.add(new CasosApontados(new Cidade("Santos"),11));
//		casosApontados.add(new CasosApontados(new Cidade("Mongaguá"),8));
//		casosApontados.add(new CasosApontados(new Cidade("Itanhaém"),5));

		

	}
	
	
	public void PegaDadosExcel() throws IOException {
		
		
		try{
			File file = new File("C:\\NewJavaWS\\Testes\\src\\testes\\DadosDengue.xlsx");
			FileInputStream fImputStream = new FileInputStream(file);
			try (XSSFWorkbook workBook = new XSSFWorkbook(fImputStream)) {
				XSSFSheet xssfSheet = workBook.getSheetAt(0);
				
				Iterator<Row> rowIterator = xssfSheet.iterator();

				while(rowIterator.hasNext()) {
					Row row = rowIterator.next();
					Iterator<Cell> cellIterator = row.iterator();
					
					Cidade cidade = new Cidade();
					CasosApontados casos = new CasosApontados();

					int i = 0;
					while(cellIterator.hasNext()) {
						
						
						
						Cell cell = cellIterator.next();

						switch (cell.getCellType()) {
						case STRING:
							

							break;
						case NUMERIC:
							casos.setQtdeCasos((int) cell.getNumericCellValue());
							break;
						default:
							break;
						}
						//cidade.setNomeCidade(nomeCidade);

					}
					

					//casos.setCidade(new Cidade("Tesest"));
					casos.setCidade(cidade);
					casosApontados.add(casos);
				}
			}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
	
	
	
	
	@SuppressWarnings("unused")
	private List<?> toList(Iterator<?> iterator) {
		
		return IteratorUtils.toList(iterator);
	}


	public ObservableList<CasosApontados> getCasosApontados(){
		
		return casosApontados;
	}

	

}
