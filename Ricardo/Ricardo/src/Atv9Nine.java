import java.util.Locale;
import java.util.Scanner;

public class Atv9Nine {
    
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a medida A: ");
        Double A = sc.nextDouble();

        System.out.print("Digite a medida B: ");
        Double B = sc.nextDouble();

        System.out.print("Digite a medida C: ");
        Double C = sc.nextDouble();

        double quadrado = A * A;
        double triangulo = (A * B) / 2;
        double trapezio = ((A + B) / 2) * C;

        System.out.printf("Area do quadrado: %.2f %n", quadrado);
        System.out.printf("Area do triangulo: %.2f %n", triangulo);
        System.out.printf("Area do trapezio: %.2f", trapezio);

        sc.close();
    }    
}

