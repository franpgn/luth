import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Workshop implements Serializable {
    static List<Instrument> instrumentList = new ArrayList<>();

    public String addInstrument(int id, String type, double value) {
        InstrumentInfo instrumentInfo = InstrumentInfo.getById(id);
        if (instrumentInfo.getId() != 0) {
            switch (type) {
                case "Strings" -> {
                    Strings stringsInstrument = new Strings(instrumentInfo, value);
                    instrumentList.add(stringsInstrument);
                    return instrumentInfo.getDescription()+" Instrument has been successfully added to the Workshop!";
                }
                case "Woodwind" -> {
                    Woodwind woodwindInstrument = new Woodwind(instrumentInfo, value);
                    instrumentList.add(woodwindInstrument);
                    return instrumentInfo.getDescription()+" Instrument has been successfully added to the Workshop!";
                }
                case "Brass" -> {
                    Brass brassInstrument = new Brass(instrumentInfo, value);
                    instrumentList.add(brassInstrument);
                    return instrumentInfo.getDescription()+" Instrument has been successfully added to the Workshop!";
                }
                case "Percussion" -> {
                    Percussion percussionInstrument = new Percussion(instrumentInfo, value);
                    instrumentList.add(percussionInstrument);
                    return instrumentInfo.getDescription()+" Instrument has been successfully added to the Workshop!";
                }
            }
        }
        return "Instrument not found, please create it before using it";
    }
    public Workshop() {}
}