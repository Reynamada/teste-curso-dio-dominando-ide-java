package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		
		Gato gato = new Gato(null, null, null);
		Livros Livros = new Livros();
		
		System.out.println(gato);
		System.out.println(Livros);
		
		/*int a = 2;
		int b = 3;
		System.out.println("Hello Wordl " + (a+b));*/
		System.out.println("Tester git");
	}

}
class Livros {
	private String nome;
	private String npag;
}
