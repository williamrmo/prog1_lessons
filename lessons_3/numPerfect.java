import java.util.*;

public class numPerfect{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num, i, div, res = 0;

		System.out.print("Ingrese un numero para verificar si es perfecto: ");
		num = sc.nextInt();

		for(i = 1;i < num; i++){
			if(num % i == 0) {
				div = i;
				res = res + div;
				System.out.println("Divisores: " + div);
			}
		}

		System.out.println("Resultado: " + res);
	}
}