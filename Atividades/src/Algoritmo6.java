public class Algoritmo6 {
    void main(){
        // Ler nome, endereço e telefone e imprimi-los.

        String nome = IO.readln("Digite o nome: ");
        String endereco = IO.readln("Digite o endereço: ");
        int telefone = Integer.parseInt(IO.readln("Digite o telefoe: "));
        
        IO.println("\nNome: " + nome);
        IO.println("Endereço: " + endereco);
        IO.println("Telefone: " + telefone);
    }
}
