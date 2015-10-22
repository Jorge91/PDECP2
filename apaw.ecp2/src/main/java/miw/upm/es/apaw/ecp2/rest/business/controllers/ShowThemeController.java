package miw.upm.es.apaw.ecp2.rest.business.controllers;

import miw.upm.es.apaw.ecp2.rest.business.views.TransferTheme;
import miw.upm.es.apaw.ecp2.rest.data.models.daos.DaoFactory;

public class ShowThemeController {

	public TransferTheme getListOfThemes() {
		TransferTheme themes = new TransferTheme();
		themes.setThemeList(DaoFactory.getFactory().getThemeDao().getThemes());
		return themes;
	}

}
