import promptSync from "prompt-sync"
//import * as promptSync from 'prompt-sync';
const prompt: any = promptSync();
export function Tabuada() {
  let numero: number = parseInt(prompt("Digite um número inteiro: "));

  for (let i: number = 1; i <= 10; i++) {
    console.log(`${numero} x ${i} = ${numero * i}`);
  }

} 