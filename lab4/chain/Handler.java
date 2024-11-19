package lab4.chain;

public interface Handler {
    void handleRequest(Request req);
    void setNextHandler(Handler handler);
}
