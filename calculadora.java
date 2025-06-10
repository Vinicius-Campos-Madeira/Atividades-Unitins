import java.util.Scanner;
public class calculadora {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double  num1, num2, resultado;
        char operação;

        System.out.println("Digite o primeiro número: ");
        num1 = input.nextDouble(); 

        System.out.println("Digite a operação que deseja realizar (+, -, *, /): ");
        operação = input.next().charAt(0);
        
        System.out.println("Digite o segundo número: ");
        num2 = input.nextDouble();

          switch (operação) {
            case '+':
                resultado = num1 + num2;
                System.out.println("Resultado: " + resultado);
                break;
            case '-':
                resultado = num1 - num2;
                System.out.println("Resultado: " + resultado);
                break;
            case '*':
                resultado = num1 * num2;
                System.out.println("Resultado: " + resultado);
                break;
            case '/':
                if (num2 != 0) {
                    resultado = num1 / num2;
                    System.out.println("Resultado: " + resultado);
                } else {
                    System.out.println("Erro: Divisão por zero não é permitida.");
                }
                break;
            default:
                System.out.println("Operação inválida.");
        }
        
        input.close();
    }
}
