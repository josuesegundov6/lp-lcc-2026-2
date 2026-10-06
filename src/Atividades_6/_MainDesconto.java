package Atividades_6;

public class _MainDesconto {

    public static double calculaValorComDesconto(double valorProduto) {
        if (valorProduto < 50) {
            return valorProduto;
        } else if (valorProduto < 100) {
            return valorProduto - (valorProduto * 0.05);
        } else {
            return valorProduto - (valorProduto * 0.10);
        }
    }

    public static double calculaSomatorioDescontos(Produto[] produtos) {

        double soma = 0;

        for (int k = 0; k < produtos.length; k++) {

            double precoOriginal = produtos[k].getPreco();

            double precoComDesconto =
                    calculaValorComDesconto(precoOriginal);

            double desconto = precoOriginal - precoComDesconto;

            soma += desconto;
        }

        return soma;
    }

    public static String verificaProdutoComMaiorDesconto(Produto[] produtos) {

        String produtoMaiorDesconto = "";
        double maiorDesconto = 0;

        for (int k = 0; k < produtos.length; k++) {

            double precoOriginal = produtos[k].getPreco();

            double precoComDesconto =
                    calculaValorComDesconto(precoOriginal);

            double desconto = precoOriginal - precoComDesconto;

            if (desconto > maiorDesconto) {
                maiorDesconto = desconto;
                produtoMaiorDesconto = produtos[k].getNome();
            }
        }

        return produtoMaiorDesconto;
    }

}