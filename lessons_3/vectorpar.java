public class vectorpar{
	public static void main(String[] args){
		int[] n = new int[51];
		System.out.println("Numeros pares");

		for(int i = 1; i <= 50; i++){
			n[i] = i;
			if(n[i] %2 == 0){
				System.out.println(n[i]);
			}
		}
	}
}