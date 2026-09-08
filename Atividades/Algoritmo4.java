// PrimeiroSeloDaEscolha
public class Algoritmo4 {
    public static void main(String[] args) {
        int diaDaSemana = 3;
        String nomeDoDia;
        switch (diaDaSemana) {
            case 1:
            nomeDoDia = "Segunda-feira";
            break;
            case 2:
            nomeDoDia = "Terça-feira";
            break;
            case 3:
            nomeDoDia = "Quarta-feira";
            break;
            default:
            nomeDoDia = "Dia inválido";
        }
        System.out.println(nomeDoDia); // Quarta-feira
        IO.println("***********************\n");
    

        switch (diaDaSemana) {
            case 3:
                System.out.println("Segunda-feira");
                break;
            case 4:
                System.out.println("Terça-feira");
                break;
        }
        // Se diaDaSemana for 1, o programa imprime as DUAS linhas!
        IO.println("***********************\n");

        switch (diaDaSemana) {
            case 1 -> System.out.println("Segunda-feira");
            case 2 -> System.out.println("Terça-feira");
            case 3 -> System.out.println("Quarta-feira");
            default -> System.out.println("Dia inválido");
        }


    }        
}