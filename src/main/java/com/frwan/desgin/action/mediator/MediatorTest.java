package com.frwan.desgin.action.mediator;

public class MediatorTest {

    public static void main(String[] args) {
        System.out.println("============= Mediator test ===========");
        Chartroom chartroom = new Chartroom();
        Participant George = new Beatle("George");
        Participant Paul = new Beatle("Paul");
        Participant Ringo = new Beatle("Ringo");
        Participant John = new Beatle("John");
        Participant Yoko = new NonBeatle("Yoko");

        chartroom.register(George);
        chartroom.register(Paul);
        chartroom.register(Ringo);
        chartroom.register(John);
        chartroom.register(Yoko);
        // Chatting participants
        Yoko.send("John", "Hi John!");
        Paul.send("Ringo", "All you need islove");
        Ringo.send("George", "My sweet Lord");
        Paul.send("John", "Can't buy me love");
        John.send("Yoko", "My sweet love");
    }
}
