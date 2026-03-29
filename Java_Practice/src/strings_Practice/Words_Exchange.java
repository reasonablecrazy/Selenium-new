package strings_Practice;

public class Words_Exchange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Input: "Automation testing using Java Selenium"
		//Output: "testing Automation Java using Selenium"
		
		
		String str = "Automation testing using Java Selenium";
		String[]str_arr = str.split(" ");
		String temp;
		for(int i=0;i<str_arr.length;i++) {
			if(i%2==1) {
				temp = str_arr[i];
				str_arr[i]=str_arr[i-1];
				str_arr[i-1]=temp;
			}
		}
		String updated = String.join(" ", str_arr);
		System.out.println(updated);

	}

}
