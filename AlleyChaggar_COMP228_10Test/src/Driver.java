import java.util.Arrays;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Arrays.toString(getProducts()));
	}
	
		public static Product[] getProducts () {
		Product[] products = {
		new Book (1000, "Introduction to Java",25, 2021, "Tim J"),
		new Software (2000, "Anti virus", 50,2022, true),
		new Software (3000, "Project Management", 100,2018, false)
		};
		return products;
		}
}
 	  
/*Write a driver program (another class with main method) that uses the above hierarchy. In
your driver program do the following.
• Create array of Products initialize it by calling get products method shown below
• Iterate over the array and display product information including price and type for
book and software objects*/
