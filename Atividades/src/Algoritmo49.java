import java.util.ArrayList;
import java.util.List;

    /* crie um algoritmo que pergunte ?
    IO.println("Qual laboratório quer adicionar")
    leia o laboratório do usuário
    o laboratório é String tipo : F03, F05, F07.

    Crie um loop 1-adicionar 2-sair
    mostre no final a quantidade de laboratório adicionados
    mostre todos os laboratórios
    List<String> laboratorios = ArrayLista<>();
    
    
    */

public class Algoritmo49 {
    public static void main() {
        List<String> laboratorios = new ArrayList<>();
        int opcao = 1;

        while (opcao == 1) {
            IO.println("Qual laboratório quer adicionar?");
            String lab = IO.readln();
            laboratorios.add(lab);

            IO.println("1-adicionar 2-sair");
            // Supondo que IO.readln() retorne uma String, convertemos para int
            opcao = Integer.parseInt(IO.readln());
        }

        IO.println("Quantidade de laboratórios adicionados: " + laboratorios.size());
        
        IO.println("Laboratórios adicionados:");
        for (String laboratorio : laboratorios) {
            IO.println(laboratorio);
        }
    }
}