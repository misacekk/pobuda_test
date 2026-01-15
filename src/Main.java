public class Main {
    public static void main(String[] args) {

        Uzivatel uzivatel = new Uzivatel();

        /*StringBuilder sb = new StringBuilder("novjar187@firma.cz");
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == '@' && sb.charAt(i) == '.') {
                System.out.println("je to mail");
            }else {
                System.out.println("neni to mail");
            }*/
        StringBuilder sb = new StringBuilder("j5a. n");
        for (int i = 0; i < sb.length(); i++) {
            if (Character.isDigit(sb.charAt(i))) {
                sb.deleteCharAt(i);
            } else if (sb.charAt(i) == '.') {
                sb.deleteCharAt(i);
            } else if (Character.isWhitespace(sb.charAt(i))) {
                sb.deleteCharAt(i);
            }
        }
        System.out.println(sb.toString());


    }
}