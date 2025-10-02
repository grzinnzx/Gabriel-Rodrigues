import java.util.Locale;
import java.util.Scanner;

public class Atv3Three {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Primeira pessoa
        System.out.println("Dados da primeira pessoa:");
        System.out.print("Digite o nome da primeira pessoa: ");
        String nome1 = sc.nextLine();

        System.out.print("Digite a idade da primeira pessoa: ");
        double idade1 = sc.nextDouble();
        sc.nextLine(); // Limpar o \n do buffer

        // Segunda pessoa
        System.out.println("Dados da segunda pessoa:");
        System.out.print("Digite o nome da segunda pessoa: ");
        String nome2 = sc.nextLine();

        System.out.print("Digite a idade da segunda pessoa: ");
        double idade2 = sc.nextDouble();

        // Cálculo da média
        double media = (idade1 + idade2) / 2;

        // Saída formatada
        System.out.printf("A idade média de %s e %s é de: %.0f anos%n", nome1, nome2, media);

        sc.close();
    }
}