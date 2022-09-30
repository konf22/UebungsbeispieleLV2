public class NotenDemo {

    /**
     * Schreiben Sie eine statische Methode zur Ermittlung von Notennamen
     * anhand eines Notenschlüssels
     * <p>
     * Notenschlüssel:
     * >=90 -> Sehr Gut
     * 78-89 -> Gut
     * 65-77 -> Befriedigend
     * 51-64 -> Genügend
     * <=50 -> Nicht Genügend
     *
     * @param args Programmargumente (nicht genutzt)
     */
    public static void main(String[] args) {
        int punkte = 92;
        System.out.println("Die Note für " + punkte + " = " + getNotentext(punkte));

        punkte = 78;
        System.out.println("Die Note für " + punkte + " = " + getNotentext(punkte));

        punkte = 77;
        System.out.println("Die Note für " + punkte + " = " + getNotentext(punkte));

        punkte = 51;
        System.out.println("Die Note für " + punkte + " = " + getNotentext(punkte));

        punkte = 44;
        System.out.println("Die Note für " + punkte + " = " + getNotentext(punkte));
    }

    public static String getNotentext(int punkte) {
        String notenText;

        if (punkte >= 90) {
            notenText = "Sehr Gut";
        } else if (punkte >= 78) {
            notenText = "Gut";
        } else if (punkte >= 65) {
            notenText = "Befriedigend";
        } else if (punkte >= 51) {
            notenText = "Genügend";
        } else {
            notenText = "Nicht Genügend";
        }

        return notenText;
    }
}
