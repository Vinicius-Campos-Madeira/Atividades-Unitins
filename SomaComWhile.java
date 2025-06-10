import java.util.Scanner;

public class SomaComWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de N: ");
        int n = scanner.nextInt();

        int i = 1;
        int soma = 0;

        while (i <= n) {
            soma += i;
            i++;
        }

        System.out.println("A soma dos números de 1 a " + n + " é: " + soma);

        scanner.close();
    }
}
