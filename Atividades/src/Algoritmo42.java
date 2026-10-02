import java.util.List;

public class Algoritmo42 {
    public void main(){

        //Primeira voz (Bruno): Interface (contrato)
        //Segunda voz (Marrone): Classe (implementa)
        //List<String> nomes = new ArrayList<>();

        List<String> linguagens = List.of("Rust", "Python", "GO", "JAVA", "C", "C++", "C#");
        for(String linguagem : linguagens){
            IO.println(linguagem);
        }


    }
}
