import java.util.LinkedList;

public class Warteschlange {
    private LinkedList<Auto> warteschlange;
    private int maxAnzahlAutos;

    public Warteschlange(int maxAnzahlAutos) {
        this.maxAnzahlAutos = maxAnzahlAutos;
        this.warteschlange = new LinkedList<>();
    }

    public void autoHinzufügen(Auto auto) {
        if (warteschlange.size() < maxAnzahlAutos) {
            warteschlange.addLast(auto);
        } else {
            System.out.println("Die Warteschlange ist voll.");
        }
    }

    public void autoVerlassen() {
        if (!warteschlange.isEmpty()) {
            warteschlange.removeFirst();
        } else {
            System.out.println("Die Warteschlange ist bereits leer.");
        }
    }

    public void alleAutosAufrücken() {
        for (int i = 0; i < warteschlange.size(); i++) {
            Auto auto = warteschlange.get(i);
            auto.setStatus("Aufrücken");
            auto.setÄnderung("Aufrücken");
        }
    }
}