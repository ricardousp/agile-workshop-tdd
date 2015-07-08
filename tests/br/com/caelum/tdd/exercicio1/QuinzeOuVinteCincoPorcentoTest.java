package br.com.caelum.tdd.exercicio1;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class QuinzeOuVinteCincoPorcentoTest {

	private QuinzeOuVinteCincoPorcento porcentagem;

	@Before
	public void setUp() {
		porcentagem = new QuinzeOuVinteCincoPorcento();
	}
	
	@Test
	public void salarioMaiorQue2000(){
		Funcionario funcionario = new Funcionario();
		funcionario.setSalarioBase(3000);
		double salariofinal = porcentagem.calcula(funcionario);
		assertEquals(3000*0.75, salariofinal, 0.0001);
	}
	
	@Test
	public void salarioMenorQue2000(){
		Funcionario funcionario = new Funcionario();
		funcionario.setSalarioBase(1000);
		double salariofinal = porcentagem.calcula(funcionario);
		assertEquals(1000*0.85, salariofinal, 0.0001);
	}
	
}
