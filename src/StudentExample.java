import java.util.Scanner;

public class StudentExample {
    public static void main(String[] args) {

        System.out.println("Intrare in program ...");

        // creare obiect clasa Scanner
        Scanner scan = new Scanner(System.in);

        System.out.print("Introducere facultate (Matematica / Informatica): ");
        String raspunsUtilizator = scan.next();

        if (raspunsUtilizator.equalsIgnoreCase("Matematica") ||
        raspunsUtilizator.equalsIgnoreCase("Informatica")) {
            System.out.println("A fost aleasa facultatea " + raspunsUtilizator + ".");
            System.out.print("Doriti sa introduceti studenti noi? (Da / Nu): ");
            String raspunsUtilizator2 = scan.next();
            if (raspunsUtilizator2.equalsIgnoreCase("Da")) {
                System.out.print("Creati numele grupei noi: ");
            } else if ( raspunsUtilizator2.equalsIgnoreCase("Nu")){
                System.out.println("La revedere!");
            } else {
                System.out.println("Ati gresit ceva. Nu avem asa facultate la Universitatea noastra.");

            }


        } else {
            System.out.println("Ati gresit ceva. Nu avem asa facultate la Universitatea noastra.");
        }

        System.out.println("Iesire din program ...");

    }
}
