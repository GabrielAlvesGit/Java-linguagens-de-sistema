package br.edu.ifsp.lp2.view.estudnte;

import java.math.BigDecimal;
import java.util.Scanner;

import br.edu.ifsp.lp2.controller.EstudanteController;

public class AlteraEstudante {
static Scanner entrada = new Scanner(System.in);
	
	public static void exibeInterface() {
		Long id;
		String nome; 
		Character sexo; 
		Boolean deficiencia;
		Double ira;
		
		System.out.print("\nAletrar DE Estudante:");
		System.out.print("Informe o id do Estudante a ser alterado:");
		id = Long.parseLong(entrada.nextLine());
			
		System.out.print("NOME:");
		nome = entrada.nextLine();
		
		System.out.print("SEXO: ");
		sexo = entrada.next().charAt(0);
		
		System.out.print("DEFICIENCIA: ");
		deficiencia = (entrada.nextLine().equals("s") ? true : false);
		
		System.out.print("IRA: ");
		ira = entrada.nextDouble();
		
		new EstudanteController().insereEstudante(nome, sexo, deficiencia, ira);;
		System.out.print("Livro cadastrado com sucesso. \n");
	}
}
