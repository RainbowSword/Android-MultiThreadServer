# Android-MultiThreadServer
The easiest code to set up an Android server



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
