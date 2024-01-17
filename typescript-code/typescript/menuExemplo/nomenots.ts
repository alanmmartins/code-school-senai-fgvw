// Importe o módulo 'prompt-sync'
import * as promptSync from 'prompt-sync';

// Crie uma instância do prompt-sync
const prompt = promptSync();

// Exemplo de uso
const nome: string = prompt('Digite o seu nome: ');
console.log(`Olá, ${nome}!`);