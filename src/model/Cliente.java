package model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Cliente {

	private String nome;
	private LocalDate dataDeNascimento;
	private Endereco endereco;

	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	public Cliente(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(String dataInserida) {
		LocalDate dataFormatada = LocalDate.parse(dataInserida, formatter);
		this.dataDeNascimento = dataFormatada;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public int getIdade(LocalDate dataDeNascimento) {
		int anoDeNascimento = dataDeNascimento.getYear();
		int hoje = LocalDate.now().getYear();

		return hoje - anoDeNascimento;
	}

	@Override
	public String toString() {
		return "Cliente Nome = " + nome ;
	}

}
