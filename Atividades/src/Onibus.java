public class Onibus {
    
    private String placa;
    private static int cont = 0;

    public Onibus(String placa) {
        this.placa = placa;
        cont++;
    }

    public static int getCont() {
        return cont;
    }

    public double calcularTarifa() {
        return 4.50; // Altere para o valor desejado
    }
}