package util;

import java.util.function.Consumer;

import entities.Product5;

public class PriceUpdate implements Consumer<Product5> {

	@Override
	public void accept(Product5 p) {
		p.setPrice(p.getPrice() * 1.1); // aumentar em 10%

	}

}
