package EstruturasRepeticao;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in); /*ler a tela */
        System.out.println("Digite sua idade: "); /*poe na tela tipo o console.log*/

        double idade = Double.parseDouble(leitor.nextLine());


       /* DEciSAO*/
        if (idade > 18) {
            System.out.println("maiorrr");
        } else if (idade < 18) {
            System.out.println("menor.");
        } else {
            System.out.println("dizoituuu.");
        }
    }






}
