import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Stock implements Serializable {
    List<Wood> woodList = new ArrayList<Wood>();
    List<Material> materialList = new ArrayList<Material>();

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
