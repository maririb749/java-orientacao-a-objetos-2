package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

import entities.Product5;

public class Program18 {

	public static void main(String[] args) {

		/*
		 * Fazer um programa que, a partir de uma lista de produtos, gere uma nova lista
		 * contendo os nomes dos produtos em caixa alta.
		 */
		Locale.setDefault(Locale.US);
		List<Product5> list = new ArrayList<>();

		list.add(new Product5("TV", 900.00));
		list.add(new Product5("Mouse", 50.00));
		list.add(new Product5("Tablet", 350.50));
		list.add(new Product5("HD Case", 80.00));

		List<String> name = list.stream().map(Product5::staticUpperCaseName).collect(Collectors.toList());
		
		name.forEach(System.out::println);

	}

}
