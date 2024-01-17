package EstruturasRepeticao;

public class Exercicio1 {
    public static void main(String[] args) {
        String[] listaProfessores = {"Alexia","Odirlei","jessica","Thiago","Samanta"};
        for (int contador = 0; contador < listaProfessores.length  ; contador++) {
            if(contador == 0 ){
                System.out.println(" O numero do indice do ( a ) professor ( a )" +
                listaProfessores[contador] + "e zero");

            } else if (contador % 2 == 0) {
                System.out.println(" O numero do indice do ( a ) professor ( a )" +
                listaProfessores[contador] + "e par");
            }else{
                System.out.println(" O numero do indice do ( a ) professor ( a )" +
                listaProfessores[contador] + "e impar");
            }

        }

    }
}


/*
//Listar alunos e verificar posição na lista
// Se o numero for par, escreva "par" e o numero correspondente
//Se o numero for impar, escreva "impar" e o numero correspondente
//Se for zero, escreva "zero"

    let professores = ["Alana", "Aléxia", "Jéssica", "Odirlei", "Possarle", "Samanta", "Thiago"]

        for (let contador = 0; contador < professores.length; contador++) {
        console.log(`O índice atual é ${ contador }`)

        if (contador == 0) {
        console.log(`O número de indice do(a) professor(a) ${ professores[contador] } é Zero`)

        } else if (contador % 2 == 0) {
        console.log(`O número de indice do(a) professor(a) ${ professores[contador] } é Par`)

        } else {
        console.log(`O número de indice do(a) professor(a) ${ professores[contador] } é Impar`)
        }
        }*/
