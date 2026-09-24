public abstract class Veiculo {
    /* A classe abstrata:
        - Ela não pode ser instânciada ( não pode ter um new Classe()) 
        - Ela é um alto nível de generalização
        - Ela possui métodos concretos e construtores 
        - Elá pode ter métodos abstratos
        - 
    */

    //atributos
    private String placa;
    private int velocidadeMax;
    private String tipoCombustivel;
    private String cor;

    // contrutor vázio
    public Veiculo() {
        super();
    }
    // contrutor cheio

    public Veiculo(String placa, int velocidadeMax, String tipoCombustivel, String cor) {
        this.placa = placa;
        this.velocidadeMax = velocidadeMax;
        this.tipoCombustivel = tipoCombustivel;
        this.cor = cor;
    }

    // Métos 
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getVelocidadeMax() {
        return velocidadeMax;
    }

    public void setVelocidadeMax(int velocidadeMax) {
        this.velocidadeMax = velocidadeMax;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    
    // método abstrato -É como se fosse um contrato, todos as classes com herança deve ter e assinar também 
    public abstract void mover();



    
}
