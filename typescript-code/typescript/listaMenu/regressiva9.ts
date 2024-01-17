/* Faça um programa que receba um número do usuário e mostre
no console a contagem regressiva até 0. */

import promptSync from "prompt-sync"

const prompt: any = promptSync()
export function RegressivaAteZero() {



  let numero:number = parseInt(prompt("Digite um número:"));

  while (numero >= 0) {
    console.log(numero--);
    // numero--;
  }
} 