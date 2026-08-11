package listaUm;

public class Exercicio14 {
    public static void main(String[] args) {

        String funcionario = "João";
        double salarioBase = 2500;
        int tempoEmpresa = 6;

        double adicional = (tempoEmpresa >= 5) ? 500 : 0;

        double salarioTotal = salarioBase + adicional;

        System.out.println("Nome: " + funcionario);
        System.out.println("Salário: R$ " + salarioBase);
        System.out.println("Bônus: R$ " + adicional);
        System.out.println("Salário Final: R$ " + salarioTotal);

    }
}