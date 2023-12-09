import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Stock implements Serializable {
    List<Wood> woodList = new ArrayList<Wood>();
    List<Material> materialList = new ArrayList<Material>();
}
