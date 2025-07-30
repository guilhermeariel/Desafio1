package br;

public class Main {
  public static void main(String[] args) {
    Produto produto1 = new Produto("Notebook", 2500.00, 10);
    produto1.exibirResumo();

    Produto produto2 = new Produto("Martelete", 470.00);


    produto2.adicionarQuantidade(87);
    produto2.vender(3);
    produto2.exibirResumo();



  }
}