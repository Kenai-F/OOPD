package les13.les.opdracht1;

import processing.core.PApplet;

public class Tekstraam implements IDoelwit{

	private PApplet app;
	private String string;
	private int x;
	private int y;
	private boolean isActief = false;
	
	
	public Tekstraam(KnoppenApp knoppenApp, String string, int i, int j) {
		this.app = knoppenApp;
		this.string = string;
		this.x = i;
		this.y = j;
	}

	@Override
	public void schakel() {
		if (isActief) {
			string = "OOPD";
		} else {
			string = "elloo";
		}

		isActief = !isActief;
	}

	@Override
	public void teken() {
		if (isActief) {
			app.fill(255);
		} else {
			app.fill(50);
		}

		app.text(string, x, y);
	}
	
}