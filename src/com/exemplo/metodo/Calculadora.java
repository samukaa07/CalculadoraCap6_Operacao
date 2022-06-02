package com.exemplo.metodo;

public class Calculadora {

	// criando um método para a execução de uma operação
	
	public int somar(int valor1, int valor2){
		// indicar uma variável para que receba a soma dos valores dos parametros
		int resultado;
		//estabelecendo a operação
		resultado = valor1 + valor2;
		//implementando a expressão de retorno
		return resultado;
				
	}
	
	// vamos criar as outras 3 operações aritiméticas - subtração, multiplicação e divisão
	
		public int subtrair(int valor1, int valor2) {
			//indicar uma variavel para que receba a substração dos valores dos parametros
			int resultado;
			// estabelecendo a operação
			resultado = valor1 - valor2;
			// implementação a expressão de retorno
			return resultado;
		}
		
		public int multiplicacao(int valor1, int valor2) {
			//indicar uma variavel para que receba a substração dos valores dos parametros
			int resultado;
			// estabelecendo a operação
			resultado = valor1 * valor2;
			// implementação a expressão de retorno
			return resultado;
}
		public int divisao(int valor1, int valor2) {
			//indicar uma variavel para que receba a substração dos valores dos parametros
			int resultado;
			// estabelecendo a operação
			resultado = valor1 / valor2;
			// implementação a expressão de retorno
			return resultado;
		}
}
