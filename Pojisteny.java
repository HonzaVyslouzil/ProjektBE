public class Pojisteny {
    private String jmeno;
    private String prijmeni;
    private int vek;
    private String telefon;

    public Pojisteny(String jmeno, String prijmeni, int vek, String telefon) {
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.vek = vek;
        this.telefon = telefon;
    }

    public String getJmenoPrijmeni() {
        return jmeno + " " + prijmeni;
    }

    @Override
    public String toString() {
        return "Jméno a příjmení: " + getJmenoPrijmeni() + ", Věk: " + vek + ", Telefon: " + telefon;
    }
}
