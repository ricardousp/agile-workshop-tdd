package br.com.caelum.tdd.exercicio6;

public class Frete {
	
	private Estado estado;
	private Compra compra;
	private double valorTotalFrete;		
	
//	public double calculaFrete(){
//		if(estado)
//		
//		return 0;
//	}
	
	public Estado getEstado() {
		return estado;
	}
	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	public Compra getCompra() {
		return compra;
	}
	public void setCompra(Compra compra) {
		this.compra = compra;
	}
	public double getValorTotalFrete() {
		return valorTotalFrete;
	}
	public void setValorTotalFrete(double valorTotalFrete) {
		this.valorTotalFrete = valorTotalFrete;
	}
	
}
