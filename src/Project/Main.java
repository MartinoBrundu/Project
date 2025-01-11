package Project;

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
    }


}