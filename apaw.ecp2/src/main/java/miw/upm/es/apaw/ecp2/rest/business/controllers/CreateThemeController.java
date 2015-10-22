package miw.upm.es.apaw.ecp2.rest.business.controllers;

import miw.upm.es.apaw.ecp2.rest.business.models.entities.Theme;
import miw.upm.es.apaw.ecp2.rest.business.views.TransferTheme;
import miw.upm.es.apaw.ecp2.rest.data.models.daos.DaoFactory;

public class CreateThemeController {

	public void addTheme(TransferTheme theme) {
		DaoFactory.getFactory().getThemeDao().create(
				new Theme((int) DaoFactory.getFactory().getThemeDao().findAll().size() + 1,
				theme.getTheme()));
	}

	
}