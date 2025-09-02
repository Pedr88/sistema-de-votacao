package io.github.pedr88.sistemadevotacao;

/**
 * Interface para o gerenciamento de votação.
 */
public interface GerenciamentoVotacaoInterface {

  /**
   * Cadastra uma pessoa candidata.
   *
   * @param nome   Nome da pessoa candidata
   * @param numero Número da pessoa candidata
   */
  void cadastrarPessoaCandidata(String nome, int numero);

  /**
   * Cadastra uma pessoa eleitora.
   *
   * @param nome Nome da pessoa eleitora
   * @param cpf  CPF da pessoa eleitora
   */
  void cadastrarPessoaEleitora(String nome, String cpf);

  /**
   * Registra um voto de uma pessoa eleitora para uma pessoa candidata.
   *
   * @param cpfPessoaEleitora    CPF da pessoa eleitora
   * @param numeroPessoaCandidata Número da pessoa candidata
   */
  void votar(String cpfPessoaEleitora, int numeroPessoaCandidata);

  /**
   * Mostra o resultado da votação.
   */
  void mostrarResultado();
}
