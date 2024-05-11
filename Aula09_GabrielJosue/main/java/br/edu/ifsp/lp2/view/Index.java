package br.edu.ifsp.lp2.view;

import java.util.Scanner;

import br.edu.ifsp.lp2.controller.EstudanteController;
import br.edu.ifsp.lp2.view.estudnte.AlteraEstudante;
import br.edu.ifsp.lp2.view.estudnte.ConsultaEstudante;
import br.edu.ifsp.lp2.view.estudnte.ConsultarEstudantePorId;
import br.edu.ifsp.lp2.view.estudnte.ExcluirEstudante;
import br.edu.ifsp.lp2.view.estudnte.InsereEstudante;

public class Index {
    public static void main(String[] args) {
        int opcaoCadastro = 0, opcaoOperacao = 0;

        Scanner entrada = new Scanner(System.in);

        do {
            System.out.println("CADASTROS:");
            System.out.println("1) Cadastro de Estudante");
            System.out.print("Digite uma opção (0 para sair): ");

            opcaoCadastro = Integer.parseInt(entrada.nextLine());

            switch (opcaoCadastro) {
                case 1:
                    do {
                        System.out.println("\nOPERAÇÕES:");
                        System.out.println("1) Inserir");
                        System.out.println("2) Consultar");
                        System.out.println("3) Consultar por Id");
                        System.out.println("4) Alterar");
                        System.out.println("5) Excluir");
                        System.out.print("Digite uma opção: ");

                        opcaoOperacao = Integer.parseInt(entrada.nextLine());

                        if (opcaoOperacao != 1 &&
                                opcaoOperacao != 2 &&
                                opcaoOperacao != 3 &&
                                opcaoOperacao != 4 &&
                                opcaoOperacao != 5)
                            System.out.println("Digite uma opção válida.");
                        else
                            defineOperacao(opcaoOperacao);
                    } while (opcaoOperacao != 0);
                    break;
                default:
                    if (opcaoCadastro != 0)
                        System.out.println("Digite uma opção válida.\n");
                    else {
                        new EstudanteController().finalizaEntityManager();
                        System.out.println("Programa encerrado.");
                    }
                    break;
            }
        } while (opcaoCadastro != 0);

        entrada.close();
    }

    public static void defineOperacao(int opcaoOperacao) {
        switch (opcaoOperacao) {
            case 1:
                InsereEstudante.exibeInterface();
                break;
            case 2:
                ConsultaEstudante.exibeInterface();
                break;
            case 3:
                ConsultarEstudantePorId.exibeInterface();
                break;
            case 4:
                AlteraEstudante.exibeInterface();
                break;
            case 5:
                ExcluirEstudante.exibeInterface();
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }
    }
}
