package mina;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MultiThreadServer {
    public static void main(String[] args){
        try {
            ServerSocket serverSocket = new ServerSocket(1234);
            while(true){
                System.out.println("服务器Let's go !!!~~~监听~~~");
                Socket socket = serverSocket.accept();
                ServerThread serverThread = new ServerThread(socket);
                serverThread.start();
                if(serverThread.socket.isConnected()){
                  //  System.out.println("");
                }
            }


        } catch (IOException e) {
            e.printStackTrace();
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}
