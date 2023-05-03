// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

       /*
        //Initializez obiectul prin care am capabilitatea sa citesc de la tastatura
        Scanner scanner = new Scanner(System.in);
        Scanner scannerPrenume = new Scanner(System.in);

        //Afisesz un mesaj pentru cererea textului de la tastatura
        //Se va introduce textul cerut dupa care se apasa tasta Enter
        System.out.print("Introduceti numele dumneavoastra: ");

        //Linia de cod care va citi propriuzis textul de la tastatura
        //Definesc variable de tip String(sir de caractere) unde se va afisa textul introdus
        String numelePersoanei = scanner.nextLine();

        //Afisez numele persoanei introdus de la tastatura
//        System.out.println("Numele introdus este: " + numelePersoanei);
        System.out.print("Introduceti prenumele dumneavoastra: ");
        String prenumelePersoanei = scanner.nextLine();
        System.out.println("Numele tau este este: " + prenumelePersoanei +" "+ numelePersoanei);




//        System.out.println("asadasd");
//        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
//        System.out.println("Enter username");
//        String userName = myObj.nextLine();  // Read user input
//        System.out.println("Username is: " + userName);  // Output user input


        */
        Scanner numberInputScanner = new Scanner(System.in);
        String numberInput = numberInputScanner.nextLine();
//        String numberInput = Scanner.nextLine();
        int userNumber = Integer.parseInt(numberInput);

//        int userNumber = 0;
        for (int i = 1; i <= userNumber; i ++){
            printRow(i, userNumber);
        }
    }

    public static void printRow(int rowNumber, int rowLength){
        System.out.print(rowNumber + "  //  ");
        for (int i = 1; i <= rowLength; i++){
            System.out.print("* ");
        }
        System.out.println("");
    }
}
