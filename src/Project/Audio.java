package Project;

public class Audio extends ElementoMultimediale implements Riproducibile {
     private int volume;
     private int durata;


     public Audio(String titolo ,int durata, int volume) {
         super(titolo);
         this.volume = volume;
         this.durata = durata;
     }

     @Override
    public void play() {

    }

}
