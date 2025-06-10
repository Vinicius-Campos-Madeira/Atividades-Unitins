import java.util.Scanner;
public class vini {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            System.out.println("Digite seu nome: ");
            String nome = input.nextLine();

            System.out.println("Digite a sua idade: ");
            int idade = input.nextInt();
            input.nextLine();

            System.out.println("Digite a sua altura (use vírgula ou ponto): ");
            String alturaStr = input.nextLine().replace(",", ".");
            double altura = Double.parseDouble(alturaStr);

            System.out.println("Olá, "+nome+"! você tem "+idade+" anos e mede "+altura+" metros.");

            if (idade >= 18){
                System.out.println("Você é maior de idade");
            }
            else {
                System.out.println("Você é menor de idade");
            }     

        input.close();
    }

}