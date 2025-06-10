import java.util.Scanner;

public class triangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o lado A: ");
        double a = scanner.nextDouble();

        System.out.print("Digite o lado B: ");
        double b = scanner.nextDouble();

        System.out.print("Digite o lado C: ");
        double c = scanner.nextDouble();

        if (a + b > c && a + c > b && b + c > a) {
            if (a == b && b == c) {
                System.out.println("Triângulo Equilátero");
            } else if (a == b || a == c || b == c) {
                System.out.println("Triângulo Isósceles");
            } else {
                System.out.println("Triângulo Escaleno");
            }
        } else {
            System.out.println("Os valores não formam um triângulo.");
        }

        scanner.close();
    }
}