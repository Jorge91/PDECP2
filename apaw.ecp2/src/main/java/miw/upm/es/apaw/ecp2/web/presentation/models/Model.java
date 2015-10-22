package miw.upm.es.apaw.ecp2.web.presentation.models;
import java.util.HashMap;
import java.util.Map;

public class Model {

    private Map<String, Object> map = new HashMap<String, Object>();

    public void put(String key, Object value) {
        map.put(key, value);
    }

    public Object get(String key) {
        return map.get(key);
    }
}
