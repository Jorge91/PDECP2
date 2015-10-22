package miw.upm.es.apaw.ecp2.rest.data.models.daos.memory;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import miw.upm.es.apaw.ecp2.rest.business.models.entities.Theme;
import miw.upm.es.apaw.ecp2.rest.data.models.daos.ThemeDao;

public class ThemeMemoryDao extends GenericMemoryDao<Theme, Integer> implements ThemeDao {

    public ThemeMemoryDao() {
        this.setMap(new HashMap<Integer, Theme>());
    }

    @Override
    protected Integer getId(Theme entity) {
        return entity.getId();
    }

    public Theme getThemeByName(String themeName) {
    	List<Theme> allThemes = this.findAll();
    	Theme theme = null;
    	for (int i = 0; i < allThemes.size(); i++) {
            if (themeName.equals(allThemes.get(i).getName())) {
                theme =  allThemes.get(i);
            }
        }
        return theme;
    }


    public List<String> getThemes() {
        ArrayList<String> themes = new ArrayList<String>();
        List<Theme> allThemes = this.findAll();
        for (int i = 0; i < allThemes.size(); i++) {
        	themes.add(allThemes.get(i).getName());
        }
        return themes;
    }

}
