public class AlgoritmoQuatro {
// 360 algoritmos
    public void main(){
        // entre com um número inteiro e mostre se o número é positivo, negativo ou nulo
        int n = Integer.parseInt(IO.readln("Entre com um número: "));
        if( n > 0){
            IO.println("O número é positivo!");
        }else if( n < 0){
            IO.println("O número é negativo!");
        }else{
            IO.println(" O número é neutro!");
        }

        // Operador ternário
        int a = 10;
        String resultado = (a>10) ? "Maior que 10" : "menor ou igual a 10";
        IO.println(resultado);

        // estrutura de seleção multipla
        int numAula = Integer.parseInt(IO.readln("Entre com um número de 1 a 7: "));
        switch (numAula) {
            case 1:
                IO.println("Segunda-Feira");
                break;
            case 2:
                IO.println("Terça-feira");
                break;
            case 3:
                IO.println("Quarta-feira");
                break;
            case 4:
                IO.println("Quinta-feira");
                break;
            case 5:
                IO.println("Sexta-feira");
                break;
            case 6:
                IO.println("Sábado");
                break;
            case 7:
                IO.println("Domingo");
                break;
            default:
                IO.println("Número Invalido");
                
        }
    }
    
}
