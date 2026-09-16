public class App {
    public void main() {
        
        String nomeDigitado = IO.readln("Por favor, digite o seu nome: ");
        
        // Instancia a classe EcoFinal criando um objeto meuEco
        EcoFinal meuEco = new EcoFinal();
        
        IO.println("\n--- Iniciando o Eco ---");
        
        // Chamar os dois métodos
        
        //Chama o método void passando a variável nome digítado
        //objeto       metodo()
        meuEco.despertar(nomeDigitado);
        
        //Chama o segundo método com return, guarda o valor na variável "Segredo" e imprime
        String segredo = meuEco.revelarSegredo();
        IO.println(segredo);
    }
}