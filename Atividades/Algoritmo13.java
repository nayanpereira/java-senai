public class Algoritmo13 {
    public void main(){

        /*
        Crie um algoritmo usando if , else if encadeado. O algoritmo inicialmente vai pedir para 
        o usuário digitar um número. Depois ele vai pedir para digitar um segundo número. Sua missão é 
        criar uma lógica no algoritmo que identifique qual é o número maior e menor. Ao final mostre 
        que é o maior e o menor.
        
        */
        float numero1 = Float.parseFloat(IO.readln("Digite um número real: "));
        float numero2 = Float.parseFloat(IO.readln("Digite um segundo número real: "));

        if(numero1 > numero2) {
            IO.println("O número " +numero1+ "é maior que " +numero2);
        }else if(numero1 < numero2) {
            IO.println("O número " +numero2+ " é maior que " +numero1);
        }else {
            IO.println("Os números são iguais");
        }


    }
    
}
