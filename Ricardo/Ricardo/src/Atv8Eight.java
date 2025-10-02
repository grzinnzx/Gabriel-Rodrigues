import java.util.Locale;
import java.util.Scanner;

public class Atv8Eight {
    
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a distancia percorrida: ");
        double distancia = sc.nextDouble();

        System.out.print("Digite o combustivel gasto: ");
        Double gasosa = sc.nextDouble();


        double med = distancia / gasosa;

        System.out.printf("Consumo médio  %.3f", med);

        sc.close();
    }    
}
