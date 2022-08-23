package aula;

import java.util.Scanner;

public class Questao5 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		double imc, peso, altura;
		
		System.out.println("Informe o peso");
		peso = s.nextDouble();
		
		System.out.println("Informe a altura");
		altura = s.nextDouble();
		
		imc = peso / (altura * altura);
		System.out.println("IMC: " + imc);
		
		if(imc < 18.5) {
			System.out.println("Abaixo do peso");
		} else if(imc < 25) {
			System.out.println("Peso normal");
		} else {
			System.out.println("Acima do peso");
		}
	
	}
}
