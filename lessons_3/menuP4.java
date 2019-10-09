import java.util.*;

public class menuP4 {
	public static void main(String[] args){
		int opc, i,j;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println(" **************************");
			System.out.println(" *   1- Sumatoria         *");
			System.out.println(" *   2- Tribuna           *");
			System.out.println(" *   3- Numero perfecto   *");
			System.out.println(" *   4- Salir             *");
			System.out.println(" **************************");
			System.out.print("Ingrese una opciono: ");
			opc = sc.nextInt();

			System.out.println("");
			switch(opc){
				case 1: // sumatorio
					int num1,res1 = 0;

					do{
						System.out.print("Ingrese un numero: ");
						num1 = sc.nextInt();

						if(num1 != 25){
							res1 = res1 + num1;
						}// end if

					} while(num1 != 25);// end do while

					System.out.println("El resultado es: "+res1);
					break;
				case 2: // tribuna
					int cont = 0;
					int[][] as = new int[50][60];

					for(i = 0; i <= 49; i++){
						for(j = 0; j <= 59; j++){
							if(j == 2 || j == 5 ||j == 8||j == 11||j == 14||j == 17||j == 20||j == 23||j == 26||j == 29||j == 32||j == 35||j == 38||j == 41||j == 44||j == 47||j == 50||j == 53||j == 56 || j == 59)  {
								as[i][j] = 0;
							} else {
								cont++;
								as[i][j] = cont;
							}


							System.out.print(as[i][j] + " ");
						}
						System.out.println("");
					}
					break;
				case 3: // numero perfecto
					int num3, div, res3 = 0;

					System.out.print("Ingrese un numero para verificar si es perfecto: ");
					num3 = sc.nextInt();

					for(i = 1;i < num3; i++){
						if(num3 % i == 0) {
							div = i;
							res3 = res3 + div;
							System.out.println("Divisores: " + div);
						}
					}
					if(res3 == num3){
						System.out.println("Si es un numero perfecto " + res3);
					} else {
						System.out.println("No es un num ero perfecto");
					}

					break;
				case 4: // salir
					System.out.println("Teminar programa");
					break;
				default:
					System.out.println("ERROR");
			}
			System.out.println("");
		}while(opc != 4);
	}
}