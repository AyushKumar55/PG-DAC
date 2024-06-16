package utils;

import java.time.LocalDateTime;
import java.util.List;

import core.Grocery;
import custome_exception.MyException;

public class Validations {
	
	public static Grocery findByItemName(String name, List<Grocery> record) throws MyException{
		Grocery itemName = new Grocery(name);
		int index = record.indexOf(itemName);
		if(index == -1)
			throw new MyException("Item not found !!!");
		return record.get(index);
	}
	
	public static Grocery addNewItem(String name, int pr, int qty, List<Grocery> record) throws MyException {
		Grocery itemName = new Grocery(name);
		if(record.indexOf(itemName) == -1) {
			validatePrice(pr);
			validateQty(qty);
		}
		else
			throw new MyException("Item already exists");
			
		return new Grocery(name, pr, qty, LocalDateTime.now());
	}
	
	
	public static void validatePrice(int pr) throws MyException {
		if(pr<0)
			throw new MyException("Price cannot be less than Zero");
	}
	
	public static void validateQty(int qty) throws MyException {
		if(qty<0)
			throw new MyException("Price cannot be less than Zero");
	}
}
