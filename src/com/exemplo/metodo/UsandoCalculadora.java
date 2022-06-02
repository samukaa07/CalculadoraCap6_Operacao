package com.exemplo.metodo;

public class UsandoCalculadora {

	public static void main(String[] args) {
		// criar uma variavel para chamar o objeto da instancia e acessar o metodo de somar()
		int somando; // variavel simples , definida
		int subtraindo; // variavel para operação de subtração
		int multiplicar; // variavel para operação de subtração
		int dividir; // variavel para operação de subtração
		// instanciando a classe Calculadora
		Calculadora calc = new Calculadora();
		//fazer uso do objeto calc e acessar o método somar()
		somando = calc.somar(12, 60);
		// fazer uso do objeto calc e acessar o método subtrai()
		subtraindo = calc.subtrair(12, 60);
		// fazer uso do objeto calc e acessar o método multiplicar()
		multiplicar = calc.multiplicacao(12, 60);
		// fazer uso do objeto calc e acessar o método dividir()
		dividir = calc.divisao(100, 2);
		
		// exibir a soma
		System.out.println("Somando - Total : " + somando);
		System.out.println("Subtraindo - Total : " + subtraindo);
		System.out.println("Multiplicando - Total : " + multiplicar);
		System.out.println("Dividindo - Total : " + dividir);
					
	}

}
