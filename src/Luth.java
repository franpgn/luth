import java.util.List;

public class Luth implements LuthActions{

    Workshop workshop = new Workshop();

    @Override
    public String addStock( int id, String name, double quantity, double value ) {
        return Stock.addStock( id, name, quantity, value );
    }

    @Override
    public String addWorkshopItem( int id, double value, List<Wood> woods, List<Material> materials ) {
        return workshop.addInstrument(id, value, woods, materials );
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
    public double showExpenses() {
        return Stock.calculateExpenses();
    }

    @Override
    public double showIncomes() {
        return workshop.calculateIncomes();
    }
}
