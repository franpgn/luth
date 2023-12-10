public class Wood {
    private String name;
    private double meterSquared;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMeterSquared() {
        return meterSquared;
    }

    public void setMeterSquared(double meterSquared) {
        this.meterSquared = meterSquared;
    }

    public Wood(String name, double meterSquared) {
        this.name = name;
        this.meterSquared = meterSquared;
    }

    public String toString(){
        return "Name: "+getName()+"Meters Squared: "+getMeterSquared()+"\n";
    }
}
