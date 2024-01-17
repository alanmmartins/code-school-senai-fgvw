package EstruturasDecisao;

import java.util.Scanner;

public class Exemplo3 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in); /*ler a tela */
        System.out.print("Digite o primeiro número: ");
        double numero1 = Double.parseDouble(leitor.nextLine());

        System.out.print("Digite o segundo número: ");
        double numero2 = Double.parseDouble(leitor.nextLine());

        if (numero1 > numero2) {
            System.out.println(numero1 + " é o maior número.");
        } else if (numero2 > numero1) {
            System.out.println(numero2 + " é o maior número.");
        } else {
            System.out.println("Os números são iguais.");
        }


    }
}


