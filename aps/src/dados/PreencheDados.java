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

public class PreencheDados {
	List<CasosApontados> casosApontados= new ArrayList<CasosApontados>();
	public PreencheDados() throws IOException {
		PegaDadosExcel();
	}
	public void PegaDadosExcel() throws IOException {
			
		try{
			File file = new File("C:\\Users\\Matheus\\git\\APS-2021\\aps\\src\\dados\\DadosDengue.xlsx");
			FileInputStream fImputStream = new FileInputStream(file);
			try (XSSFWorkbook workBook = new XSSFWorkbook(fImputStream)) {
				XSSFSheet xssfSheet = workBook.getSheetAt(0);
				
				Iterator<Row> rowIterator = xssfSheet.iterator();

				while(rowIterator.hasNext()) {
					Row row = rowIterator.next();
					Iterator<Cell> cellIterator = row.iterator();
					
					Cidade cidade = new Cidade();
					CasosApontados casos = new CasosApontados();

					while(cellIterator.hasNext()) {
						
						Cell cell = cellIterator.next();
						
						switch (cell.getCellType()) {
						case STRING:
							cidade.setNomeCidade(cell.getStringCellValue());

							break;
						case NUMERIC:
							casos.setQtdeCasos((int) cell.getNumericCellValue());
							break;
						default:
							break;
						}						
					}
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
	public List<CasosApontados> getCasosApontados(){
		return casosApontados;
	}
}
