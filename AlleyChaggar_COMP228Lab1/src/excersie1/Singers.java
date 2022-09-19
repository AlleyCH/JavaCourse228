package excersie1;

public class Singers {

	private int id;
	private String name;
	private String address; 
	private String dob;
	private int noOfAlbums;
	
	
	private void singers() {
		
	}
	
	private void singers(int id) {
		this.id = id;
	}
	
	private void singers(int id, String name) {
		this.id = id;
		this.name = name;
	}
	private void singers(int id, String name, String address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}
	private void singers(int id, String name, String address, String dob) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.dob = dob;
	}
	private void singers(int id, String name, String address, String dob, int noOfAlbums) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.dob = dob;
		this.noOfAlbums = noOfAlbums;
	}
	
	public void setSinger(int id, String name, String address, String dob, int noOfAlbums) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.dob = dob;
		this.noOfAlbums = noOfAlbums;
	}
	
	
	public void setId(int id) {
		this.id = id;
	}	
	public int getId() {
		return id; 
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	
	
	public void setAddress(String address) {
		this.address = address; 
	}	
	public String getAddress() {
		return address;
	}
	
	
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getDob() {
		return dob;
	}

	
	public void setNoOfAlbums(int noOfAlbums) {
		this.noOfAlbums = noOfAlbums;
	}	
	public int getNoOfAlbums() {
		return noOfAlbums;
	}
}
