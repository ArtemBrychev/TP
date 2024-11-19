package lab4.chain;

public class Request{
    private int userLevel;

    public Request(int lvl){
        if(lvl <= 2) {
            userLevel = lvl;
        }else{
            userLevel = 2;
        }
    }

    public int getUserLevel(){
        return userLevel;
    }
}
