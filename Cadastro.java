import java.util.Scanner;

public class Cadastro {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nome = "";
        int idade = 0;
        boolean cadastro = false;

        int escolha;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1 - Cadastrar usuário");
            System.out.println("2 - Mostrar dados");
            System.out.println("3 - Verificar se é maior de idade");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");
            escolha = input.nextInt();
            input.nextLine(); // limpar o buffer

            switch (escolha) {
                case 1:
                    System.out.print("Digite o nome: ");
                    nome = input.nextLine();

                    System.out.print("Digite a idade: ");
                    idade = input.nextInt();

                    cadastro = true;
                    System.out.println("Cadastro realizado com sucesso!");
                    break;

                case 2:
                    if (cadastro) {
                        System.out.println("Seus dados são: " + nome + ", " + idade + " anos.");
                    } else {
                        System.out.println("Nenhum cadastro encontrado. Por favor, cadastre-se primeiro.");
                    }
                    break;

                case 3:
                    if (cadastro) {
                        if (idade >= 18) {
                            System.out.println("Você é maior de idade.");
                        } else {
                            System.out.println("Você é menor de idade.");
                        }
                    } else {
                        System.out.println("Nenhum cadastro encontrado. Por favor, cadastre-se primeiro.");
                    }
                    break;

                case 4:
                    System.out.println("Saindo... Programa encerrado.");
                    break;

                default:
                    System.out.println("Esse número é inválido, escolha outro.");
            }

        } while (escolha != 4);

        input.close();
    }
}
