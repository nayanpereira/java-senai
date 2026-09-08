public class Principal {
    public void main() {
        // IO e um recurso de entrada e saída para mostrar dados, simplificando o:
        //  public static void main(String[] var0) {
        //     System.out.println("Hello World");
        //  }
        // print imprime sem quebrar linha, println imprime quebrando linha 

        // Tipo referência (objeto)
        IO.println("Loja do joaquim");
        String nomeProduto = IO.readln("Digite o nome do produto: ");
        // assim da erro: int qtde = IO.readln("Digite a quantidade: ");

        //tipo primitivo (valor)
        int qtde = Integer.parseInt(IO.readln("Digite a quantidade: "));


        // tipo primitivo (valor real) - float (2x float = double)
        // tipo primitivo ------------ tipo de referência (Wrappers)
        
        double preco = Double.parseDouble(IO.readln("Digite o preço: "));

        double valorTotal = qtde * preco;  // operador aritmético 
        //IO.println("O valor digitado foi: " +nomeProduto +qtde +preco);
        //IO.println(String.format("O valor digitado foi: %s %d %.2f", nomeProduto, qtde, preco));
        //IO.println(String.format("O valor digitado foi: Produto: %s, Quantidade: %d, Preço: %.2f", nomeProduto, qtde, preco));
        IO.println("O valor digitado foi: Produto: " + nomeProduto + ", Quantidade: " + qtde + ", Preço: " + preco);
        
        /* 
            Operadores aritmético: + - * / % 
            Operadores relacionais: == !n > < >= <= 
            opradores lógicos: 
                && (E) "As duas condições devem ser verdadeiras para acontecer/ser verdadeira"
                || (OU) ! (não)

        */



        String fornecedor = IO.readln("digite o nome do fornecedor: ");
        String telefone = IO.readln("digite o telefone do fornecedor: ");
        String email = IO.readln("digite o email do fornecedor: ");
        String observacao = IO.readln("digite a observação do fornecedor: ");
        boolean ativo = Boolean.parseBoolean(IO.readln("Fornecedor está ativo"));

        IO.println("Fornecedor: " + fornecedor);
        IO.println("Telefone do fornecedor: " + telefone);
        IO.println("Fornecedor: " + email);
        IO.println("Observação: " + observacao);
        IO.println("Fornecedor ativo: " + ativo);
        
        if (ativo == true){
            IO.println("Fornecedor ativo");
        }
        else{
            IO.println("Forncedor ativo");
        }

        String nomeCliente = IO.readln("Digite o nome do cliente: ");
        int qtdeEstrelas = Integer.parseInt(IO.readln("Quantas estrelas? "));
        if (qtdeEstrelas >=4){
            IO.println("Cliente VIP: " + nomeCliente);
        }
        else {
            IO.println("Cliente normal: " +nomeCliente);
        }
        

        // estudar boolean e lógica aristotelica 




    }

}