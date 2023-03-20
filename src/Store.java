import java.util.ArrayList;

// Egen separaste class som har Lamp

public class Store {
	// Har relation till Lamp
	// lAMPS ARRAY, en lista över lampor. varje affär har flera lampor i sitt lager(stock)
	private ArrayList<Lamp> stock = new ArrayList<Lamp>();
	private String adress;
	private int tel;
	// I vårat fall är alla lampafäfrer en kedja, därför finns det bara enm och samma hemsida för alla.
	private static String website = "www.lampaffären.se";
	
	Store(String adress, int tel){
		this.adress = adress;
		this.tel = tel;
	}
	
	// multiple konstruktor, om inget tel anges fås ett defaouilt nummer till affären, känner av antalket parametera och typ.
	Store(String adress){
		this.adress = adress;
		this.tel = 987654321;
	}
	
	// setter för arraylist stock
	public void setStock(Lamp lamp) {
		this.stock.add(lamp);
	}
	
	// getter för adress 
	public String getAdress() {
		return this.adress;
	}
	
	public int getTel() {
		return this.tel;
	}
	
	public ArrayList<Lamp> getStock(){
		return this.stock;
	}
	
	public void printStoreInfo() {
		System.out.println("Info om denna affär: ");
		System.out.println("Adress: " + this.adress + ", Telefon: " + this.tel + ", Website: " + Store.website);		
	}
	
	// Metod för att skriva ut lagret, om lagret är tomt skrivs de ut, annars skrivs namnet på alla lampor i lagret ut.  
	public void printStock() {
		if (this.stock.isEmpty()) {
			System.out.println("Lagret är tomt");
		} else {
			System.out.println("lagret består av: ");
			for (Lamp lamp : this.getStock()) {
				System.out.println(lamp.getName());
			} 
		}
	}
	
}
