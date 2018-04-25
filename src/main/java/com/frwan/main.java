package com.frwan;

import com.frwan.concurrent.JoinTest;
import com.frwan.concurrent.SleepTest;
import com.frwan.concurrent.VolatileTest;
import com.frwan.concurrent.YieldTest;

public class main {
    public static void main(String[] args) throws Exception {
        // NotifyTest.producerCustomerDemo();

        VolatileTest.testVolatile();
    }
}
