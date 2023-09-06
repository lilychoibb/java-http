package org.apache.catalina;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Session {

    private final String id;
    private final Map<String, Object> values = new ConcurrentHashMap<>();

    public Session(final String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public Object getAttribute(final String key) {
        return values.get(key);
    }

    public void setAttribute(final String key, final Object value) {
        values.put(key, value);
    }

    public void removeAttribute(final String key) {
        values.remove(key);
    }
}
