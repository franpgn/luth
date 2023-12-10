public class Material {
    private double quantity;
    private String name;
    private double value;

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public Material(double quantity, String name, double value) {
        this.quantity = quantity;
        this.name = name;
        this.value = value;
    }
    public String toString(){
        return "Name: "+getName()+"Quantity: "+getQuantity()+"Value: " + getValue()+ "\n";
    }
}
