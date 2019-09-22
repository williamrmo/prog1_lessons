import java.io.*;

public class op_basica {
	public static void main(String args[])throws IOException{
	int a, b, sum, rest, mult;
	double div;

	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	System.out.print("Ingrese un numero: ");
	a = Integer.parseInt(in.readLine());
	System.out.print("Ingrese un numero: ");
	b = Integer.parseInt(in.readLine());

	sum = a + b;
	rest = a - b;
	mult = a * b;
	div = a / b;

	System.out.println("Suma = " + sum);
	System.out.println("Resta = " + rest);
	System.out.println("Multiplicacion = " + mult);
	System.out.println("Division = " + div);
	}
}