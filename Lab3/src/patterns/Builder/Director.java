package patterns.Builder;

public class Director{
    private ConcreateBuilder builder;

    Director(ConcreateBuilder builder){
        this.builder = builder;
    }

    public void build(){
        builder.buildFoundation();
        builder.buildWalls();
        builder.buildFloors();
        builder.buildRoof();
    }
}
