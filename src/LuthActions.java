import java.util.List;

public interface LuthActions {
    String addStock( int id, String name, double quantity, double value );
    String addWorkshopItem( int id, double value, List<Wood> woods, List<Material> materials );
    StringBuilder listStock();
    StringBuilder listWorkshopItems();
    double showExpenses();
    double showIncomes();
}
