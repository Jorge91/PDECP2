package miw.upm.es.apaw.ecp2.rest.data.models.daos;

import java.util.List;

import miw.upm.es.apaw.ecp2.rest.business.models.entities.Theme;

public interface ThemeDao extends GenericDao<Theme, Integer> {

	Theme getThemeByName(String themeName);

	List<String> getThemes();

}
