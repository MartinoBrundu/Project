package Project;

public class Immage extends ElementoMultimediale implements Brightness {
private int brightness ;



    public Immage(String titolo, int brightness){
        super(titolo) ;
        this.brightness= brightness ;

    }


    @Override
    public void raiseBrightness() {
        brightness++;
    }

    @Override
    public void lowerBrightness() {
        brightness--;
    }

    public void show(){
        System.out.println(titolo + " " + "*".repeat(brightness));
    }


    @Override
    public void run() {
        show();

    }
    @Override
    public String toString() {
        return "Image{" +
                "luminosita=" + brightness+
                '}';
    }

    public int getBrightness() {
        return brightness;
    }

    public void setLuminosita(int newVol) {
        this.brightness=newVol;
    }

};
