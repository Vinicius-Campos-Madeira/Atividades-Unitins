import java.util.Scanner;

public class FatorialComFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int n = scanner.nextInt();

        long fatorial = 1;

        for (int i = 1; i <= n; i++) {
            fatorial *= i;
        }

        System.out.println("Fatorial de " + n + " é: " + fatorial);

        scanner.close();
    }
}
