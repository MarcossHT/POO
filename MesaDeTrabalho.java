import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class MesaDeTrabalho {
    static  void quantosPacotes(float quantidade, Scanner scanner) {
        if(quantidade < 3) {
            System.out.println("Quantidade insufuciente");
        } else {
            int quantidadePct = 0;
            float porcao = 0;
            for(int i = 0; porcao < quantidade; i++){
                System.out.println("Insira uma porcao");
                float porcaoInput = scanner.nextFloat();
                porcao += porcaoInput;
                quantidadePct += 1;
            }
            System.out.println("A quantidade de pacotes foi " + quantidadePct);
        }
    }

    static boolean primeOrNot(int num) {
        for (int i = 2; i < num; i++)
            if (num % i == 0) {
                return false;
            }
        return true;
    }

    static void primeList(int num) {
        for(int i = 2; i < num; i++) {
            if(primeOrNot(i)) {
                System.out.println(i + " ");
            }
        }
    }
    static void wichWin(int rodadas, Scanner scanner) {
        int playerWins = 0;
        int pcWins = 0;
        int draw = 0;

        for(int i = 1; i <= rodadas; i++) {
            System.out.println("Escolha sua opcao:" +
                    "1) Pedra, 2) Papel, 3) Tesoura");
            int player = scanner.nextInt();
            switch (player){
                case 1:
                    System.out.println("Jogador escolheu pedra");
                    break;
                case 2:
                    System.out.println("Jogador escolheu papel");
                    break;
                case 3:
                    System.out.println("Jogador escolheu tesoura");
                    break;
            }

            int pc = (int)(Math.random()*3 +1);
            switch (pc) {
                case 1:
                    System.out.println("PC escolheu pedra");
                    break;
                case 2:
                    System.out.println("PC escolheu papel");
                    break;
                case 3:
                    System.out.println("PC escolheu tesoura");
                    break;
            }

            if(player == pc) {
                System.out.println("Empate!");
                draw++;
            } else {
                if((player == 1 && pc == 3) || (player == 2 && pc == 1) || (player == 3 && pc == 2)) {
                    System.out.println("Player Wins!!");
                    playerWins++;
                } else {
                    System.out.println("PC wins!!");
                    pcWins++;
                }
            }
        }
        System.out.println("Placar: " + "Vitorias do jogador " + playerWins + "Vitorias do PC "
                + pcWins + "Empates " + draw);
    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("informe a quantidade de racao maxima que o doguinho vai cume");
        quantosPacotes(scanner.nextFloat(), scanner);
        System.out.println("informe um numero para contagem");
        primeList(scanner.nextInt());
        System.out.println("Escolha o número de rodadas");
        wichWin(scanner.nextInt(), scanner);
    }
}
