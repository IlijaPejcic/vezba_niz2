public class Main {
    public static void main(String[] args) {

        String[] tipovi = {"bicikl", "automobil", "mobilni telefon"};
        String[] nazivi = {"BMX", "Renault 4", "I-Phone"};
        double[] cene = {150.55, 100, 500};

        for (int i = 0; i < tipovi.length; i++) {
            System.out.println(nazivi[i] + " je tipa " + tipovi[i] + " i košta " + cene[i] + ".");
        }
    }
}