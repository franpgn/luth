import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Workshop implements Serializable {
    static List<Instrument> instrumentList = new ArrayList<>();

    public String addInstrument( int id, double value, List<Wood> woods, List<Material> materials ) {
        InstrumentInfo instrumentInfo = InstrumentInfo.getById(id);
        String instrumentId = UUID.randomUUID().toString();
        if (instrumentInfo.getId() != 0) {
            instrumentInfo.setWoods( woods );
            instrumentInfo.setMaterials( materials );
            switch (instrumentInfo.getType()) {
                case "Strings" :
                    Strings stringsInstrument = new Strings( instrumentId, instrumentInfo, value );
                    instrumentList.add(stringsInstrument);
                    break;
                case "Woodwind" :
                    Woodwind woodwindInstrument = new Woodwind( instrumentId, instrumentInfo, value );
                    instrumentList.add(woodwindInstrument);
                    break;
                case "Brass" :
                    Brass brassInstrument = new Brass( instrumentId, instrumentInfo, value );
                    instrumentList.add(brassInstrument);
                    break;
                case "Percussion" : Percussion percussionInstrument = new Percussion( instrumentId, instrumentInfo, value );
                    instrumentList.add(percussionInstrument);
                    break;
            }
            return instrumentInfo.getDescription()+" Instrument has been successfully added to the Workshop!";
        }
        return "Instrument not found, please create it before using it";
    }

    public StringBuilder listInstruments(){
        StringBuilder listInstruments = new StringBuilder();
        for (Instrument instrument : instrumentList) {
            listInstruments.append( instrument.toString() );
        }
        return listInstruments;
    }

    public double calculateIncomes() {
        double totalIncome = 0;
        for ( Instrument instrument : instrumentList ) {
            totalIncome += instrument.value;
        }
        return totalIncome;
    }
}