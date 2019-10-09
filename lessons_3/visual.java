import java.util.*;

public class visual{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num,res = 0;

		do{
			System.out.print("Ingrese un numero: ");
			num = sc.nextInt();

			if(num != 25){
				res = res + num;
			}// end if

		} while(num != 25);// end do while

		System.out.println("El resultado es: "+res);
	}
}