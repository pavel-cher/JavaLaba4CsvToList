package CsvToList.Ctl;

import com.opencsv.CSVReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.*;


/**
 * This class transfers the contents of a .csv file to a list
 * @author Pavel Chernykhovskij
 *
 */
public class Ctl { 
	
	 public static  void main(String[] args) throws IOException {
	        FileReader fileReader = new FileReader("C:\\Users\\Public\\Documents\\foreign_names.csv");
	        CSVReader reader = new CSVReader(fileReader, ';');
	        String[] nextLine;
	        List<Person> list = new ArrayList<>();
	        while ((nextLine = reader.readNext()) != null) {
	            Random rd = new Random();
	            int iddiv = rd.nextInt(25000);
	            list.add(new Person(nextLine[0], nextLine[1], nextLine[2], nextLine[3], nextLine[4], iddiv, nextLine[5]));

	        }
	        
	        for (int i=1; i< list.size(); i++)
	        {
	            System.out.print(list.get(i).getId()+"; ");
	            System.out.print(list.get(i).getName()+"; ");
	            System.out.print(list.get(i).getGender()+"; ");
	            System.out.print(list.get(i).getBirthDate()+"; ");
	            System.out.print(list.get(i).getSubdTitle()+"; ");
	            System.out.print(list.get(i).getSubdId()+"; ");
	            System.out.print(list.get(i).getSalary()+"; ");
	            System.out.println();
	        }

	    }
}
