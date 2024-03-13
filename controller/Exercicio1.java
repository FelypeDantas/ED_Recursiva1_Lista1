package controller;

public class Exercicio1 {
	
	public Exercicio1() {
		super();
	}
	
	public int soma(int valor) {
		if(valor == 0) {
			return valor;
		}
		return valor + soma(valor - 1);
	}

}
