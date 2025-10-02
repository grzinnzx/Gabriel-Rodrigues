import java.util.Locale;
import java.util.Scanner;

public class Atv2Two {
    public static void main(String[] args) {

    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.print("Digite a base do retangulo: ");
        double base = sc.nextDouble();

    System.out.print("Digite a altura de um retangulo: ");
        double altura = sc.nextDouble();

    double area = base * altura;
    double perimetro = base + base + altura + altura;
    double diagonal = (base * base) + (altura * altura);
    double h = Math.sqrt(diagonal);

    System.out.printf("Área do retangulo = %.4f  %n", area);
    System.out.printf("Perimetro do retangulo = R$ %.4f %n", perimetro);
    System.out.printf("Diagonal do retangulo = %.4f ",  h);

    sc.close();
    }

}
