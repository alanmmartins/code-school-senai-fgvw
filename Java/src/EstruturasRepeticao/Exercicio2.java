package EstruturasRepeticao;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String senha;

        do {
            System.out.println("Digite a sua senha : ");
            senha = leitor.nextLine();

            if (!senha.equals("123")){
                System.out.println("Errouuu");
            }
        }while (!senha.equals("123"));
        System.out.println("Digite a sua senha : ");

    }

}


   /* var prompt = require('prompt-sync')();

        let senha;

        do {
        senha = prompt("Digite a senha: ")

        if (senha != "123") {

        console.log("Senha incorreta!");
        }

        } while (senha != "123");

        console.log("Senha correta!");*/