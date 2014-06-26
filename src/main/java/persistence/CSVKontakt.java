package persistence;

import java.io.FileWriter;
import java.io.IOException;

import model.Kontakt;

public class CSVKontakt implements KontaktDAO {
	
	
	public void Save(Kontakt contact) throws Exception {
		try{
				FileWriter csvWriter = new FileWriter("kontakt.csv",true); 
				writeCSVItem(csvWriter, contact.getName());
				writeCSVItem(csvWriter, contact.getTelefonnummer());
				writeCSVItem(csvWriter, contact.getEmail());
				// Escaping "" For MultiLine Support in the CSV
				csvWriter.append("\""+contact.getNachrricht()+"\""); 
				csvWriter.append("\n");
				csvWriter.flush();
				csvWriter.close();
			
		} catch (Exception e) {
			throw e;
		}
	}
	
	private void writeCSVItem(FileWriter csvWriter, String item) throws IOException{
		csvWriter.append(item);
		csvWriter.append(';');
	}

}
