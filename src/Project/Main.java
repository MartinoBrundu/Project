package Project;
import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ElementoMultimediale[] elementiMultimediali = new ElementoMultimediale[5] ;

        for( int i = 0 ; i<5 ; i++) {
            System.out.println("Scegli il tipo di elemento multimediale, numero" + (i+1));
            System.out.println("1:audio") ;
            System.out.println("2:video") ;
            System.out.println("3:immage") ;

            int choise = scanner.nextInt();
            scanner.nextLine();
            System.out.println("insert title");

            String nomeTitolo = scanner.nextLine();



            switch (choise) {
                case 1:
                    System.out.println("I stay here") ;

                    System.out.println("insert duration");
                    int audioDuration= scanner.nextInt();
                    System.out.println("choise the audio") ;
                    int volume = scanner.nextInt();
                    scanner.nextLine();
                    elementiMultimediali[i] = new Audio(nomeTitolo,audioDuration, volume);
                    break;

                case 2:
                    System.out.println("insert duration video");
                    int durationVideo= scanner.nextInt();
                    System.out.println("choise the audio ") ;
                    int volumeVideo = scanner.nextInt();
                    System.out.println("choise the brightness ") ;
                    int brightness = scanner.nextInt();
                    scanner.nextLine();
                    elementiMultimediali[i] = new Video(nomeTitolo, durationVideo, volumeVideo, brightness);
                    break;

                case 3 :
                    System.out.println("insert brightness image");
                    int brightnessImg = scanner.nextInt();
                    scanner.nextLine();
                    elementiMultimediali[i] = new Immage(nomeTitolo,brightnessImg);
                    break;

                default:
                    System.out.println("Error") ;
            }
        }
        System.out.println("objects creates" + Arrays.toString(elementiMultimediali));
        int choiseVoice;
        do {
            System.out.println("che vuoi fare?");

            System.out.println(" clicca un tasto da 1 a 5 e fai partire un elemento multimediale");
            System.out.println(" digita 6 se vuoi modificare il volume di un elemento ");
            System.out.println(" digita 7 se vuoi modificare la luminosità di un elemento");
            System.out.println("digita 8  per visualizzare tutti gli elementi");
            System.out.println("digita 0 per uscire dal programma");

            choiseVoice = scanner.nextInt();

            if (choiseVoice >= 1 && choiseVoice <= 5) {
                elementiMultimediali[choiseVoice - 1].run();
            } else if (choiseVoice == 6) {
                System.out.println("scegli l'elemento di cui vuoi modificare il volume tra 1 e 5");
                int modificareVolume = scanner.nextInt();
                if (modificareVolume >= 1 && modificareVolume <= 5) {
                    ElementoMultimediale elemento = elementiMultimediali[modificareVolume - 1];
                    if (elemento instanceof Audio) {
                        Audio audio = (Audio) elemento;
                        System.out.println("il volume attuale è: " + audio.getVolume());
                        System.out.println("inserisci il nuovo volume");
                        int newVol = scanner.nextInt();
                        audio.setVolume(newVol);
                        System.out.println("il volume attuale è " + audio.getVolume());
                    } else if (elemento instanceof Video) {
                        Video video = (Video) elemento;
                        System.out.println("il volume attuale è: " + video.getVolume());
                        System.out.println("inserisci il nuovo volume");
                        int nuovoV = scanner.nextInt();
                        video.setVolume(nuovoV);
                        System.out.println("il volume attuale è " + video.getVolume());
                    } else {
                        System.out.println("Emily, Hai scelto un immagine");
                    }}
            } else if (choiseVoice == 7) {
                System.out.println("scegli l'elemento di cui vuoi modificare la luminosità tra 1 e 5");
                int elementoModificareL = scanner.nextInt();
                if (elementoModificareL >= 1 && elementoModificareL <= 5) {
                    ElementoMultimediale elemento = elementiMultimediali[elementoModificareL - 1];

                    if (elemento instanceof Immage) {
                        Immage immagine = (Immage) elemento;
                        System.out.println("la luminosità attuale è: " + immagine.getBrightness());
                        System.out.println("inserisci la nuova luminosità");
                        int nuovoV = scanner.nextInt();
                        immagine.setLuminosita(nuovoV);
                        System.out.println("la luminosità attuale è  " + immagine.getBrightness());
                    } else {
                        System.out.println("Emily, Hai scelto un audio");
                    }
                }
            } else if (choiseVoice == 8) {
                System.out.println("Ecco tutti gli elementi che hai creato");
                for (int i = 0; i < elementiMultimediali.length; i++) {
                    if (elementiMultimediali[i] != null) {
                        System.out.println(elementiMultimediali[i]);

                    }
                }
            }

        } while (choiseVoice != 0);
        scanner.close();
    }
}




