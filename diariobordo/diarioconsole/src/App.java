import br.senai.df.vo.Planejamento;
// import importou o pacote diretamente quando escreveu planejamento na criação do objeto

public class App {
    public static void main(String[] args) throws Exception {
        Planejamento p = new Planejamento("Terça-Feira", "Classe-Método-Construtor-Paramêtro", 4);
        IO.println("***Listando o planejamento***");
        IO.println("Semana " + p.getSemana());
        IO.println("Dia " + p.getDia());
        IO.println("Conteúdo " + p.getConteudo());

    }
}
