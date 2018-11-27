package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Funcionario;

public class ProgramFuncionario {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Funcionario funcionario = new Funcionario();
		System.out.println("Name: ");
		funcionario.name = sc.nextLine();
		
		System.out.println("Gross salary: ");
		funcionario.grossSalary = sc.nextDouble();
		
		System.out.println("Tax: ");
		funcionario.tax = sc.nextDouble();
		
		System.out.println(funcionario);
		System.out.println("Which percentage to increase salary? ");
		double pc = sc.nextDouble();
		
		double soma =  ((funcionario.grossSalary) - (funcionario.grossSalary * (pc / 100)));
		System.out.println("Updated data: "+ funcionario.name +", $"+ soma);
		

		sc.close();
	}

}
