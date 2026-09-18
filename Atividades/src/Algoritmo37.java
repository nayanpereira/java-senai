public class Algoritmo37 {
    void main() {
        /* Exemplo didático 
        - Herança -  "CLASSE ABSTRATA: Não pode usar 'new Funcionario()'. Serve só de base (Herança)." usa o extend para herdar
        - suprer() 
        - Redefinição do construtor
        - Polimofismo
        - Sobrescrita (override) POLIMORFISMO -Substitui a regra abstrata do método(geralmente sem corpo) do pai pela regra real do objeto herdado. @Override
        - Sobrecarga (Overload) -- Repete o nome do método mas muda a assinatura 
        */


        Cachorro c = new Cachorro("Rex", "Au Au.mp3");
        IO.println("\nNome:" + c.getNome());
        c.comer();
        c.tocarSom();

        Gato g = new Gato("Guliano"," miau.mp3");
        IO.println("\nNome: " +g.getNome());
        g.comer();
        g.tocarSom();
        

    }
    
}
