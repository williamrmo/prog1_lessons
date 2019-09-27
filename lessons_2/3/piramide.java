import java.util.*;

public class piramide{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num, i, j;
		String sim = "*";

		System.out.print("Intoduzca e numero de lineas: ");
		num = sc.nextInt();

		for(i = 1; i <= num; i++){
			for(j = 1; j <= i; j++){
				System.out.print(sim);
			}
			System.out.println();
		}
	}

}