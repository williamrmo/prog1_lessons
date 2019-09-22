import java.io.*;

public class numParImpar {
	public static void main(String args[])throws IOException{
		int num;

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Ingrese un numero: ");
		num = Integer.parseInt(in.readLine());

		if(num % 2 == 0){
			System.out.println("El numero es PAR");
		} else {
			System.out.println("El numero es IMPAR");
		}
	}
}