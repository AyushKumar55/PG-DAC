package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Map;

import core.Stock;

public interface IOUtils {
	public static void saveStock(Map<String,Stock> mapStock, String filename) throws FileNotFoundException, IOException{
		try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename))){
			out.writeObject(mapStock);
		}
	}
}
