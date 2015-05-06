package com.websokets;

import javax.websocket.OnMessage;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;

@ServerEndpoint(value="/websocket/load")
public class Server {

    @OnMessage
    public void onMessage(final String message, final Session session) throws IOException {
        try {
            session.getBasicRemote().sendText(message);
        } catch (IOException e) {
            System.out.println("Log something..");
        } finally {
            session.close();
        }
    }
}
