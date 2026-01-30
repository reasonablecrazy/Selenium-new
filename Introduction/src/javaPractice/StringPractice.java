package javaPractice;

public class StringPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(args.length);
		
		String s = "Everything is planned";
		StringBuilder ss = new StringBuilder(s);
		
		ss.append("Naveen");
		System.out.println(ss);
		
		ss.reverse();
		System.out.println(ss);
		
		//        String mockBody = "{ \"data\": [{ \"id\": 1, \"first_name\": \"FAKE_USER\" }] }";

	}

}
