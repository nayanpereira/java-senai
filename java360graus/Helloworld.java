//Helloworldrld
void main(){
    // retorno vázio
    // main - método principal "Vai ser responsável por executar" no caso
    IO.println("Hello World!"); 

    Animal cachorro = new Animal ();
    cachorro.nome = "Maia";
    cachorro.raca = "Vira-lata";
    cachorro.cor = "Preto";
    IO.println("Nome:"+cachorro.nome);
    IO.println("Raça:"+cachorro.raca);
    IO.println("Cor:"+cachorro.cor);
    IO.println(cachorro.latir());
    cachorro.comer();
    cachorro.dormir();
    IO.println("******************");

    // Novo objeto 
    Animal cachorro2 = new Animal ();
    cachorro2.nome = "Rodolfo";
    cachorro2.raca = "Golden Retriver";
    cachorro2.cor = "Caramelo";
    IO.println("Nome:"+cachorro2.nome);
    IO.println("Raça:"+cachorro2.raca);
    IO.println("Cor:"+cachorro2.cor);
    IO.println(cachorro2.latir());
    cachorro2.comer();
    cachorro2.dormir();
    IO.println("*******************");

    // Outro objeto
    Animal cachorro3 = new Animal();
    cachorro3.nome = "Fera";
    cachorro3.raca = "Pitbull";
    cachorro3.cor = "Cinza";
    IO.println("Nome"+cachorro3.nome);
    IO.println("Raça:"+cachorro3.raca);
    IO.println("Cor:"+cachorro3.cor);
    IO.println(cachorro3.latir());
    cachorro3.comer();
    cachorro3.dormir();
    IO.println("**********************");


}
//Variável que guarda apenas valor; é um tipo primitivo
// variável que pode guarda endereço na memória e do tipo de referência

// javac helloworld.java
// java helloworld