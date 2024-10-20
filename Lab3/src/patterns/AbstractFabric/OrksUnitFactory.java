package patterns.AbstractFabric;

public class OrksUnitFactory implements UnitFactory{
    public OrksBuilderUnit createBuilderUnit(){
        return new OrksBuilderUnit();
    }

    public OrksSoldierUnit createSoldierUnit(){
        return new OrksSoldierUnit();
    }
}
