package miw.upm.es.apaw.ecp2.rest.business.views;

public class TransferVote {

	private String themeToVote;
	int vote;

	public TransferVote(String themeToVote, int vote) {
		super();
		this.themeToVote = themeToVote;
		this.vote = vote;
	}

	public String getThemeToVote() {
		return themeToVote;
	}

	public int getVote() {
		return vote;
	}


	
}
