package miw.upm.es.apaw.ecp2.rest.data.models.daos.memory;

import miw.upm.es.apaw.ecp2.rest.data.models.daos.DaoFactory;
import miw.upm.es.apaw.ecp2.rest.data.models.daos.ThemeDao;
import miw.upm.es.apaw.ecp2.rest.data.models.daos.VoteDao;

public class DaoFactoryMemory extends DaoFactory {

    private ThemeDao themeDao;
    private VoteDao voteDao;

    public DaoFactoryMemory() {
    	
    }

    public ThemeDao getThemeDao() {
        if (this.themeDao == null) {
            this.themeDao = new ThemeMemoryDao();
        }
        return this.themeDao;
    }

    public VoteDao getVoteDao() {
        if (this.voteDao == null) {
            this.voteDao = new VoteMemoryDao();
        }
        return this.voteDao;
    }

}
