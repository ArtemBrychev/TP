package patterns.Builder;

public class ConcreateBuilder implements Builder{
    private Building LivingBuiling;

    ConcreateBuilder(){
        LivingBuiling = new Building();
    }

    public void buildFloors() {
        LivingBuiling.floors = "5 floors";
    }

    public void buildFoundation() {
        LivingBuiling.foundation = "Exist";
    }

    public void buildWalls() {
        LivingBuiling.walls = "Brick walls";
    }

    public void buildRoof() {
        LivingBuiling.roof = "Strong non leaking roof";
    }

    public Building getResult() {
        return LivingBuiling;
    }
}
