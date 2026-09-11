public class Algoritmo10 {
    void main(){
        // Entrar com dois numeros reais e imprimir a media aritmética com a mensagem media antes do resultado
        float numero1 = Float.parseFloat(IO.readln("o primeiro número: "));
        float numero2 = Float.parseFloat(IO.readln("o primeiro número: "));

        IO.println("\nA média aritmética é = " + (numero1 + numero2)/2 );
    }
}