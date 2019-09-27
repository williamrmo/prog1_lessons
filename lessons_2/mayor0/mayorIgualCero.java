import java.util.*;

public class mayorIgualCero{
	public static void main(String[] ags){
		Scanner sc = new Scanner(System.in);
		int num = 0;

		System.out.println("Ese eje solicita un numero si ese es mayor a 0 se termina el programa, ");
		System.out.println("de lo contrario solicita otro numero");
		System.out.println(" "); System.out.println(" ");

		while(num <= 0){
			System.out.print("Ingrese un numero:     ");
			num = sc.nextInt();
		}
	}
}


