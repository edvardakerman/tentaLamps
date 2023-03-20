
public class Chandeiler extends CeilingLamp{
	Chandeiler(int itemNumber, String name) {
		super("Stearinljus", itemNumber, name);
	}
	
	// Polymorfi
	@Override
	public void hangUp() {
		System.out.println(this.getName() + "Hänger fint och glittar på längden " + this.getCableLength());
	}
}
