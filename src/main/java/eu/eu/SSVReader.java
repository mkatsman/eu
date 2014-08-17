package eu.eu;



import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
 
public class SSVReader {
 
  public static void main(String[] args) {
	  String filePath = "src/test/resources/primenumbers.txt";
	SSVReader reader = new SSVReader();
	reader.read(filePath);
 
  }
 
  public void read(String path) {
 
	
	BufferedReader br = null;
	String line = "";
	String splitBy = " ";
 
	try {
 
		br = new BufferedReader(new FileReader(path));
		String[] items;
		while ((line = br.readLine()) != null) {
 
		        // use comma as separator
			String[] itemsInLine = line.split(splitBy);
 
			System.out.println(array.toString());
 
		}
 
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	} finally {
		if (br != null) {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
 
	System.out.println("Done");
  }
 
}