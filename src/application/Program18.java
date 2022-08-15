package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Product5;

public class Program18 {

	public static void main(String[] args) {

		/*
		 * Fazer um programa que, a partir de uma lista de produtos, remova da lista
		 * somente aqueles cujo preço mínimo seja 100.
		 * 
		 */
            Locale.setDefault(Locale.US);
	        List<Product5> list = new ArrayList<>();
	        
	        list.add(new Product5("TV", 900.00));
	        list.add(new Product5("Mouse", 50.00));
	        list.add(new Product5("Tablet", 350.50));
	        list.add(new Product5("HD Case", 80.00));
	        
	        list.removeIf(Product5 :: nonstaticProductPredicate);
	        
	        for (Product5 p : list) {
	        	System.out.println(p);
	        }
	        
	
	}

}
