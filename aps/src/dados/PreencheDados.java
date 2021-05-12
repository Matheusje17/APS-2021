package dados;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class PreencheDados {
	private ObservableList<CasosApontados> casosApontados = FXCollections.observableArrayList();

	public PreencheDados() {
		PegaDadosExcel();
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
	
	
	public void PegaDadosExcel() {
		
//		try {
//			File file = new File("C:\\Users\\Matheus\\git\\APS-2021\\bin\\dados\\DadosDengue.xlsx");
//			FileInputStream fImputStream = new FileInputStream(file);
//			try (XSSFWorkbook workBook = new XSSFWorkbook(fImputStream)) {
//				XSSFSheet xssfSheet = workBook.getSheetAt(0);
//				
//				Iterator<Row> rowIterator = xssfSheet.iterator();
//				
//				while(rowIterator.hasNext()) {
//					Row row = rowIterator.next();
//					Iterator<Cell> cellIterator = row.iterator();
//					
//					while(cellIterator.hasNext()) {
//						
//						Cell cell = cellIterator.next();
//						//casosApontados.add(new CasosApontados(new Cidade(cell.getStringCellValue()),(int)cell.getNumericCellValue()));
//						System.out.println(cell.getNumericCellValue());
//						System.out.println(cell.getStringCellValue());
//						
//					}
//					
//				}
//			}
//			
//			
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}
	
	
	
	
	
	
	public ObservableList<CasosApontados> getCasosApontados(){
		
		return casosApontados;
	}

	

}
