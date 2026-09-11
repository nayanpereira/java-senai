public class Algoritmo11 {
 // Crie um algoritmo que leia o seu nome e verifique que realmente é o seu nome.
    public void main() {
        String nome = "Nayan";

        String resposta = IO.readln("Digite seu nome: ");

        if(nome.equalsIgnoreCase(resposta)){
            IO.println(" Seu nome está correto " + nome );
        }else {
            IO.println(" O seu nome está errado " );
        }


    }
    
}
