
public class CeilingLamp extends Lamp {
	private int cableLength;
	
	CeilingLamp(String lightbulb, int itemNumber, String name) {
		super(lightbulb, itemNumber, name);
	}

	public int getCableLength() {
		return cableLength;
	}

	public void setCableLength(int cableLength) {
		this.cableLength = cableLength;
	}
	
	// Abstrakt metod från Lamp som övcerskuggas
	@Override
	public void turnOn() {
		String tmp = "Taklampan är ";
		if (this.getStatus()) {
			tmp += "tänd";
		} else {
			tmp += "släkt";
		}
		System.out.println(tmp);
	}
	
	// Polymorfi
	public void hangUp() {
		System.out.println(this.getName() + "Hänger i taket med längden " + this.getCableLength());
	}
	
	

}
