package listaUm;

public class Exercicio9 {
    public static void main(String[] args) {

        boolean ingresso = true;
        boolean documento = false;
        boolean acompanhante = true;

        // Os dois precisam ser verdadeiros
        System.out.println(ingresso && documento);

        // Basta um ser verdadeiro
        System.out.println(ingresso || documento);

        // Inverte o valor do documento
        System.out.println(!documento);

        // Precisa de ingresso e de documento ou acompanhante
        System.out.println(ingresso && (documento || acompanhante));

        // Inverte o resultado da expressão
        System.out.println(!(ingresso && documento));

    }
}