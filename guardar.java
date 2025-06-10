import java.util.Scanner;

public class guardar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] nomes = new String[5];

        System.out.println("Escreva os nomes aqui: ");

        // Lê os nomes e guarda no array
        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Digite o nome da posição " + i + ": ");
            nomes[i] = input.nextLine();
        }

        System.out.println("\nNomes digitados:");
        // Mostra os nomes armazenados
        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Nome na posição " + i + ": " + nomes[i]);
        }

        input.close();
    }
}
