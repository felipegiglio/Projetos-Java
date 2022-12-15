
package Projetos_de_apredizagem;

import java.util.Scanner;

public class uso_do_if{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int notaFinal;
        int n1=10;
        int n2=5;
        notaFinal = ((n1 + n2) / 2);
        if(notaFinal>=7){
            System.out.println("Aprovado");
        }else{
            System.out.println("Reprovado");
        }
    }
}
