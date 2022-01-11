public class TimeServer extends FrameworkServer {

    public TimeServer(int portNumber, int backlog, FrameworkUserInterface myUI) {
        super(portNumber, backlog, myUI);
    }

    @Override
    public void clientConnected(String clientIPAddress) {
        sendMessageToUI("Client connected:\n\tRemote Socket Address = " + clientIPAddress + "\n\tLocal Socket Address = " + clientSocket.getLocalSocketAddress());
    }

    @Override
    public void clientDisconnected(String clientIPAddress) {
        sendMessageToUI("\tClient " + clientIPAddress + " has been disconnected.");
    }

    @Override
    public void serverSocketStarted() {
        sendMessageToUI("Server socket has started successfully, on port: "+getPort());
    }

    @Override
    public void serverSocketStopped() {
        sendMessageToUI("Server socket has stopped successfully, on port: "+getPort());
    }

    @Override
    public void serverStartedListening()  {
        sendMessageToUI("Server has started listening on port: "+getPort());
    }
    
    @Override
    public void serverStoppedListening()  {
        sendMessageToUI("Server has stopped listening on port: "+getPort());
    }
}
