import java.util.*;
import java.lang.*;

public class verificarNumero{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num,num2, i, cont = 0, aux = 0;
		String dimension;
		boolean si = true;

		System.out.println("Ingrese un valor para verificar que sea:");
		System.out.println("Sus digitos son pares y si lo son su promedio.");
		System.out.print("Ingrese el numero: ");
		num = sc.nextInt();

		dimension = Integer.toString(num);

		for(i = 0;i < dimension.length(); i++){
			num2 = Character.getNumericValue(dimension.charAt(i));

			if(num2 % 2 == 0){
				System.out.println("El numero: "+ dimension.charAt(i));
				aux = aux + num2;
			} else {
				si = false;
			}
		}

		if(si){
			aux = aux / dimension.length();

			System.out.println("El resultado es: " + aux);
		}

	}
}