import java.util.Scanner;
public class temp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a temperatura para a conversão: ");
        double celsius = scanner.nextDouble();

        double fahrenheit = (celsius * 9/5) + 32;
        System.out.println("Temperatura em fahrenheit: " + fahrenheit);
        scanner.close();
    }
}