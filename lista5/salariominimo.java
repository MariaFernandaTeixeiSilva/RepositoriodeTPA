import java.util.Scanner;
public class salariominimo {
	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
			double salario, minimo, calculo;
			System.out.println("Insira seu sal�rio");
				salario= in.nextDouble();
				minimo= 1320;
			System.out.print("Seu sal�rio � ");
			
			if (salario > minimo) {
				System.out.print("acima do sal�rio m�nimo");
			}else if (salario == minimo){
				System.out.print("igual ao sal�rio minimo");
			} else {
				System.out.print("abaixo do sal�rio m�nimo");
			}
			
	}
}
