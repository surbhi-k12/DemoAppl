package in.ineuron;

public class DemoApplication {

	public static void main(String[] args) {
		
		int[] a= {10,20,30,40};
		for(int ele : a) {
			System.out.println(ele);
		}
		
		String name="sachin";
		int count= name.toUpperCase().length();
		System.out.println("The length of the String is ::" +count);

	}

}
