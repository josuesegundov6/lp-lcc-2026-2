package Atividades_6;
import java.util.Scanner;
public class Novo_RU {

    public class CalculoAlmocos {
        public static void main(String[] args) {
            Scanner leitor = new Scanner(System.in);

            System.out.println("Quantidade de refeições do tipo ALMOÇO:");
            int quantidadeAlmocos = Integer.parseInt(leitor.nextLine());

            System.out.println("Preço de cada refeição:");
            double preco = Double.parseDouble(leitor.nextLine());

            double total = quantidadeAlmocos * preco;

            System.out.println("Valor total gasto pelo RU: R$ " + total);

            leitor.close();
        }
    }
}
