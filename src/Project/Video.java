package Project;

public class Video extends ElementoMultimediale implements Riproducibile {
    private int brightness;
    private int  duration;

    public Video( String titolo, int brightness, int duration ) {
      super(titolo);
       this.brightness = brightness ;
       this.duration = duration;
   }



    @Override
    public void play() {

    }
}
