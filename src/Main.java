import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


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
                    break;

                case 2:
                    System.out.println("insert duration video");
                    int durationVideo= scanner.nextInt();
                    System.out.println("choise the audio ") ;
                    int volumeVideo = scanner.nextInt();
                    System.out.println("choise the brightness ") ;
                    int brightness = scanner.nextInt();
                    scanner.nextLine();
                    break;
            }
        }
    }


}