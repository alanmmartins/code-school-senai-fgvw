import promptSync from "prompt-sync"

const prompt: any = promptSync()

export function DiferenteDeZero() {

let numero: number = parseInt(prompt("digite um numero : "))

do {
    numero  = prompt("digite um numero : ")
} while (numero != 0);

}