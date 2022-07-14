import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex2 {
    public static void main(String args[]) {
        
        Scanner scan = new Scanner(System.in);
        int vetor[] = new int[10];
        int num = 1, i = 0;

        try{
            while(num != 0){
                System.out.print("Informe o " + (i+1) + "° número: ");
                vetor[i] = scan.nextInt();
                num = vetor[i];
                i++;
                }
        }
        catch(InputMismatchException e) {
            System.out.println("\nErro: Caracter informado não numérico");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("\nErro: Excedeu tamanho do vetor");
        }
    }
}
