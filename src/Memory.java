public class Memory {

    public int[][] generateField(int n) {
        int[][] field = new int[n][n];
        int zufallszahlZeile = 0;
        int zufallszahlSpalte = 0;

        for (int i = 5; i < (n*n)+5; i++) {
            zufallszahlZeile = (int) (Math.random() * n);
            zufallszahlSpalte = (int) (Math.random() * n);

            field[zufallszahlZeile][zufallszahlSpalte] = i;
        }

        System.out.println(zufallszahlZeile);
        System.out.println(zufallszahlSpalte);

        return field;
    }

    public void showField(int[][] field) {
        for (int[] ints : field) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }
}
