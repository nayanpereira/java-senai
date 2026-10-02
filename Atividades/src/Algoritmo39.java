import javax.swing.JOptionPane;

public class Algoritmo39 {
    /*
    Revisão: Classe abstrata, interfaces, polimorfismo
    Encapsulamento e Static

    Transporte
    Onibus
    Metro
    */
    public static void main(String[] args) {
        Onibus o1 = new Onibus("PCU 9338");
        Metro m1 = new Metro("RRR 5778");
        
        int op = 0;
        final String TITULO = "VIAÇÃO TRANSPORTES";
        int tipoMensagem = JOptionPane.WARNING_MESSAGE;
        int erroMensagem = JOptionPane.ERROR_MESSAGE;

        do {        
            String opcao = JOptionPane.showInputDialog(
                null,
                "Escolha qual tarifa você deseja consultar:\n1 - Ônibus \n2 - Metrô \n3 - Sair", 
                TITULO, 
                tipoMensagem
            );

            // Caso o usuário clique em 'Cancelar' ou feche a janela
            if (opcao == null) {
                op = 3;
                JOptionPane.showMessageDialog(null, "Até logo.", TITULO, tipoMensagem);
                break;
            }

            try {
                op = Integer.parseInt(opcao);

                if (op == 1) {
                    JOptionPane.showMessageDialog(null, "Tarifa: R$ " + o1.calcularTarifa(), TITULO, tipoMensagem);
                    JOptionPane.showMessageDialog(null, "Frota de " + Onibus.getCont() + " ônibus.", TITULO, tipoMensagem);
                } else if (op == 2) {
                    JOptionPane.showMessageDialog(null, "Tarifa: R$ " + m1.calcularTarifa(), TITULO, tipoMensagem);
                } else if (op == 3) {
                    JOptionPane.showMessageDialog(null, "Até logo.", TITULO, tipoMensagem);
                } else {
                    JOptionPane.showMessageDialog(null, "Opção Inválida!", TITULO, erroMensagem);
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor, digite um número válido!", TITULO, erroMensagem);
            }

        } while (op != 3);
    }
}