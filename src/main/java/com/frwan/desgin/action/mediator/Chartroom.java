package com.frwan.desgin.action.mediator;

import java.util.HashMap;
import java.util.Map;

public class Chartroom extends AbstractChartroom {

    private final Map<String, Participant> participantMap = new HashMap<>();

    @Override
    public void register(Participant participant) {
        participant.setChartroom(this);
        this.participantMap.put(participant.getName(), participant);
    }

    @Override
    public void send(String from, String to, String message) {
        Participant pto = participantMap.get(to);
        if (pto != null) {
            pto.receive(from, message);
        }
    }
}
