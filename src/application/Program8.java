package application;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import entities.Employees;

public class Program8 {

	/*
	 * Faça um programa para ler um arquivo contendo funcionários( nomee salário),no
	 * formato .csv,armazenando-os em uma lista. Depois, ordenar a lita por nome e
	 * mostrar o resultado na tela. Nota: o caminho do arquivo pode ser informado
	 * "hardcode".
	 */

	public static void main(String[] args) throws FileNotFoundException, IOException {

		List<Employees> list = new ArrayList();
		String path = "C:\\temp\\in.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String employeesCsv = br.readLine();
			while (employeesCsv != null) {
				String[]fields = employeesCsv.split(",");
				list.add(new Employees(fields[0], Double.parseDouble(fields[1])));
				employeesCsv = br.readLine();
			}
			Collections.sort(list);
			for (Employees emp : list) {
				System.out.println(emp.getName()+ " , " + emp.getSalary());
			}
			
		} catch (IOException e) {
			System.out.println("Error:" + e.getMessage());
		}

	}
}
