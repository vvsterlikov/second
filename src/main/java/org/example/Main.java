package org.example;

import lombok.extern.slf4j.Slf4j;
import org.example.reactor.Server;

@Slf4j
public class Main {
    public static void main(String[] args) {
        Server s = new Server();
        s.start();
    }
}
