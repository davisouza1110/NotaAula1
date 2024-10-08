import java.util.Scanner;



//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Aluno aluno = new Aluno();

        System.out.println("Digite o nome do aluno: ");
        String nome = scanner.nextLine();

        System.out.println("Digite a nota da primeira prova: ");
        double nota1 = scanner.nextDouble();

        System.out.println("Digite a nota da segunda prova: ");
        double nota2 = scanner.nextDouble();

        System.out.println("Digite a nota da terceira prova: ");
        double nota3 = scanner.nextDouble();

        double media = (nota1 + nota2 + nota3)/3;

        String situacao;
        if (media >= 7){
            situacao = "Aprovado";
        } else if (media < 5) {
            situacao = "Reprovado";
        } else {
            situacao = "Na final";

        }

        System.out.printf("O aluno %s tem média %.2f e está %s.%n", nome, media, situacao );

        scanner.close();


    }
}