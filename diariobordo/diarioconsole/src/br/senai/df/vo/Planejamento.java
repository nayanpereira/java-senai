package br.senai.df.vo;

public class Planejamento {
    //Atributos
    private String dia;
    private String conteudo;
    private int semana;

    //Gerar o construtor 
    public Planejamento() {
        
    }
    public Planejamento(String dia, String conteudo, int semana) {
        this.dia = dia;
        this.conteudo = conteudo;
        this.semana = semana;
    }
    //gerar os get e setter Métodos de visualização e modificação
    public String getDia() {
        return dia;
    }
    public void setDia(String dia) {
        this.dia = dia;
    }
    public String getConteudo() {
        return conteudo;
    }
    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }
    public int getSemana() {
        return semana;
    }
    public void setSemana(int semana) {
        this.semana = semana;
    }

   

}
