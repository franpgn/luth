public class Luth implements LuthActions{

    Stock stock = new Stock();
    Workshop workshop = new Workshop();

    @Override
    public String addStock(int id, String name, double quantity) {
        if (id == 0) {
            Wood wood = new Wood(name, quantity);
            stock.woodList.add(wood);
        }else{
            Material material = new Material(quantity, name);
            stock.materialList.add(material);
        }
        return "Item has successful added to stock!";
    }

    @Override
    public String addWorkshopItem() {
        return null;
    }

    @Override
    public StringBuilder listStock(int id) {
        if (id == 0) {
            return stock.listWoods();
        } else{
            return stock.listMaterials();
        }
    }

    @Override
    public String listWorkshopItems() {
        return null;
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
