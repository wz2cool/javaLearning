package com.frwan.desgin.action.mediator;

import com.sun.org.apache.xpath.internal.functions.FuncSubstring;

public class Participant {
    private String name;
    private AbstractChartroom chartroom;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AbstractChartroom getChartroom() {
        return chartroom;
    }

    public void setChartroom(AbstractChartroom chartroom) {
        this.chartroom = chartroom;
    }

    public Participant(String name) {
        this.name = name;
    }

    public void send(String to, String message) {
        this.chartroom.send(this.name, to, message);
    }

    public void receive(String from, String message) {
        System.out.println(String.format("%s to %s: '%s'", from, name, message));
    }
}
