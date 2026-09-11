public class Algoritmo7 {
    void main(){
        // Ler dois números inteiros e imprimir a soma. Antes do resultado, deverá aparecer a mensagem: Soma.
        int numero1 = Integer.parseInt(IO.readln("o primeiro número: "));
        int numero2 = Integer.parseInt(IO.readln("o segundo número: "));

        IO.println("\nSoma = " + (numero1 + numero2) );
    }
}
