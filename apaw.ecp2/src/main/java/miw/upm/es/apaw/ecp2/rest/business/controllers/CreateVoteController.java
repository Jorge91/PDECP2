package miw.upm.es.apaw.ecp2.rest.business.controllers;

import miw.upm.es.apaw.ecp2.rest.business.models.entities.Theme;
import miw.upm.es.apaw.ecp2.rest.business.models.entities.Vote;
import miw.upm.es.apaw.ecp2.rest.business.views.TransferVote;
import miw.upm.es.apaw.ecp2.rest.data.models.daos.DaoFactory;

public class CreateVoteController {

	public void addVote(TransferVote transferVote) {
		Theme theme = DaoFactory.getFactory().getThemeDao().getThemeByName(transferVote.getThemeToVote());
		DaoFactory.getFactory().getVoteDao().create(
				new Vote(DaoFactory.getFactory().getVoteDao().findAll().size() + 1, transferVote.getVote(), theme));
	}

}
