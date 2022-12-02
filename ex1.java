import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Double valor, cotacao;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o valor em Dolar");
        valor = entrada.nextDouble();
        cotacao = (valor * 5.21);
        System.out.println("O valor digitado é: "+cotacao);


    }
}
