import java.util.Locale;
import java.util.Scanner;

public class Atv10Ten {
    
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a duração em segundos: ");
        int totalSegundos = sc.nextInt();

        int horas = totalSegundos / 3600;
        int resto = totalSegundos - horas * 3600;

        int minutos = resto / 60;
        int segundos = resto - minutos * 60;

        System.out.printf(" %02d:%02d:%02d ", horas, minutos, segundos);

        sc.close();
    }    
}

