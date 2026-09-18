public abstract class Animal {
    // Atributos
    private String nome;
    private String arquivoSom;

    //Construtor

    public Animal( String nome, String arquivoSom) {
        this.nome = nome;
        this.arquivoSom = arquivoSom;
    }

    //Métodos de acesso e modificação
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getArquivoSom() {
        return arquivoSom;
    }

    public void setArquivoSom(String arquivoSom) {
        this.arquivoSom = arquivoSom;
    }
    
    // Contratos -- Asssinatura
    // Método abstrato (sem corpo)  Método abstrato só pode ter em classe abstrata
    // todas as classes que herdar dessa classe vai ter que comer e tocamSom, vão ter que criar um método por cima criando regras sobrescrevendo ela
    // Obriga as classes filhas a criarem a métodos sobrescrevendo e criando suas próprias regras e ações
    // Assinatura
    public abstract void comer();

    public abstract void tocarSom();
    
}
