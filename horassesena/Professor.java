public class Professor {
    // variável é uma gaveta que guarda um valor na memória ram  //Pascal case para classe
    private String nome;
    private String escolaridade;
    private String dataNascimento;

    public Professor() {
        // construtor vazio
    }

    public Professor(String nome, String dataNascimento, String escolaridade) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.escolaridade = escolaridade;
    }
    public Professor(String nome, String escolaridade){
        this.nome = nome;
        this.escolaridade = escolaridade;
    }

    public Professor(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }


    public String getNome() {
                  // método camelCase "Sempre para métodos a segunda palavra e maiuscula"
        return nome;
    }

    public String getEscolaridade() {
        return escolaridade;

    }

    public String getDataNascimento() {
        return dataNascimento;
    }
    /*  Construtor é um recurso especial para criar o objeto, Serve para criar o objeto 
        Overload - Serve para passagem de valor I 
        Sobrecarga: a possibilidade de criar vários construtores com estruturas diferentes
    */
                
} 