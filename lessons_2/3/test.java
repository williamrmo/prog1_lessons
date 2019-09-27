import java.util.*;

public class test{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String nom = "Rigo";
		String test = " ";

		System.out.print("Intoduzca el nombre: ");
		test = sc.nextLine();

		if(nom.equalsIgnoreCase(test)){
			System.out.println("si");
		} else{
			System.out.println("no");
		}
	}

}