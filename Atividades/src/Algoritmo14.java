public class Algoritmo14 {
    public void main(){
        /*
        Considere um menu de  um joguinho. Esse menu deverá mostrar uma mensagem personalizada.
        Se 1 : " jogo iniciado"
        Se 2: " suas vidas estão acabando"
        Se 3: "Game Over!"
        Se qualquer número fora desses números então: "Número inválido".
        */

        IO.println("menu: ");
        IO.println("********************");
        IO.println("1 - Iniciar o jogo ");
        IO.println("2 - verificar as vidas ");
        IO.println("3 - finalizar o jogo ");
        IO.println("********************");

        int numero = Integer.parseInt(IO.readln("Digite um número para selecionar uma opção "));

        switch (numero) {
            case 1:
                IO.println("1 - jogo iniciado ");
                break;
            case 2:
                IO.println("2 - suas vidas estão acabando ");
                break;
            case 3:
                IO.println("3 - Game Over ");
                break;
            default:
                IO.println("Dgite uma opção válida");

        }
        

    }
    
}
