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
}
