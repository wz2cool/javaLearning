package com.frwan.desgin.structural.adapter;

public class LogAdapter {
    private Log databaseLog;
    private Log fileLog;

    public LogAdapter(Log databaseLog, Log fileLog) {
        this.databaseLog = databaseLog;
        this.fileLog = fileLog;
    }

    public void writeAll() {
        this.databaseLog.writeLog();
        this.fileLog.writeLog();
    }
}
