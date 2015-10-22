package miw.upm.es.apaw.ecp2.web.presentation.presenters;

import miw.upm.es.apaw.ecp2.rest.business.controllers.CreateVoteController;
import miw.upm.es.apaw.ecp2.rest.business.controllers.ShowVotesController;
import miw.upm.es.apaw.ecp2.rest.business.views.TransferVote;
import miw.upm.es.apaw.ecp2.web.presentation.models.Model;

public class VotingPresenter {

	private String theme;
	private int value;

	public String process(Model model) {
		model.put("log", "Voting Page");
		model.put("themes", new ShowVotesController().getVotes().getDetailedTheme());
		return "VotingView";
	}

	public String voteTheme(Model model) {
		model.put("log", "Voting Page");
		
		TransferVote transferVote = new TransferVote(this.theme, this.value);

		CreateVoteController voteController = new CreateVoteController();
		voteController.addVote(transferVote);
		model.put("themes", new ShowVotesController().getVotes().getDetailedTheme());

		return "VotingView";
	}

	public String getTheme() {
		return theme;
	}

	public void setTheme(String theme) {
		this.theme = theme;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
}
