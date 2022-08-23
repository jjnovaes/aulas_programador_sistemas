package aula7;

import java.util.Arrays;
import java.util.Scanner;

public class Questao3 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int vt[] = new int[3];
		// leitua
		for (int i = 0; i < 3; i++) {
			System.out.println("Informe um numero: ");
			vt[i] = s.nextInt();
		}
		// ordenação
		for (int i = 1; i < 3; i++) {
			for (int j = 0; j < i; j++) {
				if (vt[i] < vt[j]) {
					int temp = vt[i];
					vt[i] = vt[j];
					vt[j] = temp;
				}
			}
		}
		//Arrays.sort(vt); // faz o que foi feito anteriormente
		//exibição
		for (int i = 0; i < 3; i++) {
			System.out.println(vt[i]);
		}
	}
}
