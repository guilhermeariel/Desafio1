package br;

public class Produto {

  //ATRIBUTOS
  private String nome;
  private double preco;
  private int quantidade;

  //METODOS PUBLICOS
  public void adicionarQuantidade(int quantidade) {
    if (quantidade > 0) {
      this.quantidade += quantidade;
    }
  }

  public boolean vender(int quantidade){
    if(quantidade > 0 && quantidade <= this.quantidade) {
      this.quantidade -= quantidade;
      return true;
    } else {
      System.out.println("Quantidade insuficiente em estoque para venda.");
      return false;
    }
  }

  public void exibirResumo(){
    System.out.println("Produto: " + this.nome);
    System.out.printf("Preço: R$ %.2f\n", this.preco);
    System.out.println( "Venda realizada com sucesso!");
    System.out.println("Há " + this.quantidade + " unidades do produto " + this.nome + " disponíveis para venda.");


  }


  //CONSTRUTOR ALL
  public Produto(String nome, double preco, int quantidade) {
    this.nome = nome;
    this.preco = preco;
    this.quantidade = quantidade;
  }

  //CONSTRUTOR NOME PRECO
  public Produto(String nome, double preco) {
    this.nome = nome;
    this.preco = preco;
    this.quantidade = 0;
  }

  //GETTETS SETTERS
  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public double getPreco() {
    return preco;
  }

  public void setPreco(double preco) {
    this.preco = preco;
  }

  public int getQuantidade() {
    return quantidade;
  }

  public void setQuantidade(int quantidade) {
    this.quantidade = quantidade;
  }
}
