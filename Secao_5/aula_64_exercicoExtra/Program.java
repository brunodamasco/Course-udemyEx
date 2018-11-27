package aula_64_exercicoExtra;

import java.util.Locale;
import java.util.Scanner;


public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rent[] vect = new Rent[10];
		
		System.out.println(" |+| REPÚBLICA DONA BILICA |+|");
		System.out.println("How many rooms will be rented? ");
		int n = sc.nextInt();
		
		
		for(int i=0; i < n; i++) {
			System.out.println();
			System.out.println("Rent #"+i+ ":"); 
			System.out.println("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Email: ");
			String email = sc.nextLine();
			System.out.println("Room: ");
			int room = sc.nextInt();
			vect[room] = new Rent(name, email);
		}
		System.out.println();
		System.out.println("Busy rooms: ");
		for(int i=0; i < n; i++) {
			if(vect[i] != null) {
				System.out.println(i + ": "+ vect[i]);
			}
		}
		
		
		sc.close();
	}

}
