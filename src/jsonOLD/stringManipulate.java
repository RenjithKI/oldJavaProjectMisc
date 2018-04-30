package jsonOLD;

public class stringManipulate {

	public static void main(String[] args) {
		String st ="1234567890"+"1234567890"+"1234567890"+"123456";
		System.out.println("st_>"+st);
		System.out.println("st_>"+st.substring(0, 28));
		System.out.println("st_>"+st.substring(st.length()-8));
		System.out.println("st_>"+st.substring(0, 32)+st.substring(st.length()-8));
	}

}
