package oct_2_classwork;

public class BufferClassWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer("135");
		System.out.println(sb.toString());
		
		sb.replace(0, 5, "6789");
		System.out.println(sb.toString());
		
		sb.insert(0, "12345");
		System.out.println(sb.toString());
		
		sb.reverse();
		System.out.println(sb.toString());
		
		sb.delete(0,  5);
		System.out.println(sb.toString());
		
		System.out.println(sb.toString());
	}

}
