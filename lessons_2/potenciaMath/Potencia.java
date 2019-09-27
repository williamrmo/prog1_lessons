import java.io.*;

public class Potencia{
	public static void main(String[] args) throws IOException{
		int j,pot;
		double num, res;
		BufferedReader in = new BufferedReader(new InputStreamReader (System.in));

		System.out.print("Digite un numero para ser elevado: ");
		num = Integer.parseInt(in.readLine());
		System.out.print("Digite el numero que va a elevado: ");
		pot = Integer.parseInt(in.readLine());

		for(j = 1;j <= pot;j++){
	res = Math.pow(num, j); // Math para calculos, pow para potencia(numero, potencia) -> double(siempre)
			System.out.println(num + " poencia de " + j + " = " + res);
		}
	}
}