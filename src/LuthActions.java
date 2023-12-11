import java.util.List;

public interface LuthActions {
    String addStock( int id, String name, double quantity, double value );
    String addWorkshopItem( int id, String type, double value, List<Wood> woods, List<Material> materials );
    StringBuilder listStock();
    StringBuilder listWorkshopItems();
    String showExpenses();
    String showIncomes();
}
