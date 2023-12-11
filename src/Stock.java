import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Stock implements Serializable {
    static List<Wood> woodList = new ArrayList<>();
    static List<Material> materialList = new ArrayList<>();

    static public StringBuilder listStock() {
        StringBuilder listStock = new StringBuilder();
        listStock.append(listWoods());
        listStock.append(listMaterials());
        return listStock;
    }

    static public StringBuilder listWoods() {
        StringBuilder listWoods = new StringBuilder();
        for (Wood wood : woodList) {
            listWoods.append(wood.toString());
        }
        return listWoods;
    }

    static public StringBuilder listMaterials() {
        StringBuilder listMaterials = new StringBuilder();
        for (Material material : materialList) {
            listMaterials.append(material.toString());
        }
        return listMaterials;
    }
    public double calculateExpenses(){
        double allValue = 0;
        for (Wood wood : woodList) {
            allValue = allValue + (wood.getValue());
        }
        for (Material material : materialList) {
            allValue = allValue + (material.getValue());
        }
        return allValue;
    }

}
