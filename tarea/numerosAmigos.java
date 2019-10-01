import java.util.*;

public class numerosAmigos{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int numA, numB, i, resA = 0, resB = 0;

		System.out.print("Ingrese un numero: ");
		numA = sc.nextInt();
		System.out.print("Ingrese otro numero: ");
		numB = sc.nextInt();

		for(i = 1; i <= (numA - 1); i++){
			if(numA % i == 0){
				resA = resA + i;
			}
		}
		for(i = 1; i <= (numB - 1); i++){
			if(numB % i == 0){
				resB = resB + i;
			}
		}


		System.out.println("La suma de los diviores propios del primer numero es: " + resA);
		System.out.println("La suma de los diviores propios del primer numero es: " + resB);

		if(numA == resB && numB == resA){
			System.out.println("Por lo tanto SI son numeros amigos.");
		} else {
			System.out.println("Por lo tanto NO son numeros amigos.");
		}
	}
}