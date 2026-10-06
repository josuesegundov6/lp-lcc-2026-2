package Atividades_6;

import java.util.Scanner;

class ProgramaDescontos {

    public static double calculaValorComDesconto(double valorProduto) {
        if (valorProduto < 50) {
            return valorProduto;
        } else if (valorProduto < 100) {
            return valorProduto - (valorProduto * 0.05);
        } else {
            return valorProduto - (valorProduto * 0.10);
        }
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Quantos produtos você quer comprar?");
        int quant = Integer.parseInt(leitor.nextLine());

        Produto[] produtos = new Produto[quant];

        for (int k = 0; k < quant; k++) {
            Produto p = new Produto();

            System.out.println("Qual o nome do produto?");
            p.setNome(leitor.nextLine());

            System.out.println("Qual o preço original do produto?");
            p.setPreco(Double.parseDouble(leitor.nextLine()));

            double valorComDesconto =
                    calculaValorComDesconto(p.getPreco());


            System.out.printf(
                    "O valor a pagar pelo produto é R$ %.2f%n",
                    valorComDesconto
            );

            produtos[k] = p;
        }


        leitor.close();
    }
}