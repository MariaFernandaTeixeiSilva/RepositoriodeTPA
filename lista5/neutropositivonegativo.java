import java.util.Scanner;
public class neutropositivonegativo {
	public static void main(String[] args) {
		Scanner in= new Scanner (System.in);
			int numero;
			System.out.println("Insira o n�mero");
			numero= in.nextInt();
			
			if (numero > 0) {
				System.out.println("Seu n�mero � positivo!");
			} else if(numero==0) {
				System.out.println("Seu n�mero � neutro!");
			} else {
				System.out.println("Seu n�mero � negativo");
			}
 }
}
