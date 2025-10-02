import java.util.Locale;
import java.util.Scanner;

public class Atv1One {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US); // Garante o uso do ponto como separador decimal
        Scanner sc = new Scanner(System.in);

        // Entrada dos dados
        System.out.print("Digite a largura do terreno: ");
        double largura = sc.nextDouble();

        System.out.print("Digite o comprimento do terreno: ");
        double comprimento = sc.nextDouble();

        System.out.print("Digite o valor do metro quadrado: ");
        double valorMetroQuadrado = sc.nextDouble();

        // Cálculos
        double area = largura * comprimento;
        double preco = area * valorMetroQuadrado;

        // Saída formatada
        System.out.printf("Área do terreno = %.2f metros quadrados%n", area);
        System.out.printf("Preço do terreno = R$ %.2f%n", preco);

        sc.close();
    }
}
