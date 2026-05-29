import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String continuar;

        do {
            System.out.print("Digite uma letra de A a J: ");
            char letra = sc.next().toUpperCase().charAt(0);
            int pontos;

            if (letra == 'A') {
                pontos = 10;
            } else if (letra == 'B') {
                pontos = 20;
            } else if (letra == 'C') {
                pontos = 30;
            } else if (letra == 'D') {
                pontos = 40;
            } else if (letra == 'E') {
                pontos = 50;
            } else if (letra == 'F') {
                pontos = 60;
            } else if (letra == 'G') {
                pontos = 70;
            } else if (letra == 'H') {
                pontos = 80;
            } else if (letra == 'I') {
                pontos = 90;
            } else if (letra == 'J') {
                pontos = 100;
            } else {
                System.out.println("Letra fora do seu rabo permitido!");
                System.out.print("Deseja tentar novamente? (S/N): ");
                continuar = sc.next();
                continue; // volta para o início do loop
            }

            System.out.println("Você ganhou " + pontos + " pontos!");

            if (pontos >= 80) {
                System.out.println("Excelente escolha!");
            } else if (pontos >= 50) {
                System.out.println("Boa escolha!");
            } else if (pontos >= 30) {
                System.out.println("Poderia ser melhor...");
            } else {
                System.out.println("Tente novamente!");
            }

            System.out.print("\nDeseja jogar novamente? (S/N): ");
            continuar = sc.next();

        } while (continuar.equalsIgnoreCase("S"));

        System.out.println("Obrigado por jogar!");
        sc.close();
    }
}
