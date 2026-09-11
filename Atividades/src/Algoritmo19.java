import java.util.List;

public class Algoritmo19 {

    public void main() {
        List<String> usuarios = List.of("Ana", "Bruno", "Carla", "Diego");

        // lambda
        usuarios.forEach(n -> System.out.println(n));
    }
}