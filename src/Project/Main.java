package Project;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        for( int i = 0 ; i<5 ; i++) {
            System.out.println("Scegli il tipo di elemento multimediale, numero" + (i+1));
            System.out.println("1:audio") ;
            System.out.println("2:video") ;
            System.out.println("1:immage") ;

            int choise = scanner.nextInt();
            scanner.nextLine();
            System.out.println("insert title");

            int nomeTitolo = scanner.nextInt();
            scanner.nextLine();
        }
    }


}