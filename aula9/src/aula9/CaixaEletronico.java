package aula9;

public class CaixaEletronico {

	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.titular = "Jo�o Silva";
		conta.numero = 1234;
		
		conta.depositar(500);
		
		System.out.print(conta.sacar(200));
		
		System.out.print(conta.exibirSaldo());		
		
	}
}
