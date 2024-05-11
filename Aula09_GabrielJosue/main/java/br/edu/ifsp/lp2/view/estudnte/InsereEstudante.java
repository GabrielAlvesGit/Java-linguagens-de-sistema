package br.edu.ifsp.lp2.view.estudnte;

import java.math.BigDecimal;
import java.util.Scanner;

import br.edu.ifsp.lp2.controller.EstudanteController;


public class InsereEstudante {
	static Scanner entrada = new Scanner(System.in);
	
	public static void exibeInterface() {
		String nome; 
		Character sexo; 
		Boolean deficiencia;
		Double ira;
		
		System.out.print("\nINSERÇÃO DE Estudante:");
		System.out.print("NOME:");
		nome = entrada.nextLine();
		
		System.out.print("SEXO: ");
		sexo = entrada.next().charAt(0);
		
		System.out.print("IRA: ");
		ira = entrada.nextDouble();
		entrada.nextLine(); // Limpa o buffer
		
		System.out.print("DEFICIENCIA: ");
		deficiencia = (entrada.nextLine().equals("s") ? true : false);

		
		new EstudanteController().insereEstudante(nome, sexo, deficiencia, ira);;
		System.out.print("Estudante cadastrado com sucesso. \n");
	}
}