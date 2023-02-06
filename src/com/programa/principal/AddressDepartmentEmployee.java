package com.programa.principal;

import java.util.Locale;
import java.util.Scanner;

import com.entities.Address;
import com.entities.Department;
import com.entities.Employee;

public class AddressDepartmentEmployee {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Nome do departamento: ");
		String name = sc.nextLine();
		
		System.out.print("Dia do Pagamento: ");
		int payment = sc.nextInt();
		
		System.out.print("Email: ");
		sc.nextLine();
		String email = sc.nextLine();
		
		
		System.out.print("Telefone: ");
		
		String phone = sc.nextLine();
		
		Department department = new Department(name, payment, new Address(email, phone));	
		
		System.out.print("Quantos fucionário tem o departamento: ");
		int qtd = sc.nextInt();
		for(int i = 0; i < qtd; i++) {
			
			System.out.println("Dados do Fucionário " + (i+1));
			System.out.print("Nome: ");
			sc.nextLine();
			String nameEmployer = sc.nextLine();
			System.out.print("Salário: ");
			double salary = sc.nextDouble();
			
			Employee employee = new Employee(nameEmployer, salary);	
			department.addEmployee(employee);

			
		}
		
		System.out.println(" ");
		System.out.println("FOLHA DE PAGAMENTO: ");
		System.out.printf("Departamento de Vendas = R$ %.2f\n", department.payRoll());
		System.out.println("Pagamento realizado no dia: " + department.getPayDay());
		System.out.println("Fucionários: ");
		
		for(int i = 0; i < qtd; i++) {
			
			System.out.println(department.getEmployee().get(i).getName());
			
		}
		System.out.println("Para dúvidas favor entrar em encontato: " + department.getAddress().getEmail());
		
		sc.close();
	}

}
