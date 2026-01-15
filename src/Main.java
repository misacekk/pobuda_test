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
            /*StringBuilder sb = new StringBuilder("Jaroslav Novák");
            String vysledek = "";
            for (int i = 0; i < sb.length(); i++) {
                if (Character.isWhitespace(sb.charAt(i))) {
                    sb.deleteCharAt(i);
                    sb.append("187@firma.cz");
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


        //Úkol - Zatření Emailu
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


    }
}