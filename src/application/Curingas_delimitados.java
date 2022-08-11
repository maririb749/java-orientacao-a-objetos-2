package application;

import java.util.ArrayList;
import java.util.List;

import entities.Circle1;
import entities.Rectangle1;
import entities.Shape;

public class Curingas_delimitados {

	public static void main(String[] args) {

		List<Shape> myShapes = new ArrayList<>();
		myShapes.add(new Rectangle1(3.0, 2.0));
		myShapes.add(new Circle1(2.0));

		List<Circle1> myCircle = new ArrayList<>();
		myCircle.add(new Circle1(2.0));
		myCircle.add(new Circle1(3.0));

		System.out.println("Total area: " + totalArea(myCircle));

	}

	public static double totalArea(List<? extends Shape> list) {
		double sum = 0.0;
		for (Shape s : list) {
			sum += s.area();
		}
		return sum;

	}

}
