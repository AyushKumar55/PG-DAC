package IOUtils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

import core.Pen;

public interface IOUtils {
	public static void storeData(Map<Integer, Pen> penMap, String fileName) throws FileNotFoundException, IOException {
		try (PrintWriter pw = new PrintWriter(new FileWriter(fileName, true))) {
			pw.println("ALL RECORDS");
			penMap.forEach((k,v)-> pw.println(v));
			System.out.println("Data Stored Successfully");
		}
	}
	
	public static void readFromFile(String fileName) throws FileNotFoundException, IOException{
		try(BufferedReader br =  new BufferedReader(new FileReader(fileName))){
			while(br.ready()) {
				System.out.println(br.readLine());
			}
		}
	}
}
