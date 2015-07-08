package br.com.caelum.tdd.exercicio1;

public enum Cargo {
	
	DESENVOLVEDOR(new DezOuVintePorcento()),
	DBA(new QuinzeOuVinteCincoPorcento()),
	TESTER(new QuinzeOuVinteCincoPorcento()),
	GERENTE_PROJETO(new QuinzeOuVintePorcento());
	
	private RegraDeCalculo regra;
	
	Cargo(RegraDeCalculo regra){
		this.regra = regra;
	}

	public RegraDeCalculo getRegra() {
		return regra;
	}	
	
}
