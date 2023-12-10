public abstract class Instrument {
    InstrumentInfo instrumentInfo;
    double value;
    public Instrument(InstrumentInfo instrumentInfo, double value) {
        this.instrumentInfo = instrumentInfo;
        this.value = value;
    }

    public String toString() {
        return "Instrument: " + instrumentInfo.getDescription() + "\n" + "Type: " + instrumentInfo.getType() + "\n" + "Value: " + value + "\n";
    }
}
