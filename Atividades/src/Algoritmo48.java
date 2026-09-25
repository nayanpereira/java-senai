public class Algoritmo48 {
    //considere a matriz quadrada 
    /* 
        20, 50, 80
        45, 60, 90
        45, 67, 89
        
    */
   // Faça um algoritmo que mostre os valores da diagonal prencipal 
    public void main() {
        int[][] matriz = {
            {20, 50, 80},
            {45, 60, 90},
            {45, 67, 89}
        };

        IO.println("Valores da diagonal principal:");
        
        // matriz.length 3 , matriz de 3 linhas
        for (int i = 0; i < matriz.length; i++) {
            IO.println(matriz[i][i]);
        }
    }
}