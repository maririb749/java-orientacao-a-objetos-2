package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;

import entities.Product5;
import util.PriceUpdate;

public class Program18 {

	public static void main(String[] args) {

		/*
		 * Fazer um programa que, a partir de uma lista de produtos, aumente o preço dos
		 * produtos em 10%.
		 */
		Locale.setDefault(Locale.US);
		List<Product5> list = new ArrayList<>();

		list.add(new Product5("TV", 900.00));
		list.add(new Product5("Mouse", 50.00));
		list.add(new Product5("Tablet", 350.50));
		list.add(new Product5("HD Case", 80.00));

		list.forEach(Product5 :: nonstaticPriceUpdate);

		list.forEach(System.out::println);

	}

}
