
// Superclass till floorlamp och Ceilinglamp

public abstract class Lamp {
	private String lightbulb;
	private int itemNumber;
	private String name;
	private Boolean status = false;
	
	Lamp(String lightbulb, int itemNumber, String name) {
		this.lightbulb = lightbulb;
		this.itemNumber = itemNumber;
		this.name = name;
	}
	
	public String getLightbulb() {
		return this.lightbulb;
	}
	
	public String getName() {
		return this.name;
		
	}
	
	public int itemNumber() {
		return this.itemNumber;
	}
	
	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}
	
	// Abstrakt
	public abstract void turnOn();
	
	
	
}
