import java.util.InputMismatchException;
import java.util.Scanner;

class GetInput {

    public static void main (String args[]){

        int num1 = 7;
        int num2 = 4;

        Scanner in = new Scanner(System.in);
        try{
            System.out.println("Informe o primeiro número: ");
            num1 = in.nextInt();
    
            System.out.println("Informe o segundo número: ");
            num2 = in.nextInt();

            int resultado = num1/num2;
            System.out.println("O resultado é: "+resultado);
        }
        catch(InputMismatchException e) {
            System.out.println("\nErro: Caracter informado não numérico");
        }
        catch (ArithmeticException e) {
            System.out.println("\nErro: Não divida por zero");
            }
    }

}