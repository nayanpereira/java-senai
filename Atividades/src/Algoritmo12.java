public class Algoritmo12 {
    public void main(){
        // Crie um algoritmo que leia um número e mostre se esse número é par ou impar...
        int numero = Integer.parseInt(IO.readln("Digite um número inteiro para saber se é par ou impar: "));

        if(numero % 2 == 0){
            IO.println("O número " + numero + " é par: ");
        }else {
            IO.println("O número " +numero+ " é impar");
        }
    }
    
}
