package looping;

public class NestedLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//for (int i = 0; i < 10; i++) {
		//	System.out.println("\n" + "i" + i);
		//	for ( int a = 0; a < 10; a++) {
		//		System.out.println("a" + a);
		//	}
		//}
		
		for (int inner = 1; inner <= 10; inner++) {
			for ( int outter = 1; outter <= inner; outter++) {
				System.out.print("X");
			}
			System.out.print("\n");
		}
	}

}
