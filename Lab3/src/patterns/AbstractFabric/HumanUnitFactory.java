package patterns.AbstractFabric;

public class HumanUnitFactory implements UnitFactory{
    public HumanBuilderUnit createBuilderUnit(){
        return new HumanBuilderUnit();
    }

    public HumanSoldierUnit createSoldierUnit(){
        return new HumanSoldierUnit();
    }
}
