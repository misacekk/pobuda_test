public class Uzivatel {
    private String jmeno;
    private String prijmeni;
    private String datumNarozeni;
    private String email;
    private String heslo;

    public Uzivatel(String jmeno, String prijmeni, String datumNarozeni, String email, String heslo) {
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.datumNarozeni = datumNarozeni;
        this.email = email;
        this.heslo = heslo;
    }

    public void upravaPrijemni() {
        StringBuilder sb = new StringBuilder("j5a.n");
        for (int i = 0; i < sb.length(); i++) {
            if (Character.isDigit(sb.charAt(i)) || Character.isWhitespace(sb.charAt(i)) || sb.charAt(i) == '.') {
                sb.deleteCharAt(i);
                sb.setCharAt(0, Character.toUpperCase(sb.charAt(0)));
            }
        }
        System.out.println(sb.toString());
    }

    public void generaceEmail() {
        StringBuilder sb = new StringBuilder("Jaroslav Novák");
        String vysledek = "";
        for (int i = 0; i < sb.length(); i++) {
            if (Character.isWhitespace(sb.charAt(i))) {
                sb.deleteCharAt(i);
                sb.append("187@firma.cz");
                vysledek = sb.toString();
            }
        }
        System.out.println(vysledek.toLowerCase());
    }

    public void upravaJmena() {
        StringBuilder sb = new StringBuilder("Jan Pavel Kryštof");
        for (int i = 0; i < sb.length(); i++) {
            if (Character.isDigit(sb.charAt(i)) || Character.isWhitespace(sb.charAt(i)) || sb.charAt(i) == '.') {
                sb.deleteCharAt(i);
                sb.setCharAt(0, Character.toUpperCase(sb.charAt(0)));
            }
        }
        System.out.println(sb.toString());
    }

    public void zastreniEmail() {
        StringBuilder sb = new StringBuilder("belsky.gasos-ro.cz");
        sb.replace(4, 14, "************");
        System.out.println(sb.toString());
    }

    public void kontrolaEmail() {
        StringBuilder sb = new StringBuilder("novjar187@firma.cz");
        Boolean vysledek = false;
        for (int i = 0; i < sb.length(); i++) {
            if (sb.equals("@") || sb.equals(".")) {
                vysledek = true;
            } else {
                vysledek = false;
            }
        }
        System.out.println(vysledek);
    }

    public String getJmeno() {
        return jmeno;
    }

    public String getPrijmeni() {
        return prijmeni;
    }

    public String getDatumNarozeni() {
        return datumNarozeni;
    }

    public String getEmail() {
        return email;
    }

    public String getHeslo() {
        return heslo;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public void setPrijmeni(String prijmeni) {
        this.prijmeni = prijmeni;
    }

    public void setDatumNarozeni(String datumNarozeni) {
        this.datumNarozeni = datumNarozeni;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setHeslo(String heslo) {
        this.heslo = heslo;
    }
}
