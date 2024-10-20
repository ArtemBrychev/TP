package patterns;

public class Single {
    private static Single instanse;

    private Single(){}

    public static Single getInstance(){
        if(instanse == null){
            instanse = new Single();
        }
        return instanse;
    }

    public void haha(){
        System.out.println("HeHe");
    }
}