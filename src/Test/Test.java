package Test;

import Banco.Banco;
import model.Cliente;
import model.Conta;
import model.ContaCorrente;
import model.ContaPoupanca;

public class Test {
	public static void main(String[] args) {
		Conta conta = new ContaPoupanca(new Cliente("Mario"), 1234 , 4321);
		Conta conta2 = new ContaCorrente(new Cliente("Noenia"), 4567, 9875);
		
		conta.depositar(500);
		conta.sacar(200);
		conta.tranferir(conta, conta2, 300);
		conta.getCliente().setDataDeNascimento("05/03/1999");
		int idade = conta.getCliente().getIdade(conta.getCliente().getDataDeNascimento());
		System.out.println(idade);
		
		System.out.println(conta);
		System.out.println(conta2);
		
		Banco banco = new Banco();
		banco.adicionarContasDoBanco(conta);
		banco.adicionarContasDoBanco(conta2);
		banco.listaDeContas();
	}
}
