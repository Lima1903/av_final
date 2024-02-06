
import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura dos números
        System.out.println("Digite o primeiro número:");
        int num1 = scanner.nextInt();

        System.out.println("Digite o segundo número:");
        int num2 = scanner.nextInt();

        // Menu de opções
        System.out.println("Escolha a operação:");
        System.out.println("1. Multiplicação");
        System.out.println("2. Divisão");
        int opcao = scanner.nextInt();

        // Cálculo e exibição do resultado
        int resultado;
        switch (opcao) {
            case 1:
                resultado = num1 * num2;
                System.out.println("Resultado da multiplicação: " + resultado);
                break;
            case 2:
                if (num2 == 0) {
                    System.out.println("Divisão por zero não é permitida!");
                } else {
                    resultado = num1 / num2;
                    System.out.println("Resultado da divisão: " + resultado);
                }
                break;
            default:
                System.out.println("Opção inválida!");
        }
    }
}
