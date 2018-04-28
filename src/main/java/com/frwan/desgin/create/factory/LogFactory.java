package com.frwan.desgin.create.factory;

public class LogFactory {
    public ILog create(String str) {
        if ("EventLog".equalsIgnoreCase(str)) {
            return new EventLog();
        } else if ("FileLog".equalsIgnoreCase(str)) {
            return new FileLog();
        }
        return null;
    }
}
