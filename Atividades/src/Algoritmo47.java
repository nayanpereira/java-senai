public class Algoritmo47 {

    // faça um vetor que armazene 10 valores inteiros
    // IO.println() IO.readln();
    // imprima a média e soma valores

    public void main(String[] args) {
        int[] vetor = new int[10];
        int soma = 0;

        for (int i = 0; i < 10; i++) {
            IO.println("Digite o valor " + (i + 1) + ":");
            // Assumindo que IO.readln() retorna String. 
            // Caso retorne int diretamente, use apenas vetor[i] = IO.readln();
            vetor[i] = Integer.parseInt(IO.readln()); 
            soma += vetor[i];
        }

        double media = soma / 10.0;

        IO.println("Soma: " + soma);
        IO.println("Média: " + media);
    }
}
