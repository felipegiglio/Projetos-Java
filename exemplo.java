import java.util.Scanner;

public class exemplo {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double minutos, resultado, resul;
        System.out.println("Quantos minutos foi gasto");
        minutos = sc.nextInt();

        if (minutos<=100) {
            System.out.println("O valor esta dentro da franquia, o valor a ser pago é 50 Reais");
        } else {
            resultado = minutos * 2 - 200;
            resul = resultado + 50;
            System.out.println("O Valor a ser pago é: R$ " + resul + " Reias");
        }

       
    }
}
