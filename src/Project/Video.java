package Project;

public class Video extends ElementoMultimediale implements Riproducibile, Brightness {
    private int brightness;
    private int  duration;
    private int vol ;

    public Video( String titolo, int brightness, int duration, int vol ) {
      super(titolo);
       this.brightness = brightness ;
       this.duration = duration;
       this.vol = vol ;
   }

    public void raiseVol(){
        vol++;
    }
    public void lowerVol() {
        if (vol > 0) {
            vol--;
        }
    }

    @Override
    public void raiseBrightness(){
        brightness++;

    }

    public void lowerBrightness(){
        if (brightness>0) {
            brightness --;
        }

    }

    @Override
    public void play() {



    }
}
