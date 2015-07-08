package br.com.caelum.tdd.exercicio6;

public class Desconto {

	private double valorTotalDesconto;
	private Compra compra;
	
	public Desconto(Compra compra){
		this.compra = compra;
	}

	public double getValorTotalDesconto() {
		double precoTotalCompra = compra.getValorTotalDaCompra();
		if(precoTotalCompra <= 500){
			valorTotalDesconto = precoTotalCompra*1.05;
		}
		else{
			if(precoTotalCompra > 500 && precoTotalCompra <= 2000){
				valorTotalDesconto = precoTotalCompra*1.10;
			}
			else{
				valorTotalDesconto = precoTotalCompra*1.15;
			}
		}
		return valorTotalDesconto;
	}
	
	
	
}
