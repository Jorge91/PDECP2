package miw.upm.es.apaw.ecp2.rest.data.models.daos.memory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import miw.upm.es.apaw.ecp2.rest.business.models.entities.Theme;
import miw.upm.es.apaw.ecp2.rest.business.models.entities.Vote;
import miw.upm.es.apaw.ecp2.rest.data.models.daos.VoteDao;

public class VoteMemoryDao extends GenericMemoryDao<Vote, Integer>implements VoteDao {

	public VoteMemoryDao() {
		this.setMap(new HashMap<Integer, Vote>());
	}

	protected Integer getId(Vote entity) {
		return entity.getId();
	}

	public List<Vote> getVoteByTheme(Theme theme) {
		List<Vote> votes = new ArrayList<Vote>();
		List<Vote> votesAll = this.findAll();
		
		for (int i = 0; i < votesAll.size(); i++) {
			if (theme.equals(votesAll.get(i).getTheme())) {
				votes.add(votesAll.get(i));
			}
		}
		return votes;
	}

}
