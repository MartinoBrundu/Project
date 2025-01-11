package Project;

public class Video extends ElementoMultimediale implements Riproducibile, Brightness, Volume {
    private int brightness;
    private int  duration;
    private int vol ;

    public Video( String titolo, int brightness, int duration, int vol ) {
      super(titolo);
       this.brightness = brightness ;
       this.duration = duration;
       this.vol = vol ;
   }
   @Override
   public void raiseVol(){
        vol++;
    }
    @Override
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
        for(int i = 0 ; i<duration;i++) {
            System.out.println(titolo + "" + "!" .repeat(vol)+""+"*".repeat(brightness));
        }



    }

    @Override
    public void run() {

    }
}
