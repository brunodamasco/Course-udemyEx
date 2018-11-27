package aula_62_array;

import java.util.Locale;
import java.util.Scanner;

public class MediaNota {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" <>  ESCOLA ZUEIRA NEVER END  <>");
		System.out.print("Nome do aluno: ");
		String n1 = sc.nextLine();
		
		System.out.print("Número de provas: ");
		int n = sc.nextInt();
		
		double[] vect = new double[n];
		
		for(int i = 0; i < n; i++) {
			System.out.print("Nota "+(i + 1)+": ");
			vect[i] = sc.nextDouble();
		}
		
		double sum = 0.0;
		
		for(int i = 0; i < n; i++) {
			sum += vect[i];
		}
		
		double avg = sum / n;
		System.out.printf("A média do aluno "+n1+" é: %.2f%n", avg);
		
		
		sc.close();
	}

}
