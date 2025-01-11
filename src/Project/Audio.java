package Project;

public class Audio extends ElementoMultimediale implements Riproducibile, Volume {
     private int vol;
     private int durata;


     public Audio(String titolo ,int durata, int vol) {
         super(titolo);
         this.vol = vol;
         this.durata = durata;
     }



    @Override
    public void raiseVol() {

            vol++;
        }


    @Override
    public void lowerVol() {
        if (vol > 0) {
            vol--;
        }


    }
    @Override
    public void play() {
         for(int i=0 ; i <durata;i++) {
          System.out.println(titolo + "" + "!".repeat(vol));
         }
    }

    @Override
    public void run() {
        play();
    }
}
