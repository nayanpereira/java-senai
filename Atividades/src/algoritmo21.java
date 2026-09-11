// import java.util.List;
/* Considere uma lista de um vetor de 10 números:
45, 67, 89, 34, 23, 56 , 78, 98,45, 34

Agora, crie um for que percorra esses números e dentro do for uma lógica que possa 
somar esses valores e calcular a média no final. */   
public class algoritmo21 {
    public void main() {
        int[] numeros = {45, 67, 89, 34, 23, 56, 78, 98, 45, 34};
        int soma = 0;

        // for (int numero : numeros) {
        //     soma += numero;
        // }
        for (int i = 0; i < numeros.length; i++) {
            // numeros.length  < 10 vai rodar até 9 
        soma = soma + numeros[i];  // 0 + numero[0] "45" = 45 -> 45 + numeros[1]"67" = 112 ... 535 + numeros[9]"34" = 535 i++ numeros[10] então vai parar 
        }

        double media = (double) soma / numeros.length;

        System.out.println("Soma total: " + soma);
        System.out.println("Média: " + media);
        
    }



    
}
