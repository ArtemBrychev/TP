package Game.Objects;

public class Unit extends GameObject{
    protected float hp;
    public Unit(int id, int x_coor, int y_coor,  String name, float hp){
        super(id,  x_coor,  y_coor,   name);
        this.hp = hp;
    }
    public boolean isAlive(){return hp>0.0;}
    public float getHp(){return hp;};
    public void receiveDamage(float damage){hp -= damage;}

}
