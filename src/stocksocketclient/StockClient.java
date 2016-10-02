
package stocksocketclient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;


public class StockClient {
    int port;
    String hostName;
    
    public StockClient(String hostName, int port){
        this.port = port;   
        this.hostName = hostName;
    }
    
    public void connect(){
        try {
            Socket socket = new Socket(hostName, port);
            PrintWriter out = new PrintWriter(socket.getOutputStream());
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String incoming;
            while((incoming = in.readLine()) != null){
                System.out.println(incoming);
            }
        }
        catch (IOException ex) {
            Logger.getLogger(StockClient.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
            
}
