import java.util.*;

public class conversion{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n;
		String octal, hexa, bin;

		System.out.print("Ingrese numero: ");
		n = sc.nextInt();

		hexa = Integer.toHexString(n); // convertir a Hexa
		octal = Integer.toOctalString(n); // convertir a Octal
		bin = Integer.toBinaryString(n); // convertir a Binario


		System.out.println("------------------------------");
		System.out.println("Numero en sistema decimal: " + n);
		System.out.println("Numero en sistema hexadecimal: " + hexa);
		System.out.println("Numero en sistema octal : " + octal);
		System.out.println("Numero en sistema binario: " + bin);
	}
}