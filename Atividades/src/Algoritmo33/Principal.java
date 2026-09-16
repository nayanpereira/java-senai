package Algoritmo33;

import javax.swing.JOptionPane;

public class Principal {
    void main() {
        String nome3 = JOptionPane.showInputDialog(getClass())
        // JOpionPane.showMessageDialog(null, objeto)
        //Classe objeto = new Construtor();
        Algoritmo33 alg33 = new Algoritmo33();
        alg33.inserirChave(5);
        IO.println(alg33.mostrar);
    }
    
}
