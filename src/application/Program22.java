package application;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Employee;

public class Program22 {

	/*
	 * Fazer um programa para ler os dados (nome, email e sal�rio) de funcion�rios a
	 * partir de um arquivo em formato .csv. Em seguida mostrar, em ordem
	 * alfab�tica, o email dos funcion�rios cujo sal�rio seja superior a um dado
	 * valor fornecido pelo usu�rio. Mostrar tamb�m a soma dos sal�rios dos
	 * funcion�rios cujo nome come�a com a letra 'M'.
	 */

	public static void main(String[] args) throws FileNotFoundException, IOException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter full fille path: ");
		String path = sc.nextLine();
		

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			List<Employee> list = new ArrayList<>();
			
			String line = br.readLine();
			while(line != null) {
				String[] fields = line.split(",");
				list.add(new Employee(fields[0], fields[1],Double.parseDouble(fields[2])));
				line = br.readLine();
			}
			System.out.print("Enter Salary: ");
			double salary = sc.nextDouble();
			
			 List<String> emails = list.stream()
					 .filter(x -> x.getSalary() > salary)
					 .map(x -> x.getEmail())
					 .sorted()
					 .collect(Collectors.toList());
			 System.out.println("Email of people whose salary is more than" + String.format("%.2f", salary)+ ":");
			 emails.forEach(System.out::println);
			 
			 
			double sum = list.stream()
							.filter(x -> x.getName().charAt(0) == 'M')
							.map(x -> x.getSalary())
							.reduce(0.0, (x, y) -> x + y);
														
			             
			             System.out.println("Sum of salary of people whose name starts with 'M': " + String.format("%.2f" , sum));
			

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());

		}

		sc.close();

	}

}
