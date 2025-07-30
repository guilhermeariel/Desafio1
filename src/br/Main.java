package br;

public class Main {
  public static void main(String[] args) {
    Produto produto1 = new Produto("Trena De Aço 5mts X 19mm Auto Trava Vonder Plus",
        2779.99, 10);
    produto1.exibirResumo();

    Produto produto2 = new Produto("Martelete Comb Makita Dhr202z 18v + 1bat 3ah + Carreg E Aces", 1779.99);


    produto2.adicionarQuantidade(145);
    produto2.vender(3);
    produto2.exibirResumo();



  }
}