package excersie1;

public class SingerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singers singer1 = new Singers();
		
		// default values 
		System.out.printf("Singer Id: %s %n", singer1.getId());
		System.out.printf("Singer Name: %s %n", singer1.getName());		
		System.out.printf("Singer Add: %s %n", singer1.getAddress());
		System.out.printf("Singer Date of birth: %s %n", singer1.getDob());
		System.out.printf("Singer # of albums: %s %n", singer1.getNoOfAlbums());
		System.out.println();

		// set values 
		singer1.setId(888);
		singer1.setName("Alley");
		singer1.setAddress("Planet Earth");
		singer1.setDob("January 28 2002");
		singer1.setNoOfAlbums(5);
		
		System.out.printf("Singer Id: %d %n", singer1.getId());
		System.out.printf("Singer Name: %s %n", singer1.getName());		
		System.out.printf("Singer Add: %s %n", singer1.getAddress());
		System.out.printf("Singer Date of birth: %s %n", singer1.getDob());
		System.out.printf("Singer # of albums: %d %n", singer1.getNoOfAlbums());
		
	}

}
