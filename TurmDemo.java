public class TurmDemo {

    /**
     * Schreiben Sie zwei while-Schleifen, welche jeweils von 2 bis
     * einschließlich 9 laufen sollen.
     * Multiplizieren bzw. Dividieren Sie jeweils das Ergebnis aus dem
     * Durchlauf davor mit dem aktuellen Wert des Schleifendurchlaufs
     * <p>
     * 2 * 2 = 4
     * 4 * 3 = 12
     * 12 * 4 = 48 usw.
     *
     * @param args no params needed
     */
    public static void main(String[] args) {
        int i = 2;
        int tmp = i;
        int result;

        while (i <= 9) {
            result = tmp * i;
            System.out.println(tmp + " * " + i + " = " + result);
            tmp = result;
            i++;
        }

        // now, i == 10!!
        // therefore, reset i to 2

        i = 2;
        while (i <= 9) {
            result = tmp / i;
            System.out.println(tmp + " / " + i + " = " + result);
            tmp = result;
            i++;
        }
    }
}
