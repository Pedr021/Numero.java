import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner (System.in);
        int numero;
        System.out.print("Digite um numero: ");
        numero = leia.nextInt();
        System.out.println("O numero informado foi: " + numero);
    }
    
}

