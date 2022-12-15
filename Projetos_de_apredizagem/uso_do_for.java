package Projetos_de_apredizagem;

import java.util.Scanner;

public class uso_do_for {
    public static void main(String[] args) {
      Scanner s =new Scanner(System.in);
        //uso do FOr
        int cont,i;
        System.out.println("Digite o valor de cont: ");
        cont=s.nextInt();
        System.out.println(cont);
        for(i=cont; i>=5; i++){
            System.out.println(i);
        }
    }
}
