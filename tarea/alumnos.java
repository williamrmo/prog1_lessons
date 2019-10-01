import java.util.*;

public class alumnos{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int edad, mayor20 = 0, mayor185 = 0, i;
		double altura, estaturaMedia = 0, edadMedia = 0;

		for(i=0;i<=4;i++){
			System.out.print((i+1)+"- Ingrese la edad: ");
			edad = sc.nextInt();
			System.out.print("   Ingrese la altura: ");
			altura= sc.nextDouble();

			edadMedia = edadMedia + edad;
			estaturaMedia = estaturaMedia + altura;

			if(edad > 20){
				mayor20++;
			}

			if(altura > 1.85){
				mayor185++;
			}
		}

		System.out.println("");
		System.out.println("****************************************************");
		System.out.println("El promedio de edad es de: " + (edadMedia/5));
		System.out.println("El promedio de altura es de: " + (estaturaMedia/5) + " cm");
		System.out.println("La cantidad de estudiantes mayores de 20 annos es de " + mayor20);
		System.out.println("La cantidad de estudiantes con una altura mayor a 1.85 es de " + mayor185);
	}
}