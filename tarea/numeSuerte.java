import java.util.*;

public class numeSuerte{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int numS, numSi, dia, mes, anno, i;
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
	}
}