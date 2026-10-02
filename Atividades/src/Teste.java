public class Teste {
    
    public static void main(String[] args) {
        String nomes = "maria";

        nomes += "_jose";
        nomes += "_luan";
        nomes += "_nayan";
        nomes += "_carlos";
        // a cada concatenação o objeto string anterior e largado na memória e um novo e concatenado com o anterior
        System.out.println(nomes);

    }
}
