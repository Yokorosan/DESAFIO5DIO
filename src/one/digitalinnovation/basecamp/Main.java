package one.digitalinnovation.basecamp;
import java.io.IOException;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        //continue a solucao
        System.out.print("Insira o Valor de A: ");
        int A = leitor.nextInt();
        System.out.print("Insira o Valor de B: ");
        int B = leitor.nextInt();
        if (A % B == 0 ) {
            System.out.println("Sao Multiplos");
        } else if(B % A == 0 ) {
            System.out.println("São Multiplos");
        } else {
            System.out.println("Não São Multiplos");
        }
    }
}
