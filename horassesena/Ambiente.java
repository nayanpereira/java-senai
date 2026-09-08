public class Ambiente {
    // Atributos: são as variáveis (gavetas) que guardam os dados específicos de cada objeto na memória RAM
    private String numero;
    private String tipo;

    // considerando os ambientes do senai
    // Sala, laboratório, oficina, auditório g, auditório p
    // Desafio, criar os construtores da classe ambiente e criar os métodos get 

    // Construtor Vazio: um recurso especial usado para criar o objeto sem passar valores iniciais
    public Ambiente() {
        // construtor vazio
    }

    // Construtor Completo (Exemplo de Sobrecarga/Overload): usado para criar o objeto já definindo todos os atributos
    public Ambiente(String numero, String tipo) {
        // A palavra-chave 'this' diferencia o atributo da classe do parâmetro recebido
        this.numero = numero;
        this.tipo = tipo;
    }

    // Construtor Alternativo (Sobrecarga/Overload): permite criar o objeto passando apenas o número
    public Ambiente(String numero) {
        this.numero = numero;
    }

    // Método Get (Getter): método em camelCase usado para permitir a leitura segura do atributo privado 'numero'
    public String getNumero() {
        return numero;
    }

    // Método Get (Getter): método em camelCase usado para permitir a leitura segura do atributo privado 'tipo'
    public String getTipo() {
        return tipo;
    }
}