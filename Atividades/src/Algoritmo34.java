public class Algoritmo34 {
    //Encapsulamento
    // public - private - protected - package
    // public - todo mundo acessa
    // private - somente a classe pode acessar
    // protected - apenas as classes autorizadas
    // package - apenas no pacote 

    private int primeiroNumero; //atributo
    private int segundoNumero; //atributo 

    // Getter para ler o valor 
    // método getter para ler a variável privada
    public int getPrimeiroNumero(){
        return primeiroNumero;
    }
    
    // Setter para alterar o valor 
    // método setter para alterar a variável privada
    public void setPrimeiroNumero(int primeiroNumero){
        this.primeiroNumero = primeiroNumero; 

    }

    // Getter para ler o valor 
    // método getter para ler a variável privada
    public int getSegundoNumero(){
        return segundoNumero;
    }

    // Setter para alterar o valor 
    // método setter para alterar a variável privada
    public void setSegundoNumero(int segundoNumero){
        this.primeiroNumero = segundoNumero;

    }

    
}
