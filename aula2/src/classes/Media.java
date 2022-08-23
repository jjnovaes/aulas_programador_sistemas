package classes;

import java.util.Scanner;

public class Media {
	public static void main (String args[]) {
		Scanner s = new Scanner(System.in);
		double n1, n2, media;
		
		System.out.println("Informe a nota 1");
		n1 = s.nextDouble();
		System.out.println("Informe a nota 2");
		n2 = s.nextDouble();
		
		media = (n1 + n2) / 2;
		
		System.out.println("Média: " + media);
	}
}
