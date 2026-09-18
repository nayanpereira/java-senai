public class Cachorro extends Animal {
    // no processo de herança o construtor do pai não é herdado, você precisar criar de novo mo filho
    
    public Cachorro(String nome, String arquivoSom) {
        super(nome, arquivoSom);
    }

    @Override
    public void comer() {
        IO.println("Ração camil para cães");
    }

    @Override
    public void tocarSom() {
        IO.println("tocando au auau.mp3" );
    }
    
}
