package view;

import javax.swing.JOptionPane;

import controller.Exercicio1;

public class Principal {

	public static void main(String[] args) {
		
		Exercicio1 exerc = new Exercicio1();
		
		int valor;
		
		valor = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor: "));
		
		System.out.println(exerc.soma(valor));

	}

}
