import promptSync from "prompt-sync"

const prompt : any = promptSync()

import { ZeroaDez } from "../listaMenu/zeroADez1";
import { Pares1a10 } from "../listaMenu/pares2";
import { Impares0a50 } from "../listaMenu/impares3";
import { Tabuada } from "../listaMenu/tabuada4";
import { Fibo } from "../listaMenu/fibonacci5";
import { Pares0a20 } from "../listaMenu/paresAteVinte6";
import { SomarNumerosAte100 } from "../listaMenu/somaCem7";
import { MaiorIdadade } from "../listaMenu/maiordezoito8";
import { RegressivaAteZero } from "../listaMenu/regressiva9";
import { DiferenteDeZero } from "../listaMenu/diferenteDeZero10"; 

/* import {a500reais} from "..//Aula1/lista1/a500reais" */
/* import { verificarMaiorIdade } from "../Aula2/Exercicios17_07/WHILEexe3.js"; */  //importando o arquivo

let exercicio:number;
let continuar:string;

do {
    exercicio = parseInt(prompt("Digite um numero que represente um exercicio de 1 a 10: "))

    switch (exercicio) {

        case 1:
            ZeroaDez()
            break;

        case 2:
            Pares1a10()
            break;
        case 3:
            Impares0a50()
            break;

        case 4:
            Tabuada()
            break;
        case 5:
            Fibo()
            break;

        case 6:
            Pares0a20()
            break;
        case 7:
            SomarNumerosAte100()
            break;

         case 8:
            MaiorIdadade()
            break;

        case 9:
            RegressivaAteZero()
            break;

        case 10:
            DiferenteDeZero()
            break; 
        


        default:

            break;
    }
    continuar = prompt("Deseja continuar? Digite s para sim ou n para nao: ")

} while (continuar.toLocaleLowerCase() === "s");  //toLocaleLowerCase() - funçao que força a string ser minuscula "s" != "S'  === compara valor e tipo




/* 
const prompt = promptSync(); */

/* ZeroaDez();
Pares1a10();
Impares0a50();
Tabuada();
Fibo();
Pares0a20();
SomarNumerosAte100();
MaiorIdadade();
RegressivaAteZero();
DiferenteDeZero();
 */
