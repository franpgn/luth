public abstract class Instrument {
    private String id;
    InstrumentInfo instrumentInfo;
    double value;
    public Instrument( String id, InstrumentInfo instrumentInfo, double value ) {
        this.id = id;
        this.instrumentInfo = instrumentInfo;
        this.value = value;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String toString() {
        return "Instrument: " + instrumentInfo.getDescription() + "\n" + "Type: " + instrumentInfo.getType() + "\n" + "Value: " + value + "\n\n";
    }

    public Instrument(){}
}
