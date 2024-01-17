package EstruturasDecisao;

import java.util.Arrays;
import java.util.Scanner;

public class Exemplo1 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in); /*ler a tela */
        System.out.println("Digite seu salario: "); /*poe na tela tipo o console.log*/

        double salario = Double.parseDouble(leitor.nextLine());
        /*double salario = leitor.nextDouble();*/

        if (salario < 1000) {
            double SalarioRealAjustado = salario * 1.1; /*1.1 = 100% +10%*/
            System.out.println(SalarioRealAjustado);
        }else{
            System.out.println("salario sem reajuste");
        }
    }
}