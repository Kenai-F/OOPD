package les07.voorbereiding;

public class Klok {
    Teller minutenTeller;

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getBreedte() {
        return breedte;
    }

    public void setBreedte(float breedte) {
        this.breedte = breedte;
    }

    Teller urenTeller;
    float x, y, breedte;

    Klok(float x, float y, float breedte, Main app){
        this.x = x;
        this.y = y;
        this.breedte = breedte;
        urenTeller = new Teller(24, x, y, breedte, app);
        minutenTeller = new Teller(60, x + breedte / 2, y, breedte, app);
    }

    public void setTijd(int uren, int minuten){
        minutenTeller.setWaarde(minuten);
        urenTeller.setWaarde(uren);
    }

    public void tik(){
        minutenTeller.tik();
        if (minutenTeller.getWaarde() == 0){
            urenTeller.tik();
        }
    }

    public void tekenKlok(){
        urenTeller.tekenTeller();
        minutenTeller.tekenTeller();
    }
}
