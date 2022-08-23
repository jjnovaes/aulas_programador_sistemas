package aula9;

//simular a classe que representa uma conta corrente
public class Conta {
	String titular;
	int numero;
	double saldo;
	
	public void depositar(double deposito) {
		saldo = saldo + deposito;
	}
	
	public String sacar(double saque) {
		if(saque <= saldo) {
			saldo = saldo - saque;
			return "Saque realizado\n Valor: "+saque;
		} else {
			return "Saque NÃO realizado";
		}
	}
	
	public String exibirSaldo() {
		return "...Banco Senac..."+
	           "\nTitular: " + titular +
	           "\nConta: " + numero +
	           "\nSaldo: "+ saldo;
	}
}
