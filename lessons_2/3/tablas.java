public class tablas{
	public static void main(String[] args){
		int i,j,res,cont;

		for(i = 1;i <= 10; i++){
			System.out.println("Tabla del " + i);
			for(j = 1; j <= 10; j++){
				System.out.println(i + " * " + j + " = " + (i*j));
			}
			System.out.println("");
		}
	}
}