
public class Exercice1 {
	private static int sommeNPremiersNombresIter(int N){
		int som = 0;
		for (int i = 0; i <=N; i++) {
			som +=i;
			System.out.println(i);
		}
		return som; 
	}
	public static void main(String[] args) {
System.out.println(sommeNPremiersNombresIter(5));
	}

}
