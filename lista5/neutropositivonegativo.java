import java.util.Scanner;
public class neutropositivonegativo {
	public static void main(String[] args) {
		Scanner in= new Scanner (System.in);
			int numero;
			System.out.println("Insira o número");
			numero= in.nextInt();
			
			if (numero > 0) {
				System.out.println("Seu número é positivo!");
			} else if(numero==0) {
				System.out.println("Seu número é neutro!");
			} else {
				System.out.println("Seu número é negativo");
			}
 }
}
