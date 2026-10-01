public class Algoritmo50 {

    public static void main() {

    try{// tende - se deu certo
        int idade = Integer.parseInt(IO.readln("Qual a sua idade? "));
        //String resultado = (idade >= 18 )?

    }catch(NumberFormatException e ){
    //se deu esse erro
        IO.println(e.getMessage()+"Isso não é um número");
    }finally{
    // conclusão(Independe se deu errado)
    }
    
}

}