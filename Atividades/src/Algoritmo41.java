public class Algoritmo41 {

    public void main(){
        //matrizes
        //Possui 2 dimensões - bidimensional(2D) - precisa de 2 colchetes
        //2 linhas e 2 colunas = 2x2 (matriz quadrada - mesma quantidade de linhas e colunas)
        int[][] matriz = {
            {21, 25},
            {33, 35}
        };

        /*
        i: identifica o número da linha (horizontal)
        j: identifica o número da linha (vertical)
        */

        int soma=0;
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                soma += matriz[i][j];
                //+= significa soma = soma + valor
            }
        }
        
        IO.println("JP tem "+ matriz[0][0] + " anos.");
        IO.println("Elias tem "+ matriz[0][1] + " anos.");
        IO.println("Daniel tem "+ matriz[1][0] + " anos.");
        IO.println("Cássio tem "+ matriz[1][1] + " anos.");
        IO.println("Os quatro alunos juntos somam " + soma + " anos.");

        //Ganhei 2 bis
    }

}
