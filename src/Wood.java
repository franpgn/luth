public class Wood {
    private String name;
    private double meterSquared;
    private double value;

    public String getName() {
        return name;
    }

    public void setName( String name ) {
        this.name = name;
    }

    public double getMeterSquared() {
        return meterSquared;
    }

    public void setMeterSquared( double meterSquared ) {
        this.meterSquared = meterSquared;
    }

    public double getValue() {
        return value;
    }

    public void setValue( double value ) {
        this.value = value;
    }

    public Wood(String name, double meterSquared, double value) {
        this.name = name;
        this.meterSquared = meterSquared;
        this.value = value;
    }

    public String toString(){
        return "Name: " + getName()+"\n" + "Meters Squared: " + getMeterSquared() + "\n"+"Value: " + getValue() + "\n";
    }
}
