package stringmethods;

public class StringBufferMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String x = "abc";
		String x1 = x.substring(0, 3) + "123" + x.substring(3);
		
		String y = x.toUpperCase();
		
		StringBuffer buffer = new StringBuffer();
		
		buffer.append("abc");
		buffer.append("yxz");
		
		buffer.reverse();
		
		String sub = buffer.substring(0, 3);
		
		buffer.insert(3,  "123");
		
		System.out.println(buffer.toString());
		
		
	}

}
