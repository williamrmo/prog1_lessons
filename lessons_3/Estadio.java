// import java.util.*;

public class Estadio {
	public static void main (String[] args) {
		// Scanner sc = new scanner(System.in);
		int i, j, cont = 0;

		int[][] as = new int[60][50];

		for(i = 0; i <= 59; i++){
			for(j = 0; j <= 49; j++){
				cont++;
				as[i][j] = cont;
				System.out.print(as[i][j] + " ");
			}
			System.out.println("");
		}
	}
}