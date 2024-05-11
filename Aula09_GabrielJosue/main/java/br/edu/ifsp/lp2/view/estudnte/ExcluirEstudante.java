package br.edu.ifsp.lp2.view.estudnte;

import java.util.Scanner;

import br.edu.ifsp.lp2.controller.EstudanteController;

public class ExcluirEstudante {
	static Scanner entrada = new Scanner(System.in);
	
	public static void exibeInterface() {
		Long id;
		
		System.out.println("EXCLUSÃO DE Estudante: ");
		System.out.println("Informe o Id do estudante a ser excluido: ");
		id = Long.parseLong(entrada.nextLine());
		
		new EstudanteController().excluirEstudante(id);
		System.out.println("Livro excluido com sucesso.\n");
	}
}
