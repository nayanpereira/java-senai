import java.util.List;

public class Algoritmo20 {
    /* Situação-Problema: Sistema de Confirmação de Cupons Promocionais Você está desenvolvendo o módulo de 
    finalização de compras para uma loja online. Antes de aplicar os cupons digitados pelos clientes, 
    o sistema precisa exibir no terminal cada código ativo cadastrado para validação de log. */
    public void main() {
        List<String> cupons = List.of("PROMO10", "DESCONTO20", "FRETEGRATIS", "PIXE");

        // lambda
        cupons.forEach(n -> System.out.println(n));
    }
}
