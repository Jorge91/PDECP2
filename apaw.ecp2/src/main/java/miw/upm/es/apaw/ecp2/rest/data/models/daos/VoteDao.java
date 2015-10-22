package miw.upm.es.apaw.ecp2.rest.data.models.daos;

import java.util.List;

import miw.upm.es.apaw.ecp2.rest.business.models.entities.Theme;
import miw.upm.es.apaw.ecp2.rest.business.models.entities.Vote;

public interface VoteDao extends GenericDao<Vote, Integer> {

	List<Vote> getVoteByTheme(Theme theme);

}
