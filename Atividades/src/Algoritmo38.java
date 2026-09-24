import javax.swing.JOptionPane;

public class Algoritmo38 {
    /*
    OO Básica 
        Classe
        Objeto
        Métodos workers
        Construtores
        Get Set
    
    Avançado
        Herança
        Classe abstrata
        Encapsulamento
        Interfaces ** Nível mais alto de orientação a objetos 
        Comparativo
        Static
    
    
    */
    
    public void main() {

        VeiculoCarro c = new VeiculoCarro("ABC-123",299, "Gasolina", "Vermelho", 4);
        //Caixa de mensagens
        // JOptionPane.showMessageDialog(null, "Agência SenaiCar");
        // JOptionPane.showMessageDialog(null, c.getPlaca());
        // JOptionPane.showMessageDialog(null, c.getVelocidadeMax());
        // JOptionPane.showMessageDialog(null, c.getTipoCombustivel());
        // JOptionPane.showMessageDialog(null, c.getCor());
        // JOptionPane.showMessageDialog(null, c.getNumPortas());
        c.mover();

        VeiculoMoto m = new VeiculoMoto("DEF-456", 140, "Flex", "Vermelha", true);
        m.mover();
        m.revissaoProgramada();
    }
}
