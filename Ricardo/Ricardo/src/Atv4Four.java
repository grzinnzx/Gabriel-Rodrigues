import java.util.Locale;
import java.util.Scanner;

public class Atv4Four {
    
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        Double v1 = sc.nextDouble();

        System.out.print("Digite o segundo valor: ");
        Double v2 = sc.nextDouble();

        double soma = v1 + v2;

        System.out.printf("O resultado foi de: %.2f %n", soma);

        sc.close();
    }    
}
