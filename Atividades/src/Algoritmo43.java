public class Algoritmo43 {
    public void main(){

        //vetor:

        double[] notas = {100,70,80,50,40};
        double maior = notas[0];
        IO.println(maior);

        for(int i = 1; i < notas.length; i++){
            if(notas[i] > maior){
                maior = notas[i];
            }
        }
        IO.println("Maior nota: " + maior);
        
    }

}
