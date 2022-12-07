import java.util.Scanner;

public class estruturaif{
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        int hora;
        int x = 10;

        System.out.println("Quantas Horas");
        hora = sc.nextInt();

        if (x>=5) {
            System.out.println("Bom Dia");
        } else {
            System.out.println("Boa Noite");
        }
        sc.close();
    }
}