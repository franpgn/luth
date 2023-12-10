import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Stock implements Serializable {
    List<Wood> woodList = new ArrayList<>();
    List<Material> materialList = new ArrayList<>();

    public StringBuilder listStock() {
        StringBuilder listStock = new StringBuilder();
        listStock.append(listWoods());
        listStock.append(listMaterials());
        return listStock;
    }

    public StringBuilder listWoods() {
        StringBuilder listWoods = new StringBuilder();
        for (Wood wood : woodList) {
            listWoods.append(wood.toString());
        }
        return listWoods;
    }

    public StringBuilder listMaterials() {
        StringBuilder listMaterials = new StringBuilder();
        for (Material material : materialList) {
            listMaterials.append(material.toString());
        }
        return listMaterials;
    }
}
