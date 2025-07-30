package br;

public class Main {
  public static void main(String[] args) {

    Produto produto1 = new Produto("Trena", 79.99, 50);
    produto1.vender(20);
    produto1.exibirResumo();

//    Produto produto2 = new Produto("Martelete", 1779.99);
//    produto2.adicionarQuantidade(145);
//    produto2.vender(3);
//    produto2.exibirResumo();



  }
}