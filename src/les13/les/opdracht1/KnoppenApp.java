package les13.les.opdracht1;

import java.util.ArrayList;
import processing.core.PApplet;

public class KnoppenApp extends PApplet {
	
	public static void main(String[] args) {
		PApplet.main(new String[] {"les13.les.opdracht1.KnoppenApp"});
	}
	
	private ArrayList<Knop> knoppen = new ArrayList<>();

	private IDoelwit licht;
	private IDoelwit tekstraam;
	
	public void settings(){
		size(400, 400);	
	}
	
	public void setup() {

		licht = new Licht(this);
		tekstraam = new Tekstraam(this,"OOPD",250,250);
		
		Switch eenSwitch = new Switch(this,100,20,50,50);
		Switch tweedeSwitch = new Switch(this,160,20,50,50);


		eenSwitch.voegDoelwitToe(licht);
		eenSwitch.voegDoelwitToe(tekstraam);
		eenSwitch.voegDoelwitToe(tweedeSwitch);

		tweedeSwitch.voegDoelwitToe(licht);
		tweedeSwitch.voegDoelwitToe(tekstraam);
		tweedeSwitch.voegDoelwitToe(eenSwitch);

		knoppen.add(eenSwitch);
		knoppen.add(tweedeSwitch);
	}
	
	public void draw() {
		licht.teken();
		tekstraam.teken();
		for (Knop k : knoppen) {
			k.teken();
		}
	}
	
	public void mousePressed() {
		for (Knop k : knoppen) {
			if (k.isMuisOverKnop()) {
				k.handelInteractieAf();
			}
		}
	}
}