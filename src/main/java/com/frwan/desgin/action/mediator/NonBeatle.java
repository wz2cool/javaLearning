package com.frwan.desgin.action.mediator;

public class NonBeatle extends Participant {
    public NonBeatle(String name) {
        super(name);
    }

    @Override
    public void receive(String from, String message) {
        System.out.println("To a non-Beatle");
        super.receive(from, message);
    }
}
