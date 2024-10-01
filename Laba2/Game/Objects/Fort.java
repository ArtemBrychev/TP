package Game.Objects;

public class Fort extends Building implements Attacker{
    int damage = 20;
    public Fort(int id, int x_coor, int y_coor,  String name){
        super(id, x_coor, y_coor, name);
    }

    public void attack(Unit unit){
        unit.receiveDamage(damage);
    }

    public Fort(int id, String name){
        super(id, name);
    }
}
