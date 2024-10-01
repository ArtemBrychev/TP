import Game.Objects.*;

public class Main{
    public static void main(String[] args){
        Archer defualtArcher = new Archer(21, 0, 0, "MainArcher");
        test_Archer(defualtArcher);
        Building building = new Building(12, "Building");
        test_Building(building);
        Fort fort = new Fort(121, "Fort");
        test_Fort(fort);
    }

    static <T extends GameObject> void test_GameObject_method(T ob){
        System.out.println("name: " + ob.getName());
        System.out.println("id: " + ob.getId());
        System.out.println("X: " + ob.getX() + " Y: " + ob.getY());
    }

    static <T extends Unit> void test_Unit_method(T ob){
        test_GameObject_method(ob);
        System.out.println("HP: " + ob.getHp());
        System.out.println("isAlive: " + ob.isAlive());
    }

    static void test_Archer(Archer ob){
        test_Unit_method(ob);
        Archer testArcher = new Archer(22, 0, 0, "Attacker");
        testArcher.attack(ob);
        ob.move(3, -4);
        System.out.println();
        test_Unit_method(ob);
    }

    static <T extends Building> void test_Building(Building ob){
        test_GameObject_method(ob);
        System.out.println("Is build: " + ob.isBuilt());
        ob.Build(4, 5);
        System.out.println("Is build: " + ob.isBuilt());
    }

    static void test_Fort(Fort ob){
        test_Building(ob);
        
    }
}