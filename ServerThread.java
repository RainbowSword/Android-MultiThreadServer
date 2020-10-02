package mina;

import java.net.Socket;

public class ServerThread extends Thread{
    public Socket socket;
    public ServerThread(Socket socket) {
        this.socket = socket;
    }
    @Override
    public void run() {
        super.run();

    }
}
