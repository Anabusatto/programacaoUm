package listaUm;

public class Exercicio11 {
    public static void main(String[] args) {

        String estudante = "Manuel Campos";
        int notaFinal = 6;
        int presenca = 75;

        String situacao = (notaFinal >= 7 && presenca >= 75) ? "Aprovado" : "Reprovado";

        System.out.println(estudante);
        System.out.println(situacao);

    }
}