package Atividades_6;

import java.util.Scanner;

class Teste3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Quantas refeições foram servidas hoje?");
        int quantidadeRefeicoes = Integer.parseInt(leitor.nextLine());

        RefeicaoRealizada[] refeicoes =
                new RefeicaoRealizada[quantidadeRefeicoes];

        boolean teveCafe = false;

        for (int k = 0; k < quantidadeRefeicoes; k++) {

            if (refeicoes[k].getTipoRefeicao().equalsIgnoreCase("CAFÉ")) {
                teveCafe = true;
            }
        }

        if (teveCafe) {
            System.out.println("SIM");
        } else {
            System.out.println("NÃO");
        }

        int quantidadeAlmocos = 0;

        for (int k = 0; k < quantidadeRefeicoes; k++) {

            if (refeicoes[k].getTipoRefeicao().equals("ALMOÇO")) {
                quantidadeAlmocos++;
            }

        }

        System.out.printf("FIM DO PROGRAMA");

        leitor.close();
    }
}