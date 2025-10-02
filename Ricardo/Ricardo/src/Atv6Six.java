import java.util.Locale;
import java.util.Scanner;

public class Atv6Six {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor do raio: ");
        double raio = sc.nextDouble();

        double area = Math.PI * raio * raio;

        System.out.printf("Área do círculo = %.3f%n", area);

        sc.close();
    }
}

