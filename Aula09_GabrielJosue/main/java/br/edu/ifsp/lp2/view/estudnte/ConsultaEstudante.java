package br.edu.ifsp.lp2.view.estudnte;

import java.util.Scanner;

import br.edu.ifsp.lp2.controller.EstudanteController;
import br.edu.ifsp.lp2.model.estudante.Estudante;
import br.edu.ifsp.lp2.view.estudnte.AlteraEstudante;
import br.edu.ifsp.lp2.view.estudnte.ExcluirEstudante;


public class ConsultaEstudante {
	 static Scanner entrada = new Scanner(System.in);

	    public static void exibeInterface() {
	        String formato = "%1$-2s %2$-25s %3$-15s %4$-12s%n %5$-7s%n";
	     
	        System.out.print("\nCONSULTA DE Estudante:");
	        System.out.printf(formato, "ID", " |NOME", " | SEXO", " | DEFICIENCIA", " | IRA");

	        for (Estudante estudante : new EstudanteController().consultaEstudante()) {
	            System.out.printf(formato, estudante.getId(),
	            		" | " + estudante.getNome(),
	            		" | " + estudante.getSexo(),
	            		" | " + estudante.getIra(),
	            		" | " + (estudante.getDeficiencia() ? "Sim" : "Não"));
	        }
	        System.out.println();
	        exibeOpcoesAlterarExcluir();
	    }

		private static void exibeOpcoesAlterarExcluir() {
			 int opcaoOperacao = 0;

		        do {
		            System.out.println("ALTERAÇÃO / EXCLUSÃO DE Estudante:");
		            System.out.println("1) Alterar");
		            System.out.println("2) Excluir");
		            System.out.print("Digite uma opção (0 para voltar): ");

		            opcaoOperacao = Integer.parseInt(entrada.nextLine());
		            System.out.println();

		            switch (opcaoOperacao) {
		                case 0:
		                    break;
		                case 1:
		                    AlteraEstudante.exibeInterface(); 
		                    break;
		                case 2:
		                    ExcluirEstudante.exibeInterface(); 
		                    break;
		                default:
		                    if (opcaoOperacao != 1 && opcaoOperacao != 2)
		                        System.out.println("Digite uma opção valida.");
		                    break;
		            }
		        } while (opcaoOperacao != 0 && opcaoOperacao != 1 && opcaoOperacao != 2); 
		}

}
