
public class EGwamok {
	private int ID;
	private String name;
	private int hackjeom;
	
	public EGwamok() {
		
	}
	
	public EGwamok(int ID, String name, int hackjeom) {
		this.ID = ID;
		this.name = name;
		this.hackjeom = hackjeom;
	}

	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHackjeom() {
		return hackjeom;
	}
	public void setHackjeom(int hackjeom) {
		this.hackjeom = hackjeom;
	}
}
