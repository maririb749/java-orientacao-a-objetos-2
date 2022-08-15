package util;

import java.util.function.Predicate;

import entities.Product5;

public class ProductPredicate implements Predicate<Product5> {

	@Override
	public boolean test(Product5 p) {
		return p.getPrice() >= 100.0;
	}

}
