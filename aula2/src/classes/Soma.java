package classes;

import java.util.Scanner;

public class Soma {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int a, b, c;
		System.out.println("Informe o primeiro numero: ");
		a = s.nextInt();
		System.out.println("Informe o segundo numero: ");
		b = s.nextInt();
		c = a + b;
		System.out.println("Soma: " + c);
		
	}
}
