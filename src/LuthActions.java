public interface LuthActions {
    public String addStock(int id, String name, double quantity);
    public String addWorkshopItem();
    public StringBuilder listStock(int id);
    public String listWorkshopItems();
    public String showExpenses();
    public String showIncomes();
}
