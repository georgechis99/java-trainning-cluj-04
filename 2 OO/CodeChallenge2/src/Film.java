public class Film {

    private int anAparitie;
    private String nume;
    private Actor[] actori;

    public Film(int anAparitie, String nume, Actor[] actori) {
        this.anAparitie = anAparitie;
        this.nume = nume;
        this.actori = actori;
    }

    public Actor[] getActori() {
        return actori;
    }

    public String getNume() {
        return nume;
    }

    public Actor actorSpecific(int i) {
        return actori[i];
    }

    public boolean isActorWithAgeAbove50Playing() {
        boolean check = false;
        for (int i = 0; i < actori.length; i++) {
            if (actorSpecific(i).getVarsta() > 50) {
                check = true;
            }
        }
        if (check) {
            return true;
        } else {
            return false;
        }
    }
}
