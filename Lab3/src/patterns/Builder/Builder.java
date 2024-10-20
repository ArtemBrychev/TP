package patterns.Builder;

public interface Builder {
    public void buildFoundation();
    public void buildWalls();
    public void buildFloors();
    public void buildRoof();
    Building getResult();
}
