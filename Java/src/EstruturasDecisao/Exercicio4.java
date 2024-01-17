package EstruturasDecisao;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String senha;
        String usuario;

        System.out.println("Digite o nome do usuario : ");
        System.out.println("Digite a senha  : ");
        senha = leitor.nextLine();
        usuario = leitor.nextLine();

        if (usuario.equals("admin") && senha.equals("senha123")) {
            System.out.println("loginnn bem");
        } else {

            System.out.println("errouu");


        }
    }
}