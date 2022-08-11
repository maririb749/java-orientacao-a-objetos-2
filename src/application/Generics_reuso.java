package application;

import java.util.Scanner;

import services.PrintService;

public class Generics_reuso {

	/*
	 * Deseja-se fazer um programa que leia uma quantidade N, e depois N números
	 * inteiros. Ao final, imprima esses números de forma organizada conforme
	 * exemplo. Em seguida, informar quel foi o primeiro valor informado.
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		PrintService<String> ps = new PrintService<>();

		System.out.print("How many values? ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			String value = sc.next();
			ps.addValue(value);

		}

		ps.print();
		String x = ps.frist();
		System.out.println("Frist: " + x);

		sc.close();

	}

}
