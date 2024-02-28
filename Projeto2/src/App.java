import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        List<Professor> professores = new ArrayList<>();
        int opcao = 0;
        do {
            System.out.println("1 - Cadastrar professor");
            System.out.println("2 - Listar todos os professores cadastrados");
            System.out.println("3 - Exibir a classificação de um professor pelo nome");
            System.out.println("4 - Encerrar programa");
            opcao = input.nextInt();
            input.nextLine(); // Consome a quebra de linha

            switch (opcao) {
                case 1:
                    System.out.println("Nome do professor?");
                    String nome = input.nextLine();
                    System.out.println("Quantos anos de experiencia ele tem?");
                    int experiencia = input.nextInt();
                    Professor p = new Professor(nome, experiencia);
                    professores.add(p);
                    break;

                case 2:

                        for (Professor professor : professores) {
                            System.out.println(professor.toString());
                        }
                    break;

                case 3:
                    System.out.println("Escreva o nome do professor: ");
                    String professoraserorcurado = input.nextLine();
                    for (Professor professor : professores) {
                        if (professor.getNome().equals(professoraserorcurado)) {
                            System.out.println("A classificação do professor é: " + professor.classifica());
                            break;
                        }
                    }

                case 4:
                    System.out.println("Encerrando programa...");
                    break;
                }

        } while (opcao != 4);

        input.close();
    }
}
