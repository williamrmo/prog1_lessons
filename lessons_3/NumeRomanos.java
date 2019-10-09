import java.util.*;

public class NumeRomanos{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N,u,d,c;

		String Unidad[] = {"","I","11","III","IV","V","VI","VII","VIII","IX"};
		String Decena[] = {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
		String Centena[] = {"", "C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};

		System.out.println("Ingrese un numero");
		N = sc.nextInt();
		u = N %10;
		d = (N/10)%10;
		c = N/100;

		if(N >=100){
			System.out.println(Centena[c] + Decena[d] + Unidad[u]);
		} else
			if(N >= 10){
				System.out.println(Decena[d] + Unidad[u]);
			}else {
				System.out.println(Unidad[u]);
			}
	}
}