import java.util.*;

public class planilla{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int masculino = 0;
		int femenino = 0;
		int salario = 0, opc, res = 0;

		System.out.println("Ingrese el sexo de cada empleado (M=1 o F=2) y su salario");
		System.out.println("cuando sexo sea igual a 3, el programa se detendra");

		do{

			System.out.println("Ingrese el sexo");
			opc = sc.nextInt();

			switch(opc){
				case 1:
					masculino++;
					System.out.print("Ingrese el salario del empleado:  ");
					salario = sc.nextInt();
					break;
				case 2:
					femenino++;
					System.out.print("Ingrese el salario del empleado:  ");
					salario = sc.nextInt();
					break;
				case 3:
					System.out.println("ver datos");
					break;
				default:
					System.out.println("Opcion no valida");
			}


			res = res + salario;
		}while(opc != 3);

		System.out.println("");
		System.out.println("La cantidad de hobres es de: " + masculino);
		System.out.println("La cantidad de mujeres es de: " + femenino);
		System.out.println("La suma total de sdalarios des de: " + res);
	}
}