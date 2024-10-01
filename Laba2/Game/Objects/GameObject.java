package Game.Objects;

public class GameObject {
    protected int id;
    protected String objectName;
    protected int x_coor = 0;
    protected int y_coor = 0;

    public int getId(){return id;}
    public int getX(){return x_coor;}
    public int getY(){return y_coor;}
    public String getName(){return objectName;}

    GameObject(int id, int x_coor, int y_coor,  String name){
        this.id = id;
        this.objectName = name;
        this.x_coor = x_coor;
        this.y_coor = y_coor;
    }

    GameObject(){}
}