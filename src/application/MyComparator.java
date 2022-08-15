package application;

import java.util.Comparator;

import entities.Product4;

public class MyComparator implements Comparator<Product4>{

	@Override
	public int compare(Product4 p1, Product4 p2) {
		return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
		
	 
	}

}
