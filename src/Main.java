import arvore.ArvoreBinaria;
import model.Curso;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArvoreBinaria arvore = new ArvoreBinaria();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n=== SISTEMA DE GERENCIAMENTO DE CURSOS ===");
            System.out.println("1.  Inserir curso");
            System.out.println("2.  Buscar curso");
            System.out.println("3.  Remover curso");
            System.out.println("4.  Exibir em ordem");
            System.out.println("5.  Exibir em pre-ordem");
            System.out.println("6.  Exibir em pos-ordem");
            System.out.println("7.  Quantidade de cursos");
            System.out.println("8.  Altura da arvore");
            System.out.println("9.  Curso de maior codigo");
            System.out.println("10. Curso de menor codigo");
            System.out.println("0.  Encerrar sistema");
            System.out.print("Opcao: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Codigo: ");
                    int codigo = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Carga horaria (horas): ");
                    int carga = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Area: ");
                    String area = scanner.nextLine();
                    arvore.inserir(new Curso(codigo, nome, carga, area));
                    System.out.println("Curso inserido.");
                    break;
                case 2:
                    System.out.print("Codigo para buscar: ");
                    int codBusca = scanner.nextInt();
                    Curso encontrado = arvore.buscar(codBusca);
                    if (encontrado != null)
                        System.out.println(encontrado);
                    else
                        System.out.println("Curso nao encontrado.");
                    break;
                case 3:
                    System.out.print("Codigo para remover: ");
                    int codRemover = scanner.nextInt();
                    arvore.remover(codRemover);
                    System.out.println("Curso removido.");
                    break;
                case 4:
                    System.out.println("Em Ordem:");
                    arvore.emOrdem();
                    break;
                case 5:
                    System.out.println("Pre-Ordem:");
                    arvore.preOrdem();
                    break;
                case 6:
                    System.out.println("Pos-Ordem:");
                    arvore.posOrdem();
                    break;
                case 7:
                    System.out.println("Quantidade de cursos: " + arvore.contar());
                    break;
                case 8:
                    System.out.println("Altura da arvore: " + arvore.altura());
                    break;
                case 9:
                    Curso maior = arvore.maiorCodigo();
                    if (maior != null)
                        System.out.println(maior);
                    else
                        System.out.println("Arvore vazia.");
                    break;
                case 10:
                    Curso menor = arvore.menorCodigo();
                    if (menor != null)
                        System.out.println(menor);
                    else
                        System.out.println("Arvore vazia.");
                    break;
                case 0:
                    System.out.println("Sistema encerrado.");
                    break;
                default:
                    System.out.println("Opcao invalida.");
            }
        } while (opcao != 0);

        scanner.close();
    }
}
