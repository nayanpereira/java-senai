public class VeiculoCarro extends Veiculo {
    //Atributos 
    private int numPortas;
    
    public VeiculoCarro() {
        super();
    }

    public VeiculoCarro(String placa, int velocidadeMax, String tipoCombustivel, String cor, int numPortas) {
        super(placa, velocidadeMax, tipoCombustivel, cor);
        this.numPortas = numPortas;
    }

    public int getNumPortas() {
        return numPortas;
    }

    public void setNumPortas(int numPortas) {
        this.numPortas = numPortas;
    }

    @Override
    public void mover() {
        IO.println("O carro se moveu");
        
    }


    
    
    
    
    
}
