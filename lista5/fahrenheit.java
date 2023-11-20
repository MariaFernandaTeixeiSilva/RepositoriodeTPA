import java.util.Scanner;
public class fahrenheit {
	public static void main(String[] args) {
		Scanner in= new Scanner (System.in);
			double conversao, fahreinheit, celsius;
			System.out.println("Insira o fahreinheit");
				fahreinheit= in.nextDouble();
				conversao= (fahreinheit-32)/1.8;
				celsius=conversao;
			System.out.print("Está "+celsius+" e está ");
			
			if(celsius>=22) {
				System.out.print("calor");
			} else if(celsius<15) {
				System.out.print("frio");
			} else {
				System.out.print("ameno");
			}
	}
}
