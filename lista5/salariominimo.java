import java.util.Scanner;
public class salariominimo {
	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
			double salario, minimo, calculo;
			System.out.println("Insira seu salário");
				salario= in.nextDouble();
				minimo= 1320;
			System.out.print("Seu salário é ");
			
			if (salario > minimo) {
				System.out.print("acima do salário mínimo");
			}else if (salario == minimo){
				System.out.print("igual ao salário minimo");
			} else {
				System.out.print("abaixo do salário mínimo");
			}
			
	}
}
