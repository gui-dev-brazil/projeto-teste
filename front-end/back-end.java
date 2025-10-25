import java.util.Scanner;
public class Calculadora {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int n1 = scan.nextInt();
        System.out.print("Digite o segundo número: ");
        int n2 = scan.nextInt();       

        System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));
        System.out.println(n1 + " - " + n2 + " = " + (n1 - n2));
        System.out.println(n1 + " / " + n2 + " = " + ((double )n1 / n2));
        System.out.println(n1 + " x " + n2 + " = " + (n1 * n2));        

        scan.close();

