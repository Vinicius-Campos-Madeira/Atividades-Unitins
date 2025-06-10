import java.util.Scanner;

public class juros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o capital inicial (C): ");
        double capital = scanner.nextDouble();

        System.out.print("Informe a taxa de juros mensal (em %): ");
        double taxaPercentual = scanner.nextDouble();

        System.out.print("Informe o tempo em meses (t): ");
        int tempo = scanner.nextInt();

        double taxaDecimal = taxaPercentual / 100;
        double montante = capital * Math.pow(1 + taxaDecimal, tempo);

        System.out.printf("Montante final após %d meses: R$ %.2f\n", tempo, montante);

        scanner.close();
    }
}