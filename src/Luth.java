import java.util.List;

public class Luth implements LuthActions{

    Workshop workshop = new Workshop();

    @Override
    public String addStock(int id, String name, double quantity, double value) {
        if (id == 0) {
            Wood wood = new Wood(name, quantity, value);
            Stock.woodList.add(wood);
        }else{
            Material material = new Material(quantity, name, value);
            Stock.materialList.add(material);
        }
        return "Item has been successfully added to the Stock!";
    }

    @Override
    public String addWorkshopItem(int id, String type, double value, List<Wood> woods, List<Material> materials ) {
        return workshop.addInstrument(id, type, value, woods, materials );
    }

    @Override
    public StringBuilder listStock() {
        return Stock.listStock();
    }

    @Override
    public StringBuilder listWorkshopItems() {
        return workshop.listInstruments();
    }

    @Override
    public String showExpenses() {
        return null;
    }

    @Override
    public String showIncomes() {
        return null;
    }
}
