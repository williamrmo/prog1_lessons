import java.util.*;
import java.io.*;

public class Menu{
	public static void main(String[] args)throws IOException{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		int opcion;

		do{
			System.out.println("Menu opciones");
			System.out.println("*************************");
			System.out.println("1- Operaciones");
			System.out.println("2- Conversion");
			System.out.println("3- Par o Impar");
			System.out.println("4- Datos");
			System.out.println("5- Finalizar");
			System.out.print("Eliga una opcion: ");
			opcion = sc.nextInt();

			switch(opcion){
				case 1:// Operaciones
					int a,b,sum,rest,mult; //declaracin de variables
					double divi;

					System.out.print("Inserte un numero:  ");  //lectura de varibales
					a=Integer.parseInt(in.readLine());
					System.out.print("Inserte un numero:  ");
					b=Integer.parseInt(in.readLine());
					sum=a+b;
					rest=a-b;
					mult=a*b;
					divi=a/b;
					System.out.println("SUMA=  "+sum);
					System.out.println("RESTA= "+rest);
					System.out.println("MULTIPLICACION= "+mult);
					System.out.println("DIVISION ="+divi);
					break;
				case 2:// Conversion
					int num;
					String hexa, oct, bin;
					System.out.print("Ingrese numero: ");
					num=sc.nextInt();
					hexa=Integer.toHexString(num); // permite ejecutar la conversion del numero a hexadecimal
					oct=Integer.toOctalString(num);
					bin=Integer.toBinaryString(num);
					System.out.println("------------------------------------------");
					System.out.println("Numero "+num+" en sistema decimal: "+num);
					System.out.println("Numero "+num+" en sistema hexadecimal: "+hexa);
					System.out.println("Numero "+num+" en sistema octal: "+oct);
					System.out.println("Numero "+num+" en sistema binario: "+bin);

					break;
				case 3:// Par Impar
					int numPar;

					BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
					System.out.print("Ingrese un numero: ");
					numPar = Integer.parseInt(in.readLine());

					if(numPar % 2 == 0){
						System.out.println("El numero es PAR");
					} else {
						System.out.println("El numero es IMPAR");
					}
					break;
				case 4: //Datos
					String nom;
					int dia, mes,anno;
					Scanner sc = new Scanner(System.in);

					System.out.println("Introduce un nombre");
					nom = sc.nextLine();
					System.out.println("Introduce su fecha de nacimiento");
					System.out.print("Dia: ");
					dia = sc.nextInt();
					System.out.print("Mes: ");
					mes = sc.nextInt();
					System.out.print("Anno: ");
					anno = sc.nextInt();

					System.out.println("Tu nombre es: " + nom);
					System.out.println("Su fecha de nacimiento es: " + dia + "/" + mes + "/" + anno);
					break;
				default:// Finalizar
					System.out.println("ha terminado");
			}//fin switch
		}while(opcion!=5);
	}// fin main
}//fin Menu