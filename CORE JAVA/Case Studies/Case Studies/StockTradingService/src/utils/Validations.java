package utils;

import java.time.LocalDate;
import java.util.Map;

import core.Stock;
import custom_exception.MyException;

public class Validations {
	
	public static void validateStockId(Map<String,Stock> mapStock,String id) throws MyException{
		if(!(mapStock.containsKey(id))) {
			throw new MyException("Stock Id Does Not Exist");
		}
	}
	public static void checkDupId(Map<String,Stock> mapStock,String id) throws MyException{
		for(Stock c : mapStock.values()) {
			if(c.getStock_id().equals(id))
				throw new MyException("Entered Stock Id Already Exists");
		}
	}
	
	public static void validateClosingDate(LocalDate closingDate) throws MyException {
		if((closingDate.isBefore(LocalDate.now())) || (closingDate.isEqual(LocalDate.now()))) {
			throw new MyException("Closing Date Must be a Future Date");
		}		
	}
	
	public static void validateCompany(Map<String,Stock> mapStock, String name) throws MyException{
		int count = 0;
		for(Stock s : mapStock.values()) {
			if((s.getCompany_name().equals(name))) {
				++count;
			}
		}
		if(count==0)
			throw new MyException("Company Name not Found");
	}
	
	public static void validateQty(Map<String,Stock> mapStock, int qty) throws MyException{
		if(qty<=0)
			throw new MyException("Qty cannot be less than OR equal to Zero");
	}
	
	public static void validateQty(Map<String,Stock> mapStock, String id, int qty) throws MyException{
		if(qty<=0)
			throw new MyException("Qty cannot be less than OR equal to Zero");
		
		Stock s = mapStock.get(id);
		if(s.getQty()<qty)
			throw new MyException("Insufficient Stocks");
	}
}
