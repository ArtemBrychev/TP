package lab4.chain;

public class FirstLevelHandler implements Handler{
    private Handler nextHandler;

    public void handleRequest(Request req){
        if(req.getUserLevel() == 1){
            System.out.println("Handling request. UserLevel 1");
        }else{
            nextHandler.handleRequest(req);
        }
    }



    public void setNextHandler(Handler j){
        nextHandler = j;
    }
}
