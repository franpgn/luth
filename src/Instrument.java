public abstract class Instrument {
    InstrumentInfo instrumentInfo;
    double value;

    public Instrument(InstrumentInfo instrumentInfo, double value) {
        this.instrumentInfo = instrumentInfo;
        this.value = value;
    }
}
