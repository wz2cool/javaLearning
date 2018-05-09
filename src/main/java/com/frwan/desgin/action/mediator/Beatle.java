package com.frwan.desgin.action.mediator;

public class Beatle extends Participant {
    public Beatle(String name) {
        super(name);
    }

    @Override
    public void receive(String from, String message) {
        System.out.println("To a Beatle: ");
        super.receive(from, message);
    }
}
