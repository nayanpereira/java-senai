/* O Banco SENATECH é um banco que auxilia ex-alunos que implementa e desenvolve Startups. 
A SENATECH quer que você desenvolva de forma simples um sistema que recebe a usuário e a senha 
(para teste considere usuario:senai senha:123). A lógica funciona assim: se ele errar três vezes você deve bloquear o 
cartão e pedir para ele procurar o gerente caso contrário abra uma janela perguntando : quando deseja simular de empréstimo.  
O empréstimo máximo é 20.000. Pergunte a quantidade de parcelas e mostre o valor das parcelas com juros de 1% ao mês. As parcelas podem ser 
divididas em até 10 meses. Mostre o valor total do financiamento, o valor financiado e a mensagem "Parabéns, seja bem vindo a família SENATECH.*/

// usuário senha - processamento fazer login se errar três vezes bloquear o cartão e mandar procurar o gerente, se passar oferecer emprestimo, perguntando quanto deseja simular,
// máximo do banco 20 mil, perguntar a quantidade de parcelas e mostre o valor das parcelar com juros de 1% ao mês. Até 10 parcelas , 10 meses para pagar, 
// no final mostrar o valor toral financiado e a mensagem parabéns  "Parabéns, seja bem vindo a família SENATECH

public class Algoritmo22 {
    public void main() {
        //Entrada

        // Atributos
        String usuario = "senai";
        String usuarioDigitado;
        int senha = 123;
        int senhaDigitada;
        int contador = 1;



        while(contador < 4){
            usuarioDigitado = (IO.readln("Digite o usuário: "));
            senhaDigitada = Integer.parseInt(IO.readln("Digite a senha: "));

            if (!usuario.equals(usuarioDigitado)){
                IO.println("Usuário incorreto: contador");
                contador += 1;
            }
            else if (senha != senhaDigitada) {
                IO.println("Senha incorreto: contador");
                contador += 1;
            }
            else {
                IO.println("Login realizado com sucesso: ");
                break;

            }
        }

        if (contador == 3) {
            IO.println("Login bloquado, procure o gerente: ");

        }else {
            IO.println("\n------------Emprestimo------------");
            //int valor = Integer.parseInt(IO.readln("quanto vai precisar de emprestimo? "));
            float valor = Float.parseFloat(IO.readln("Quanto vai precisar de emprestimo? "));
            int parcelas = Integer.parseInt(IO.readln("Pretende pagar em quantas parcelas? Limite de 10 parcelas: "));

            IO.println("\n------Condições de pagamento------");
            IO.println("Emprestido de R$: " + valor + " em " + parcelas + " parcelas");

            IO.println("\n----------------------------------");
            IO.println("Parabéns, seja bem vindo a família SENATECH ");            
            IO.println("Emprestimo de R$ " + valor + " Realizado" );
            IO.println("Em "+ parcelas + " parcelas de R$ " + (valor/parcelas));


        }



    }

    
}
