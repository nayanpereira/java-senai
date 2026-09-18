public class Gato extends Animal{

    public Gato(String nome, String arquivoSom) {
        super(nome, arquivoSom);
    }

    @Override
    public void comer() {
        IO.println("Ração camil para gatos");
    }

    @Override
    public void tocarSom() {
        IO.println("tocando " +super.getArquivoSom());
    }
    
    
}
