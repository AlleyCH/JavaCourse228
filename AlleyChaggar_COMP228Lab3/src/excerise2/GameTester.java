package excerise2;

public abstract class GameTester {
	public String name;
	public boolean status;
	
	
	public GameTester(boolean statuses) {
		 status = statuses;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	public String getName() {
		return name;
	}
	public Boolean getStatus() {
		return status;
	}
	
	
	public abstract void salary();
}
