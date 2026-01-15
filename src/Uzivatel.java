public class Uzivatel {
    private String jmeno;
    private String prijmeni;
    private String datumNarozeni;
    private String email;
    private String heslo;

    public void upravaPrijemni(){
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
    public void zastreniEmail(){
        StringBuilder sb = new StringBuilder("belsky.gasos-ro.cz");
        sb.replace(4, 14, "************");
        System.out.println(sb.toString());
    }
}
