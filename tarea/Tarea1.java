import java.util.*;

public class Tarea1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int opc, i;

		do{
			System.out.println("*****************************");
			System.out.println("*  1- Verificar un numero   *");
			System.out.println("*  2- Cajero automatico     *");
			System.out.println("*  3- Numeros amigos        *");
			System.out.println("*  4- Numero de las suerte  *");
			System.out.println("*  5- Terminar el programa  *");
			System.out.println("*****************************");
			System.out.print("Ingrese una opcion: ");
			opc = sc.nextInt();
			switch(opc){
				case 1: // Verificar el numero
					int num,num2, aux = 0;
					String dimension;
					boolean par = true;

					System.out.println("Ingrese un valor para verificar que sea:");
					System.out.println("Sus digitos son pares y si lo son su promedio.");
					System.out.print("Ingrese el numero: ");
					num = sc.nextInt();

					dimension = Integer.toString(num);

					for(i = 0;i < dimension.length(); i++){
						num2 = Character.getNumericValue(dimension.charAt(i));

						if(num2 % 2 == 0){
							aux = aux + num2;
						} else {
							par = false;
						}
					}

					if(par){
						aux = aux / dimension.length();
						System.out.println("Todos los digitos son pares");
						System.out.println("El promedio de sus digitos es: " + aux);
					} else {
						System.out.println("NO todos sus digitos son pares");
					}

					break;
				case 2: // cajero
					int Billetes[] = {20000, 10000, 5000, 2000, 1000};
					int cantidad, cont = 0;
					boolean bandera = false;

					do{
						System.out.print("Ingrese una cantidad: ");
						cantidad = sc.nextInt();
					} while(cantidad < 1000);

					for(i=0;i<=4; i++){

						while(cantidad >= Billetes[i]){
							cantidad = cantidad - Billetes[i];
							cont++;
							bandera = true;
						} // end while

						if(bandera){
							System.out.println("- C" +Billetes[i]+"  " +cont);
							cont = 0;
							bandera = false;
						} // end if
					} // end for
					break;
				case 3: // numeros amigos
					int numA, numB, resA = 0, resB = 0;

					System.out.print("Ingrese un numero: ");
					numA = sc.nextInt();
					System.out.print("Ingrese otro numero: ");
					numB = sc.nextInt();

					for(i = 1; i <= (numA - 1); i++){
						if(numA % i == 0){
							resA = resA + i;
						}
					}
					for(i = 1; i <= (numB - 1); i++){
						if(numB % i == 0){
							resB = resB + i;
						}
					}


					System.out.println("La suma de los diviores propios del primer numero es: " + resA);
					System.out.println("La suma de los diviores propios del primer numero es: " + resB);

					if(numA == resB && numB == resA){
						System.out.println("Por lo tanto SI son numeros amigos.");
					} else {
						System.out.println("Por lo tanto NO son numeros amigos.");
					}
					break;
				case 4: // numero de la suerte
					int numS, numSi, dia, mes, anno;
					String numConver;

					System.out.print("Ingrese un dia: ");
					dia = sc.nextInt();
					System.out.print("Ingrese un mes: ");
					mes = sc.nextInt();
					System.out.print("Ingrese un anno: ");
					anno = sc.nextInt();

					numS = dia + mes + anno;
					numConver = Integer.toString(numS);
					numS = 0;

					for(i = 0; i < numConver.length();i++){
						numSi = Character.getNumericValue(numConver.charAt(i));
						numS = numS + numSi;
					}
					System.out.println(numS);
					break;
				case 5: // Cerrar el programa
					System.out.println("Terminar el programa");
					break;
				default:
					System.out.println("Error. Vuelva a intentar.");
			}// end switch

			System.out.println(" ");
		} while(opc != 5);

		System.out.println("Fin.");
	}
}