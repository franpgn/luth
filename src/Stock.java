import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Stock implements Serializable {
    static List<Wood> woodList = new ArrayList<>();
    static List<Material> materialList = new ArrayList<>();

    static public String addStock( int id, String name, double quantity, double value ) {
        if (id == 0) {
            Wood wood = new Wood(name, quantity, value);
            Stock.woodList.add(wood);
        } else {
            Material material = new Material(quantity, name, value);
            Stock.materialList.add(material);
        }
        return "Item has been successfully added to the Stock!";
    }
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
    static public double calculateExpenses(){
        double totalExpenses = 0;
        for (Wood wood : woodList) {
            totalExpenses += (wood.getValue());
        }
        for (Material material : materialList) {
            totalExpenses += (material.getValue());
        }
        return totalExpenses;
    }

}
