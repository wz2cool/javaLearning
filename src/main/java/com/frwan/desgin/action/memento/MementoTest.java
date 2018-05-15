package com.frwan.desgin.action.memento;

public class MementoTest {
    public static void main(String[] args) {
        SalesProspect salesProspect = new SalesProspect();
        salesProspect.setName("Noel van Halen");
        salesProspect.setPhone("(412) 256-0990");
        salesProspect.setBudget(25000.0);

        ProspectMemory m = new ProspectMemory();
        m.setMemento(salesProspect.saveMemento());

        //  Continue changing originator,
        salesProspect.setName("Leo Welch");
        salesProspect.setPhone("(310) 209-7111");
        salesProspect.setBudget(1000000.0);
        // Restore saved state
        salesProspect.restoreMemento(m.getMemento());

        // java 源码
        // java.util.Date
    }
}
