import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PojistnaEvidence evidence = new PojistnaEvidence();
        Scanner scanner = new Scanner(System.in);

        boolean running = true;
        while (running) {
            System.out.println("========== Pojistna Evidence ==========");
            System.out.println("1. Vytvořit pojištěného");
            System.out.println("2. Zobrazit seznam všech pojištěných");
            System.out.println("3. Vyhledat pojištěného");
            System.out.println("4. Ukončit program");
            System.out.println("========================================");
            System.out.print("Zadejte volbu: ");
            int volba = scanner.nextInt();
            scanner.nextLine();

            switch (volba) {
                case 1:
                    vytvoritPojisteneho(scanner, evidence);
                    break;
                case 2:
                    zobrazitSeznamPojistenych(evidence);
                    break;
                case 3:
                    vyhledatPojisteneho(scanner, evidence);
                    break;
                case 4:
                    running = false;
                    break;
                default:
                    System.out.println("Neplatná volba. Zadejte číslo od 1 do 4.");
            }
        }
    }

    private static void vytvoritPojisteneho(Scanner scanner, PojistnaEvidence evidence) {
        System.out.println("========== Vytvoření pojištěného ==========");
        System.out.print("Zadejte jméno: ");
        String jmeno = scanner.nextLine();
        System.out.print("Zadejte příjmení: ");
        String prijmeni = scanner.nextLine();
        System.out.print("Zadejte věk: ");
        int vek = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Zadejte telefonní číslo: ");
        String telefon = scanner.nextLine();

        Pojisteny pojisteny = new Pojisteny(jmeno, prijmeni, vek, telefon);
        evidence.pridatPojisteneho(pojisteny);

        System.out.println("Pojištěný " + jmeno + " " + prijmeni + " byl úspěšně vytvořen.");
        System.out.println("============================================");
    }

    private static void zobrazitSeznamPojistenych(PojistnaEvidence evidence) {
        System.out.println("======== Seznam všech pojištěných ========");
        List<Pojisteny> seznamPojistenych = evidence.getSeznamPojistenych();
        for (Pojisteny pojisteny : seznamPojistenych) {
            System.out.println(pojisteny);
        }
        System.out.println("==========================================");
    }

    private static void vyhledatPojisteneho(Scanner scanner, PojistnaEvidence evidence) {
        System.out.println("========= Vyhledávání pojištěného =========");
        System.out.print("Zadejte jméno a příjmení: ");
        String hledaneJmeno = scanner.nextLine();

        Pojisteny nalezenyPojisteny = evidence.vyhledatPojisteneho(hledaneJmeno);
        if (nalezenyPojisteny != null) {
            System.out.println(nalezenyPojisteny);
            System.out.println("==========================================");
        } else {
            System.out.println("Pojištěný s jménem/příjmením " + hledaneJmeno + " nebyl nalezen.");
            System.out.println("==========================================");
        }
    }
}


