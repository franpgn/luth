import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Workshop implements Serializable {
    static List<Instrument> instrumentList = new ArrayList<>();

    public String addInstrument( int id, String type, double value, List<Wood> woods, List<Material> materials ) {
        InstrumentInfo instrumentInfo = InstrumentInfo.getById(id);
        String instrumentId = UUID.randomUUID().toString();
        if (instrumentInfo.getId() != 0) {
            instrumentInfo.setWoods( woods );
            instrumentInfo.setMaterials( materials );
            switch (type) {
                case "Strings" -> {
                    Strings stringsInstrument = new Strings( instrumentId, instrumentInfo, value );
                    instrumentList.add(stringsInstrument);
                    return instrumentInfo.getDescription()+" Instrument has been successfully added to the Workshop!";
                }
                case "Woodwind" -> {
                    Woodwind woodwindInstrument = new Woodwind( instrumentId, instrumentInfo, value );
                    instrumentList.add(woodwindInstrument);
                    return instrumentInfo.getDescription()+" Instrument has been successfully added to the Workshop!";
                }
                case "Brass" -> {
                    Brass brassInstrument = new Brass( instrumentId, instrumentInfo, value );
                    instrumentList.add(brassInstrument);
                    return instrumentInfo.getDescription()+" Instrument has been successfully added to the Workshop!";
                }
                case "Percussion" -> {
                    Percussion percussionInstrument = new Percussion( instrumentId, instrumentInfo, value );
                    instrumentList.add(percussionInstrument);
                    return instrumentInfo.getDescription()+" Instrument has been successfully added to the Workshop!";
                }
            }
        }
        return "Instrument not found, please create it before using it";
    }

    public StringBuilder listInstruments(){
        StringBuilder listInstruments = new StringBuilder();
        for (Instrument instrument : instrumentList) {
            listInstruments.append(instrument.toString());
        }
        return listInstruments;
    }

    public double calculateExpenses(String id){
//        Instrument instrumentById;
//        for (Instrument instrument : instrumentList) {
//            instrument.instrumentInfo.getId()
//        }
//        double woodTotalValue;
//        double materialTotalValue;
//        for ()
        return 0.0;
    }
    public Workshop() {}
}