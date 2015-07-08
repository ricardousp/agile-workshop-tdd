package br.com.caelum.tdd.exercicio6;

import java.util.List;

public class Compra {
	
	private List<Item> itens;
	private Cliente cliente;
	private double valorTotalDaCompra;
	
	public List<Item> getItens() {
		return itens;
	}
	public void setItens(List<Item> itens) {
		this.itens = itens;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public double getValorTotalDaCompra() {
		return valorTotalDaCompra;
	}
	public void setValorTotalDaCompra(double valorTotalDaCompra) {
		this.valorTotalDaCompra = valorTotalDaCompra;
	}
	
	
	
}
