package util;

import java.util.function.Function;

import entities.Product5;

public class UpperCaseName implements Function<Product5, String> {

	@Override
	public String apply(Product5 p) {
		return p.getName().toUpperCase();
	}

}
