import java.util.Locale;
import java.util.Scanner;

public class Atv7Seven {
    
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome da funcionaria: ");
        String nome = sc.nextLine();

        System.out.print("Digite o valor por hora que recebe: ");
        Double valor = sc.nextDouble();

        System.out.print("Digite a quantidade de horas que trabalha: ");
        Double horas = sc.nextDouble();

        double salario = valor * horas;

        System.out.printf("%s recebe %.2f por hora %n", nome, salario);

        sc.close();
    }    
}
