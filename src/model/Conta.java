package model;

import java.math.BigDecimal;

import Banco.Banco;

public class Conta {

	private Cliente cliente;
	private Integer agencia;
	private Integer conta;
	private BigDecimal saldo = new BigDecimal(0);

	public Conta(Cliente cliente, Integer agencia, Integer conta) {
		this.cliente = cliente;
		this.agencia = agencia;
		this.conta = conta;
	}

	public boolean sacar(double valorSacado) {
		BigDecimal valorSacadoBigDecimal = new BigDecimal(valorSacado);
		if (this.saldo.doubleValue() < valorSacado) {
			return false;
		} else {
			this.saldo = this.saldo.subtract(valorSacadoBigDecimal);
			return true;
		}
	}

	public BigDecimal depositar(double valorDepositado) {
		if (valorDepositado != 0 && valorDepositado > 0) {
			this.saldo = this.saldo.add(new BigDecimal(valorDepositado));
		}
		return getSaldo();
	}

	public boolean tranferir(Conta contaOrigem, Conta contaDestino, double valorTranferido) {
		if (contaOrigem.sacar(valorTranferido)) {
			contaDestino.depositar(valorTranferido);
			return true;
		}
		return false;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Integer getAgencia() {
		return agencia;
	}

	public Integer getConta() {
		return conta;
	}

	public BigDecimal getSaldo() {
		return saldo;
	}
	
	@Override
	public String toString() {
		return "Conta [cliente=" + cliente.getNome() + ", agencia=" + agencia + ", conta=" + conta + ", saldo=" + saldo + "]";
	}

}
