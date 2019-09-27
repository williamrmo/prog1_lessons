import java.util.*;

public class num5{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int par = 0, impar = 0, pos = 0, neg = 0, i, num;

		for(i = 0; i <= 19; i++){
			System.out.print((i+1) + "- Introduzca un numero: ");
			num = sc.nextInt();

			if(num % 2 == 0){
				par++;
			} else{
				impar++;
			}

			if(num >= 0){
				pos++;
			}else{
				neg++;
			}
		} // end for

		System.out.println("Hay " + par + " numeros pares");
		System.out.println("Hay " + impar + " numeros impares");
		System.out.println("Hay " + pos + " numeros positivos");
		System.out.println("Hay " + neg + " numeros negativos");
	}
}