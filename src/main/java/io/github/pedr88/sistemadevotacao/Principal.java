package io.github.pedr88.sistemadevotacao;

import java.util.Scanner;

/**
 * Classe Principal.
 */
public class Principal {

  /**
   * Método principal.
   *
   * @param args Argumentos da linha de comando
   */
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    GerenciamentoVotacao gerenciamento = new GerenciamentoVotacao();
    short opcao = 0;

    do {
      System.out.println("Cadastrar pessoa candidata?");
      System.out.println("1 - Sim");
      System.out.println("2 - Não");
      System.out.println("Entre com o número correspondente à opção desejada:");
      opcao = scan.nextShort();

      if (opcao == 1) {
        System.out.println("Entre com o nome da pessoa candidata:");
        String nome = scan.next();
        System.out.println("Entre com o número da pessoa candidata:");
        int numero = scan.nextInt();
        gerenciamento.cadastrarPessoaCandidata(nome, numero);
      }
    } while (opcao != 2);

    do {
      System.out.println("Cadastrar pessoae eleitora?");
      System.out.println("1 - Sim");
      System.out.println("2 - Não");
      System.out.println("Entre com o número correspondente à opção desejada:");
      opcao = scan.nextShort();

      if (opcao == 1) {
        System.out.println("Entre com o nome da pessoa eleitora:");
        String nome = scan.next();
        System.out.println("Entre com o CPF da pessoa eleitora:");
        String cpf = scan.next();
        gerenciamento.cadastrarPessoaEleitora(nome, cpf);
      }
    } while (opcao != 2);

    do {
      System.out.println("\nEntre com o número correspondente à opção desejada:");
      System.out.println("1 - Votar");
      System.out.println("2 - Resultado Parcial");
      System.out.println("3 - Finalizar Votação");
      opcao = scan.nextShort();

      switch (opcao) {
        case 1:
          System.out.println("Entre com o cpf da pessoa eleitora:");
          String cpf = scan.next();
          System.out.println("Entre com o número da pessoa candidata:");
          int numero = scan.nextInt();
          gerenciamento.votar(cpf, numero);
          break;
        case 2:
          gerenciamento.mostrarResultado();
          break;
        case 3:
          gerenciamento.mostrarResultado();
          break;
        default:
          break;
      }
    } while (opcao != 3);

    scan.close();
  }
}
