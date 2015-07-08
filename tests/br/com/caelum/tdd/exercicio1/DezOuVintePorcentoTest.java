package br.com.caelum.tdd.exercicio1;

import static org.junit.Assert.assertEquals;


import org.junit.Before;
import org.junit.Test;

public class DezOuVintePorcentoTest {
	
	private DezOuVintePorcento porcentagem;

	@Before
	public void setUp() {
		porcentagem = new DezOuVintePorcento();
	}
	
	@Test
	public void salarioMaiorQue3000(){
		Funcionario funcionario = new Funcionario();
		funcionario.setSalarioBase(5000);
		double salariofinal = porcentagem.calcula(funcionario);
		assertEquals(5000*0.8, salariofinal, 0.0001);
	}
	
	@Test
	public void salarioMenorQue3000(){
		Funcionario funcionario = new Funcionario();
		funcionario.setSalarioBase(2000);
		double salariofinal = porcentagem.calcula(funcionario);
		assertEquals(2000*0.9, salariofinal, 0.0001);
	}
	
}
