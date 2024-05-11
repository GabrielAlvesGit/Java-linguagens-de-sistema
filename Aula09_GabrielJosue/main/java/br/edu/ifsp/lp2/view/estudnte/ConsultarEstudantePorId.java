package br.edu.ifsp.lp2.view.estudnte;

import java.util.Scanner;

import br.edu.ifsp.lp2.controller.EstudanteController;
import br.edu.ifsp.lp2.model.estudante.Estudante;

public class ConsultarEstudantePorId {
	static Scanner entrada = new Scanner (System.in);
	
	 public static void exibeInterface() {
		 	Long id;
	        String formato = "%1$-2s %2$-25s %3$-15s %4$-12s%n";

	        System.out.print("\nCONSULTA DE Estudante Por Id:");
	        System.out.print("\nInforme o Id do livro:");
	        id = Long.parseLong(entrada.nextLine());
	        
	        Estudante estudante = new EstudanteController().consultaEstudantePorId(id);
	        
	        System.out.printf(formato, "ID", " |NOME", " | SEXO", " | DEFICIENCIA", " | IRA");
	        System.out.printf(formato, estudante.getId(),
            		" | " + estudante.getNome(),
            		" | " + estudante.getSexo(),
            		" | " + estudante.getIra(),
            		" | " + (estudante.getDeficiencia() ? "Sim" : "Não"));
	    }
}
