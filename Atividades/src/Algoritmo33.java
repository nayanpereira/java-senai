public class Algoritmo33 {
    //atributo
    private int chave;
    // Aqui existe um construtor oculto 
    //5 
    public void inserirChave(int c){
        chave = c;
    }
    public int retornarChave(){
        return chave;
    }
    public String  abrirPorta() {
        String resposta;
        if(chave == 7 ){
            resposta = "A porta verde-água se abre";
        }else{
            resposta = "A porta de cobre se abre";
        }
        return resposta;
    }
}
