public class Studio {

    private String nume;
    private Film[] filme;

    public Studio(String nume, Film[] filme) {
        this.nume = nume;
        this.filme = filme;
    }

    public String getNume() {
        return nume;
    }

    public Film[] getFilme() {
        return filme;
    }

    public int howManyMoviesPerStudio() {

        return this.filme.length;
    }

    public boolean isActorPlaying(String actorName) {
        for (int i = 0; i < filme.length; i++) {
            for (int j = 0; j < filme[i].getActori().length; j++){
                if(filme[i].actorSpecific(j).getNume().equals(actorName)){
                    return true;
                }
            }
        }
        return false;
    }

    public Film filmSpecific(int i) {
        return filme[i];
    }
}
