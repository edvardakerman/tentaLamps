
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Anropar konstruktor
		Store ElsasLampStore = new Store("colonia 3", 123456789);
		
		// Anropar multipel konstrukor
		Store EddesLampStore = new Store("colonia 3");
		
		Floorlamp hörnLampa = new Floorlamp("E27", 1234, "Min röda lampa");
		Chandeiler chandelier1 = new Chandeiler(1234, "Sjukt fin lampa");
		

		
		
		System.out.println("Affärer: ");
		ElsasLampStore.setStock(hörnLampa);
		ElsasLampStore.setStock(chandelier1);
		
		System.out.println("Elsas affär:  ");
		ElsasLampStore.printStoreInfo();
		ElsasLampStore.printStock();
		
		System.out.println("Eddes affär: ");
		EddesLampStore.printStoreInfo();
		EddesLampStore.printStock();
		
		
		System.out.println("Lampor: ");
		System.out.println("Avstängda: ");
		hörnLampa.turnOn();
		chandelier1.turnOn();
		System.out.println("lampor tänds...");
		chandelier1.setStatus(true);
		hörnLampa.setStatus(true);

		hörnLampa.turnOn();
		chandelier1.turnOn();
		
		
		
		
	}

}
