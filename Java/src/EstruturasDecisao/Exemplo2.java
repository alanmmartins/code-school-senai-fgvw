package EstruturasDecisao;

import java.util.Scanner;

public class Exemplo2 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in); /*ler a tela */
        System.out.println("Digite seu num: "); /*poe na tela tipo o console.log*/

        double num = Double.parseDouble(leitor.nextLine());


        if (num > 0) {
            System.out.println("O número é positivo.");
        } else if (num < 0) {
            System.out.println("O número é negativo.");
        } else {
            System.out.println("zerinhuuuuu.");
        }
    }


}


