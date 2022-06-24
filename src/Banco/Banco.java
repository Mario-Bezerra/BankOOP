package Banco;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import model.Conta;

public class Banco {

	private String nome;
	private Collection<Conta> contasDoBanco = new ArrayList<Conta>();
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Collection<Conta> getContasDoBanco() {
		return contasDoBanco;
	}
	public void adicionarContasDoBanco(Conta contaCriada) {
		this.contasDoBanco.add(contaCriada);
	}
	
	public void listaDeContas(){
		for (Conta conta : contasDoBanco) {
			System.out.println(conta);
		}
	}
	
}
