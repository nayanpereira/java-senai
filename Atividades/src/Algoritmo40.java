public class Algoritmo40 {
    void main(){

        int[] notas = {7, 9, 5, 10, 6};
        //Variáveis de valor e de referência
        int maior = notas[0];
        IO.println(maior);

        //e se fosse uma lista de 3 milhões de números?

        //útil para Big Data
        for(int i = 1; i < notas.length; i++){
            if(notas[i] > maior){
                maior = notas[i];
            }
        }
        IO.println("Maior nota: " + maior);

        

    }
}
