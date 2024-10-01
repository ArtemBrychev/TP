package Game.Objects;

public class Building extends GameObject{
    protected boolean exist = false;

    public boolean isBuilt(){return exist;}

    public Building(int id, int x_coor, int y_coor,  String name){
        super(id, x_coor, y_coor, name);
        exist = true;
    }
    public Building(int id, String name){
        this.id = id;
        this.objectName = name;
    }

    public void Build(int x_coor, int y_coor){
        if(!exist){
            this.x_coor = x_coor;
            this.y_coor = y_coor;
            exist = true;
        }else{
            System.out.println("Already built");
        }
    }

}
