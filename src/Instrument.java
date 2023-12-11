public abstract class Instrument {
    String id;
    InstrumentInfo instrumentInfo;
    double value;
    public Instrument( String id, InstrumentInfo instrumentInfo, double value ) {
        this.id = id;
        this.instrumentInfo = instrumentInfo;
        this.value = value;
    }

    public String toString() {
        return "Instrument: " + instrumentInfo.getDescription() + "\n" + "Type: " + instrumentInfo.getType() + "\n" + "Value: " + value + "\n";
    }
}
