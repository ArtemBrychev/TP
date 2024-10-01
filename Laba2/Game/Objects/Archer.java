package Game.Objects;

public class Archer extends Unit implements Attacker, Moveable{
    int damage = 6;

    public Archer(int id, int x_coor, int y_coor,  String name){
        super(id,  x_coor,  y_coor,   name, 75);
    }

    public void attack(Unit unit){
        unit.receiveDamage(damage);
    };
    public void move(int x, int y){
        this.x_coor += x;
        this.y_coor += y;
    }
}
