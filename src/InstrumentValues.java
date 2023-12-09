import java.io.Serializable;

public enum InstrumentValues implements Serializable {
    ;
    private int quantity;
    private String description;
    private boolean type;

    InstrumentValues(int quantity, String description, boolean type) {
        this.quantity = quantity;
        this.description = description;
        this.type = type;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getDescription() {
        return description;
    }

    public boolean isType() {
        return type;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setType(boolean type) {
        this.type = type;
    }
}
