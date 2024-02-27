import java.util.ArrayList;
import java.util.Collections;
public class Main {
    public static void main(String[] args) {
        Etudiant etudiant1 = new Etudiant("E123", "Ahmed");
        Etudiant etudiant2 = new Etudiant("E124", "Zayd");

        etudiant1.addNote("Mathématiques", 15);
        etudiant1.addNote("Physique", 14);

        etudiant2.addNote("Mathématiques", 18);
        etudiant2.addNote("Physique", 17);

        ArrayList<Etudiant> etudiants = new ArrayList<>();
        etudiants.add(etudiant1);
        etudiants.add(etudiant2);

        System.out.println("Statistiques individuelles:");
        for (Etudiant e : etudiants) {
            System.out.println("Étudiant: " + e.getNom() + " - Moyenne: " + e.getValue() +
                    ", Meilleure note: " + Stats.meilleureNote(e) +
                    ", Pire note: " + Stats.moisNote(e));
        }

        System.out.println("\nStatistiques du groupe:");
        System.out.println("Moyenne du groupe: " + Stats.calculerMoyenne(etudiants));
        System.out.println("Meilleur étudiant: " + Stats.max(etudiants).getValue());
        System.out.println("Moins bon étudiant: " + Stats.min(etudiants).getValue());

        Collections.sort(etudiants);
        System.out.println("\nListe des étudiants triée par nom:");
        etudiants.forEach(e -> System.out.println(e.getMatricule() + " - " + e.getNom()));

        Collections.sort(etudiants, new CompareMoyenne());
        System.out.println("\nListe des étudiants triée par moyenne:");
        etudiants.forEach(e -> System.out.println(e.getNom() + " - Moyenne: " + e.getValue()));

        Collections.sort(etudiants, new CompareNom());
        System.out.println("\nListe des étudiants triée par nom:");
        etudiants.forEach(e -> System.out.println(e.getNom()));
    }
}
