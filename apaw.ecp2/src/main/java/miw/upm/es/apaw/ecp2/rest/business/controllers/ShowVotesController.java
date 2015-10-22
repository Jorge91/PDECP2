package miw.upm.es.apaw.ecp2.rest.business.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import miw.upm.es.apaw.ecp2.rest.business.models.entities.Vote;
import miw.upm.es.apaw.ecp2.rest.business.views.TransferTheme;
import miw.upm.es.apaw.ecp2.rest.data.models.daos.DaoFactory;

public class ShowVotesController {

	public List<String> averageVotesInTheme(String themeName) {
		List<Vote> totalVotes = DaoFactory.getFactory().getVoteDao()
				.getVoteByTheme(DaoFactory.getFactory().getThemeDao().getThemeByName(themeName));
		float avg = 0;
		String avgStr;
		if (totalVotes.size() > 0) {
			for (int i = 0; i < totalVotes.size(); i++) {
				avg += totalVotes.get(i).getVote();
			}
			avgStr = Float.toString(avg / totalVotes.size());
		} else {
			avgStr = "NaN";
		}
		return Arrays.asList("themeName=" + themeName, "average=" + avgStr);

	}

	public TransferTheme getVotes() {
		List<String> list;
		List<String> themeList = DaoFactory.getFactory().getThemeDao().getThemes();
		List<String> strList = new ArrayList<String>();
		
		for (int i = 0; i < themeList.size(); i++) {
			list = this.averageVotesInTheme(themeList.get(i));
			strList.add("ThemeTransfer " + list.toString());
		}

		TransferTheme transferTheme = new TransferTheme();
		transferTheme.setDetailedTheme(strList);

		return transferTheme;

	}


}
