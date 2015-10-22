package miw.upm.es.apaw.ecp2.rest.business.models.entities;
public class Vote {

    private int id;
    private int vote;
    private Theme theme;

    public Vote() {
    }

    public Vote(int id, int vote, Theme theme) {
        this.id = id;
        this.vote = vote;
        this.theme = theme;
    }

    public int getId() {
        return id;
    }

    public int getVote() {
        return vote;
    }

    public Theme getTheme() {
        return theme;
    }

}
