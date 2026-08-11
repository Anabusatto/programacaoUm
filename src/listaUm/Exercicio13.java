package listaUm;

public class Exercicio13 {
    public static void main(String[] args) {

        double clima = 28;

        String descricao = (clima > 25) ? "Dia quente" : "Dia agradável";

        System.out.println("Temperatura: " + clima + "°C");
        System.out.println("Situação: " + descricao);

    }
}