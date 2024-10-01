package Game.Objects;

public class MobileHouse extends Building implements Moveable{
    public MobileHouse(int id, int x_coor, int y_coor,  String name){
        super(id, x_coor, y_coor, name);
    }
    public void move(int x, int y){
        this.x_coor += x;
        this.y_coor += y;
    }
}
