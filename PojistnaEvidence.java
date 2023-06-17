import java.util.ArrayList;
import java.util.List;

public class PojistnaEvidence {
    private List<Pojisteny> seznamPojistenych;

    public PojistnaEvidence() {
        seznamPojistenych = new ArrayList<>();
    }

    public void pridatPojisteneho(Pojisteny pojisteny) {
        seznamPojistenych.add(pojisteny);
    }

    public List<Pojisteny> getSeznamPojistenych() {
        return seznamPojistenych;
    }

    public Pojisteny vyhledatPojisteneho(String jmenoPrijmeni) {
        for (Pojisteny pojisteny : seznamPojistenych) {
            if (pojisteny.getJmenoPrijmeni().equalsIgnoreCase(jmenoPrijmeni)) {
                return pojisteny;
            }
        }
        return null;
    }
}
