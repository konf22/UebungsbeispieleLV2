public class WinterreifenpflichtDemo {

    /**
     * Schreiben Sie eine statische Methode zur Ermittlung,
     * ob Winterreifen verwendet werden sollten
     * <p>
     * Winterreifen sollten verwendet werden:
     * -> Temperatur < 10°C und rutschige Fahrbahn
     * -> Temperatur < 4°C
     *
     * @param args Programmargumente (nicht genutzt)
     */
    public static void main(String[] args) {
        boolean winterreifenPflicht = isWinterreifenPflicht(9, true);
        printResult(winterreifenPflicht);

        printResult(isWinterreifenPflicht(9, false));
        printResult(isWinterreifenPflicht(11, true));
        printResult(isWinterreifenPflicht(3, false));
    }

    public static boolean isWinterreifenPflicht(int temperatur, boolean rutschigeFahrbahn) {
        if (temperatur < 4) {
            return true; // hier wird true zurückgegeben und aus der methode ausgestiegen (danach wird nichts mehr ausgewertet)
        }

        if (temperatur < 10 && rutschigeFahrbahn) {
            return true; // hier wird true zurückgegeben und aus der methode ausgestiegen (danach wird nichts mehr ausgewertet)
        }

        return false; // die else-Bedingung

        // kurzschreibweise
//        return temperatur < 4 || temperatur < 10 && rutschigeFahrbahn;
    }

    public static void printResult(boolean isWrPflicht) {
        if (isWrPflicht) {
            System.out.println("Bitte Winterreifen verwenden");
        } else {
            System.out.println("Winterreifen sind nicht erforderlich");
        }
    }
}
