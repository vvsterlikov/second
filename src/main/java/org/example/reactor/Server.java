package org.example.reactor;

import lombok.extern.slf4j.Slf4j;
import reactor.netty.Connection;
import reactor.netty.DisposableServer;
import reactor.netty.tcp.TcpServer;

@Slf4j
public class Server {
    public void start() {
        DisposableServer s = TcpServer.create()
                .host("localhost")
                .port(8088)
                .handle((inbound, outbound) -> inbound.receive().asString().doOnNext(
                        System.out::println
                ).log().then())
                .bindNow();
        s.onDispose().block();

    }

}
