import java.util.*;

public class cajero{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int Billetes[] = {20000, 10000, 5000, 2000, 1000};
		int cantidad, i, cont = 0;
		boolean bandera = false;

		do{
			System.out.print("Ingrese una cantidad: ");
			cantidad = sc.nextInt();
		}while(cantidad < 1000);

		for(i=0;i<=4; i++){

			while(cantidad >= Billetes[i]){
				cantidad = cantidad - Billetes[i];
				cont++;
				bandera = true;
			} // end while

			if(bandera){
				System.out.println("- $" +Billetes[i]+"  " +cont);
				cont = 0;
				bandera = false;
			} // end if
		} // end for
	} // end main
} // end class