export function SomarNumerosAte100() {
  let soma:number = 0;
  let numeroo :number = 1;

  while (numeroo <= 100) {

    soma += numeroo;
    numeroo++;
  }

  console.log(`A soma dos números de 1 a 100 é ${soma}.`);
}