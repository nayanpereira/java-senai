public class HoraDoze {
    public static void main(String[] args) {
        Professor prof1 = new Professor("Maria Eduarda", "01/01/2000", "Superior");
        System.out.println("Hello World");
        System.out.println(prof1.getNome());
        System.out.println(prof1.getDataNascimento());
        System.out.println(prof1.getEscolaridade());
    }
}