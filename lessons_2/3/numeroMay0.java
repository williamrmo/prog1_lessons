import java.util.*;

public class numeroMay0{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num = 0, cont = 0, i;

		for(i = 0;i <= 9; i++){
			System.out.print("Introduzca un numero: ");
			num = sc.nextInt();

			if(num > 0){
				cont++;
			}
		}

		System.out.println("Hay " + cont + " mayores que 0.");
	}
}