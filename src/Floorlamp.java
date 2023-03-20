
public class Floorlamp extends Lamp{
	
	
	Floorlamp(String lightbulb, int itemNumber, String name) {
		super(lightbulb, itemNumber, name);
	}


	// Abstrakt metod från Lamp som övcerskuggas
	@Override
	public void turnOn() {
		String tmp = "Golvlampan är ";
		if (this.getStatus()) {
			tmp += "tänd";
		} else {
			tmp += "släkt";
		}
		System.out.println(tmp);
	}
	

	
	
	
}
