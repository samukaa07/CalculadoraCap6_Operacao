package com.exemplo.metodo;

public class Calculadora {

	// criando um m�todo para a execu��o de uma opera��o
	
	public int somar(int valor1, int valor2){
		// indicar uma vari�vel para que receba a soma dos valores dos parametros
		int resultado;
		//estabelecendo a opera��o
		resultado = valor1 + valor2;
		//implementando a express�o de retorno
		return resultado;
				
	}
	
	// vamos criar as outras 3 opera��es aritim�ticas - subtra��o, multiplica��o e divis�o
	
		public int subtrair(int valor1, int valor2) {
			//indicar uma variavel para que receba a substra��o dos valores dos parametros
			int resultado;
			// estabelecendo a opera��o
			resultado = valor1 - valor2;
			// implementa��o a express�o de retorno
			return resultado;
		}
		
		public int multiplicacao(int valor1, int valor2) {
			//indicar uma variavel para que receba a substra��o dos valores dos parametros
			int resultado;
			// estabelecendo a opera��o
			resultado = valor1 * valor2;
			// implementa��o a express�o de retorno
			return resultado;
}
		public int divisao(int valor1, int valor2) {
			//indicar uma variavel para que receba a substra��o dos valores dos parametros
			int resultado;
			// estabelecendo a opera��o
			resultado = valor1 / valor2;
			// implementa��o a express�o de retorno
			return resultado;
		}
}
