package listaUm;

public class Exercicio5 {
    public static void main(String[] args) {

        double item1 = 27.90;
        double item2 = 9.80;
        double item3 = 8.50;

        double compra = item1 + item2 + item3;
        double mediaProdutos = compra / 3;

        System.out.println("Total: R$ " + compra);
        System.out.println("Média: R$ " + mediaProdutos);

    }
}