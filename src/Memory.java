public class Memory {

    public int[][] generateField(int n) {

        // prüft, ob n gerade ist
        if (n % 2 != 0) {
            System.out.println("n muss gerade sein.");
            System.exit(0);
        }

        // erzeugt das Spielfeld
        int[][] field = new int[n][n];

        // Variablen zur Speicherung der Positionen im Spielfeld
        int zufallszahlZeile = 0;
        int zufallszahlSpalte = 0;

        // Counter für die Zahlen der Spielfelder
        int numberInField = 5;

        // weist jedem Feld Wert zu
        // (n*n)/2 -> Anzahl der Felder durch 2, weil Felder paarweise besetzt werden
        for (int i = 0; i < (n*n)/2; i++) {

            // weist Feldern paarweise Werte >= 5 zu
            for (int j = 0; j < 2; j++) {

                // solange ein bereits belegtes Feld gefunden wird, wird ein freies gesucht
                while (field[zufallszahlZeile][zufallszahlSpalte] != 0) {
                    zufallszahlZeile = (int) (Math.random() * n);
                    zufallszahlSpalte = (int) (Math.random() * n);
                }

                // weist Feld den ermittelten Wert zu
                field[zufallszahlZeile][zufallszahlSpalte] = numberInField;

            }
            // erhöht den Counter für die Zahlenwerte um 1
            numberInField++;
        }

        // gibt das Spielfeld zurück
        return field;
    }

    // gibt das Spielfeld auf der Konsole aus
    public void showField(int[][] field) {
        for (int[] ints : field) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }
}
