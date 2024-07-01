package inheritance;

public class vehicle {
	private String colour;
	protected int maxSpeed;
	
	public void setColour(String colour) {
		this.colour=colour;
	}
	public String getColour() {
		return colour;
	}
	public void print() {
		System.out.println("vehicle colour "+ colour+" Maxsped"+maxSpeed);
	}
}
