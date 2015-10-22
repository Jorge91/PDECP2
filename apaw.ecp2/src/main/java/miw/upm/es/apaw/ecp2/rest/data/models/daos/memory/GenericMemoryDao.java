package miw.upm.es.apaw.ecp2.rest.data.models.daos.memory;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import miw.upm.es.apaw.ecp2.rest.data.models.daos.GenericDao;

public abstract class GenericMemoryDao<T, ID> implements GenericDao<T, ID> {

    private Map<ID, T> map;

    protected void setMap(Map<ID, T> map) {
        this.map = map;
    }

    public void create(T entity) {
        map.put(this.getId(entity), entity);
    }

    public T read(ID id) {
        return map.get(id);
    }

    public void update(T entity) {
        if (map.containsKey(this.getId(entity))) {
            map.put(this.getId(entity), entity);
        }
    }

    public void deleteById(ID id) {
        map.remove(id);
    }

    public List<T> findAll() {
        return new ArrayList<T>(map.values());
    }

    protected abstract ID getId(T entity);

}
