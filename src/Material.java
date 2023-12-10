public class Material {
    private double quantity;
    private String name;

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

    public Material(double quantity, String name) {
        this.quantity = quantity;
        this.name = name;
    }
    public String toString(){
        return "Name: "+getName()+"Quantity: "+getQuantity()+"\n";
    }
}
