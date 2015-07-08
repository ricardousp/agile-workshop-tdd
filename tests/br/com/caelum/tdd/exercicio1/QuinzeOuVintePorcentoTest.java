package br.com.caelum.tdd.exercicio1;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class QuinzeOuVintePorcentoTest {

	private QuinzeOuVintePorcento porcentagem;

	@Before
	public void setUp() {
		porcentagem = new QuinzeOuVintePorcento();
	}
	
	@Test
	public void salarioMaiorQue5000(){
		Funcionario funcionario = new Funcionario();
		funcionario.setSalarioBase(7000);
		double salariofinal = porcentagem.calcula(funcionario);
		assertEquals(7000*0.8, salariofinal, 0.0001);
	}
	
	@Test
	public void salarioMenorQue5000(){
		Funcionario funcionario = new Funcionario();
		funcionario.setSalarioBase(3000);
		double salariofinal = porcentagem.calcula(funcionario);
		assertEquals(3000*0.85, salariofinal, 0.0001);
	}
	
}
