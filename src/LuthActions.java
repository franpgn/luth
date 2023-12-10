public interface LuthActions {
    public String addStock(int id, String name, double quantity, double value);
    public String addWorkshopItem(int id, String type, double value);
    public StringBuilder listStock(int id);
    public String listWorkshopItems();
    public String showExpenses();
    public String showIncomes();
}
