import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner unos = new Scanner(System.in);

        System.out.print("Unesi svoje ime: ");
        String ime = unos.nextLine();

        System.out.print("Koliko imas godina? ");
        int godine = unos.nextInt();

        System.out.println("----------------------------");
        System.out.println("Ime: " + ime);
        System.out.println("Godine: " + godine);

        if (godine < 13) {
            System.out.println("Status: Dijete si.");
        }
        else if (godine < 18) {
            System.out.println("Status: Tinejdzerka si.");
        }
        else if (godine < 30) {
            System.out.println("Status: Mlada odrasla osoba.");
        }
        else {
            System.out.println("Status: Odrasla si osoba.");
        }

        System.out.println("----------------------------");
        System.out.println("Hvala ti sto koristis moju aplikaciju ❤️");
    }
}