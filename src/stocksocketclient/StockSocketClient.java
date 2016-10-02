
package stocksocketclient;


public class StockSocketClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        StockClient sc = new StockClient("localhost", 4444);
        sc.connect();
    }
    
}
