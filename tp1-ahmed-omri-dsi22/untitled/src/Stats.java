import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Stats {

    public static float calculerMoyenne(List<? extends Statisticable> list) {
        if (list.isEmpty()) return 0;

        float somme = 0;
        for (Statisticable obj : list) {
            somme += obj.getValue();
        }
        return somme / list.size();
    }
    public static float meilleureNote(ArrayList<Etudiant> etudiant) {
        return Collections.max(etudiant.getNotes(), Comparator.comparing(Note::getValeur)).getValeur();
    }

    public static float moisNote(Etudiant etudiant) {
        return Collections.min(etudiant.getNotes(), Comparator.comparing(Note::getValeur)).getValeur();
    }
}
