package com.frwan.desgin.action.mediator;

public abstract class AbstractChartroom {
    public abstract void register(Participant participant);

    public abstract void send(String from, String to, String message);
}
