import java.util.Scanner;

public class switchcase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int resultado;
        resultado = sc.nextInt();

        switch(resultado) {
            case 1:
            System.out.println("Domingo");
            break;
            case 2:
            System.out.println("Segunda");
            break;
            case 3:
            System.out.println("Terça");
            break;
            case 4:
            System.out.println("Quarta");
            break;
            case 5:
            System.out.println("Quinta");
            break;
            case 6: 
            System.out.println("Sexta");
            break;
            case 7:
            System.out.println("Sabado");
            break;
            default: 
                System.out.println("Valor Invalido");
                break;
        }
        sc.close();
    }
}
