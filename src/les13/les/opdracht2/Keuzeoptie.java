package les13.les.opdracht2;

public class Keuzeoptie implements IDoelwit {

	private String keuze;
	
	public Keuzeoptie(String keuze) {
		this.keuze = keuze;
	}
	
	@Override
	public void schakel() {
		System.out.println("Optie: " + keuze + "  gekozen.");
	}

}