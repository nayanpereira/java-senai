public class Algoritmo17 {
    // Crie um algoritmo que mostre os números pares de 0 a 200. Use Do While
    public void main() {
        int i = 1;
        do { 
            if(i % 2 == 0) {
                System.out.println(i);  
            }
            i++;
        } while ( i <= 200);
    }
    
}
