import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Uzivatel uzivatel = new Uzivatel("j5a. n", "Pavel", "21.2.2009", "belsky@gasos-ro.cz", "kgajgoajga2252");

        //Úkol - Příjmení
            /*StringBuilder sb = new StringBuilder("j5a.n");
            for (int i = 0; i < sb.length(); i++) {
                if (Character.isDigit(sb.charAt(i)) || Character.isWhitespace(sb.charAt(i)) || sb.charAt(i) == '.') {
                    sb.deleteCharAt(i);
                    sb.setCharAt(0, Character.toUpperCase(sb.charAt(0)));
                }
            }
            System.out.println(sb.toString());*/


        //Úkol - Náhodná adresa
            /*Random random = new Random();
        StringBuilder sb = new StringBuilder("Jaroslav Novák");
        String vysledek = "";
        int randomNumber = random. nextInt(900) + 100;
        for (int i = 0; i < sb.length(); i++) {
            if (Character.isWhitespace(sb.charAt(i))) {
                sb.deleteCharAt(i);
                sb.append(randomNumber + "@firma.cz");
                vysledek = sb.toString();
            }
        }
        System.out.println(vysledek.toLowerCase());*/


        //Úkol - Jméno
            /*StringBuilder sb = new StringBuilder("Jan Pavel Kryštof");
            for (int i = 0; i < sb.length(); i++) {
                if (Character.isDigit(sb.charAt(i)) || Character.isWhitespace(sb.charAt(i)) || sb.charAt(i) == '.') {
                    sb.deleteCharAt(i);
                    sb.setCharAt(0, Character.toUpperCase(sb.charAt(0)));
                }
            }
            System.out.println(sb.toString());*/


        //Úkol - Zastření Emailu
            /*StringBuilder sb = new StringBuilder("belsky.gasos-ro.cz");
            sb.replace(4, 14, "************");
            System.out.println(sb.toString());*/


        //Úkol - Je to Email?
            /*StringBuilder sb = new StringBuilder("novjar187@firma.cz");
            Boolean vysledek = false;
            for (int i = 0; i < sb.length(); i++) {
                if (sb.equals("@") || sb.equals(".")) {
                    vysledek = true;
                } else {
                    vysledek = false;
                }
            }
            System.out.println(vysledek);*/

        //Úkol - Ultra náhodné heslo
        /*StringBuilder sb = new StringBuilder("");
        sb.append("nahodneHeslo_123cz.");
        System.out.println(sb.toString());*/

    }
}