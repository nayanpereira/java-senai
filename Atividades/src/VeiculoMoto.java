public class VeiculoMoto extends Veiculo implements IManutecao, IMeusImpostos{
    // Atributos
    private Boolean temBau;

    //Construtor vázio
    public VeiculoMoto() {
    }
    //Construtor
    public VeiculoMoto(Boolean temBau) {
        this.temBau = temBau;
    }
    //Construtor
    public VeiculoMoto(String placa, int velocidadeMax, String tipoCombustivel, String cor, Boolean temBau) {
        super(placa, velocidadeMax, tipoCombustivel, cor);
        this.temBau = temBau;
    }
    //métodos
    public Boolean getTemBau() {
        return temBau;
    }

    public void setTemBau(Boolean temBau) {
        this.temBau = temBau;
    }
    // Método da subrescrita
    @Override
    public void mover() {
        IO.println("A moto se moveu");
    }

    
    @Override
    public void adicionar() {
        IO.println("Impostos adiconados");
    }
    @Override
    public void revissaoProgramada() {
        IO.println("Faça a revisão com a taxa de: " + IManutecao.TAXA);
        
    }
    
}
