package stringstringbufferandstringbuilder;

public class StringBufferDemo {

	public static void main(String[] args) {
		
		String str1 = "";
		str1 = str1 + "welcome";
		str1 = str1 + "home";
		System.out.println("String: " + str1);
		
		StringBuffer sb1 = new StringBuffer();
		sb1.append("hello");
		sb1.append("java");
		System.out.println("String Buffer: " + sb1);
		
		//converting string to primitive data type using wrapper class data type 
		String data1 = "45.67";
		double data2 = Double.parseDouble(data1);
		System.out.println(++data2);
		
		String data3 = "80";
		int data4 = Integer.parseInt(data3);
		
		//primitive type to string
		int data5 = 89;
		String data6 = data5 + "";
		
		//min 10 methods for string
		//min 5 methods for string builder
		
		
	}

}
