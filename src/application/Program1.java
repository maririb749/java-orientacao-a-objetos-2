package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class Program1 {

	/*
	 * Fazer um programa para ler os dados de N contribuintes (N fornecido pelo
	 * usu�rio), os quais podem ser pessoa f�sica ou pessoa jur�dica, e depois
	 * mostrar o valor do imposto pago por cada um, bem como o total de imposto
	 * arrecadado. Os dados de pessoa f�sica s�o: nome, renda anual e gastos com
	 * sa�de. Os dados de pessoa jur�dica s�o nome, renda anual e n�mero de
	 * funcion�rios. As regras para c�lculo de imposto s�o as seguintes: Pessoa
	 * f�sica: pessoas cuja renda foi abaixo de 20000.00 pagam 15% de imposto.
	 * Pessoas com renda de 20000.00 em diante pagam 25% de imposto. Se a pessoa
	 * teve gastos com sa�de, 50% destes gastos s�o abatidos no imposto. Exemplo:
	 * uma pessoa cuja renda foi 50000.00 e teve 2000.00 em gastos com sa�de, o
	 * imposto fica: (50000 * 25%) - (2000 * 50%) = 11500.00 Pessoa jur�dica:
	 * pessoas jur�dicas pagam 16% de imposto. Por�m, se a empresa possuir mais de
	 * 10 funcion�rios, ela paga 14% de imposto. Exemplo: uma empresa cuja renda foi
	 * 400000.00 e possui 25 funcion�rios, o imposto fica: 400000 * 14% = 56000.00
	 */

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<TaxPayer> list = new ArrayList<TaxPayer>();

		System.out.print("Enter the number of taxpayers:");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Taxpayer # " + i + " data: ");
			System.out.print("Individual or Company (i/c)?");
			char type = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Anual income:");
			Double anualIncome = sc.nextDouble();
			if (type == 'i') {
				System.out.print("Health expenditures:");
				Double healthExpenditures = sc.nextDouble();
				list.add(new Individual(name, anualIncome, healthExpenditures));
			} else {
				System.out.print("Number of employees:");
				Integer numberOfEmployees = sc.nextInt();
				list.add(new Company(name, anualIncome, numberOfEmployees));

			}

		}

		double sum = 0.0;
		System.out.println();
		System.out.println("TAXES PAID:");
		for (TaxPayer tp : list) {
			double tax = tp.tax();
			System.out.println(tp.getName() + " :  $ " + String.format("%.2f", tax));
			sum += tax;
		}

		System.out.println();
		System.out.println("TOTAL TAXES: $ " + String.format("%.2f", sum));

		sc.close();

	}

}
