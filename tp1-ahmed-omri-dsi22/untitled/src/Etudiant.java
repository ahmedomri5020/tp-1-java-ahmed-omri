import java.util.ArrayList;

public class Etudiant implements Statisticable, Comparable<Etudiant> {
    private String matricule;
    private String nom;
    private ArrayList<Note> notes;

    public Etudiant(String matricule, String nom) {
        this.matricule = matricule;
        this.nom = nom;
        this.notes = new ArrayList<>();
    }

    public String getMatricule() {
        return matricule;
    }

    public void addNote(String intitule, float valeur) {
        this.notes.add(new Note(intitule, valeur));
    }

    public float getValue() {
        float sum = 0;
        for (Note note : notes) {
            sum += note.getValeur();
        }
        return notes.isEmpty() ? 0 : sum / notes.size();
    }
    public ArrayList<Note> getNotes() {
        return notes;
    }

    @Override
    public int compareTo(Etudiant o) {
        return this.matricule.compareTo(o.matricule);
    }

    public String getNom() {
        return nom;
    }

}
