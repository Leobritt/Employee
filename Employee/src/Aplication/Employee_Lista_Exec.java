package Aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Entite.Employee;

public class Employee_Lista_Exec {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		List<Employee> list = new ArrayList<>();

		System.out.println("How many employees will be registred ?");
		int n = input.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println();
			System.out.println("Employee #" + (i + 1) + ":");

			System.out.println("Id:");
			int id = input.nextInt();

			 while (hasId(list, id)) {
			System.out.print("Id already taken. Try again: ");
			id = input.nextInt();
			
			 }
			
			System.out.println("Name:");
			input.nextLine();

			String name = input.nextLine();
			
			
			System.out.println("Salary:");
			double salary = input.nextDouble();

			list.add(new Employee(id, name, salary));
			//criando um objeto na lista

		}
		System.out.println();
		System.out.println("Enter the employee id that will have salary increase:");
		int id = input.nextInt();

		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		// criando o obj de employee pegando a lista transformando em stream usando o
		// filter com predicado e o find firt vai encontrat o primiero q tiver se n
		// retorna nulo

		if (emp == null) {
			System.out.println("This id does not exist!");
		} else {
			System.out.println("Enter the percentage");
			double percentage;
			
			percentage = input.nextDouble();
			emp.IncreasySalary(percentage);
		}
		
		System.out.println();
		System.out.println("List Employee");
		
		for (Employee x : list) {
			System.out.println(x);
		}
		input.close();
			
	}
	public static boolean hasId(List<Employee> list,int id) {
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}
}
