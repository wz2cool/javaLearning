package com.frwan.desgin.structural.decorator;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;

public class DecoratorTest {

    public static void main(String[] args) {
        // Has-A, Is-A
        DatabaseLog log = new DatabaseLog();
        LogErrorDecorator logErrorDecorator = new LogErrorDecorator(log);
        LogPriorityDecorator logPriorityDecorator = new LogPriorityDecorator(logErrorDecorator);
        logPriorityDecorator.write();

        // java 源码
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new InputStream() {
            @Override
            public int read() throws IOException {
                return 0;
            }
        });

        DataInputStream dataInputStream = new DataInputStream(bufferedInputStream);
    }
}
