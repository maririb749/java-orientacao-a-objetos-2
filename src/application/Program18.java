package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;

import entities.Product5;

public class Program18 {

	public static void main(String[] args) {

		/*
		 * Fazer um programa que, a partir de uma lista de produtos, remova da lista
		 * somente aqueles cujo pre�o m�nimo seja 100.
		 * 
		 */
		Locale.setDefault(Locale.US);
		List<Product5> list = new ArrayList<>();

		list.add(new Product5("TV", 900.00));
		list.add(new Product5("Mouse", 50.00));
		list.add(new Product5("Tablet", 350.50));
		list.add(new Product5("HD Case", 80.00));

		double min = 100.0;

		list.removeIf(p -> p.getPrice() >= min);

		for (Product5 p : list) {
			System.out.println(p);
		}

	}

}