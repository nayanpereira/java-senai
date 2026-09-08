void main() {
    IO.println("Quantos algoritmos você já venceu?");
    String resposta = IO.readln();
    int total = Integer.parseInt(resposta);
    IO.println("Só mais " + (360 - total) + " pela frente.");
}