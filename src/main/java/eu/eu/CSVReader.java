package eu.eu;



import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
 
public class CSVReader {
 
  public static void main(String[] args) throws FileNotFoundException, IOException{
	  String filePath = "src/test/resources/primenumbers.txt";
	CSVReader reader = new CSVReader();
	
	reader.read(filePath);
 
  }
 
  public String[] read(String path) throws FileNotFoundException, IOException {
 
	
	BufferedReader br = null;
	String line = "";
	String splitBy = ",";
	String[] items={} ;
	try {
 
		br = new BufferedReader(new FileReader(path));
	
		while ((line = br.readLine()) != null) {
 
		        // use comma as separator
			String[] itemsInLine = line.split(splitBy);
			items = EuUtils.concat(items,itemsInLine);
			
		//	System.out.println(array.toString());
 
		}
 
	} finally {
		if (br != null) {
				br.close();
		}
	}
  
	return items; 
  }
  }