package EstruturasRepeticao;

public class Exercicio3 {
    public static void main(String[] args)throws InterruptedException
    {
        String[] listaCarros = {"Fox","Gol","Chevette","Solf"};
        for (String cadaCarro: listaCarros  ) {
            System.out.println(cadaCarro);
            Thread.sleep(1000);

        }
    }
}
