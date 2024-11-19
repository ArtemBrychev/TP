package lab4.chain;

public class SecondLevelHandler implements Handler{
    private Handler nextHandler;

    public void handleRequest(Request req){
        if(req.getUserLevel() == 2){
            System.out.println("Handling request. UserLevel 2");
        }else{
            nextHandler.handleRequest(req);
        }
    }

    public void setNextHandler(Handler kj){
        nextHandler = null;
    }
}
