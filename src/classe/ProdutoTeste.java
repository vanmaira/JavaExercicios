package classe;

import java.util.Scanner;

public class ProdutoTeste {
    public static void main(String[] args) {

        Produto p1 = new Produto("Notebook", 4000.90);

        var p2 = new Produto();
        p2.nome = "Caneta Preta";
        p2.preco = 12.56;

        Produto.desconto = 0.50;

        System.out.println(p1.nome + " " + p1.precoComDesconto());
        System.out.println(p2.nome + " " + p2.precoComDesconto());

        double precoFinal1 = p1.preco * (1-p1.desconto);
        double precoFinal2 = p2.preco * (1-p2.desconto);
        double mediaCarrinho = (precoFinal1 + precoFinal2)/2;

        System.out.printf("Média do carrinho = R$%.2f \n", mediaCarrinho);

        System.out.println("-----------------");

        double precofinal3 = p1.precoComDesconto();
        System.out.printf("Preço com desconto: R$%.2f \n", precofinal3);

        double precoFinal4 = p2.precoComDesconto(0.3);
        System.out.printf("Preço com desconto: R$%.2f \n", precoFinal4);


    }
}
