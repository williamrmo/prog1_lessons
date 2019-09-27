import java.util.*;

public class diaLaboral{
	public static void main(String[] args){
		Scanner sc = new Scanner (System.in);
		int dia = 0;

		System.out.println("Ingrese el numero de un dia de el 1-7 para conocer si es laboral o no");
		System.out.println("Ingrese 8 para salir");

		do{
			dia = sc.nextInt();

			switch(dia){
				case 1:
					System.out.println("El dia " + dia + " si es laboral.");
					break;
				case 2:
					System.out.println("El dia " + dia + " si es laboral.");
					break;
				case 3:
					System.out.println("El dia " + dia + " si es laboral.");
					break;
				case 4:
					System.out.println("El dia " + dia + " si es laboral.");
					break;
				case 5:
					System.out.println("El dia " + dia + " si es laboral.");
					break;
				case 6:
					System.out.println("El dia " + dia + " no es laboral.");
					break;
				case 7:
					System.out.println("El dia " + dia + " no es laboral.");
					break;
				case 8:
					System.out.println("Salir");
					break;
				default:
					System.out.println("Error, vuelva a inytentar");
			}
		}while(dia != 8);


	}
}