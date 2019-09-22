import java.util.*;

public class nom_fechamanac{
	public static void main(String[] args){
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
	}
}