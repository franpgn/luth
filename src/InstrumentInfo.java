import java.io.Serializable;

public enum InstrumentInfo implements Serializable {
    UNKNOWN(0, "Unknown", "None"),
    VIOLIN(1, "Violin", "Strings"),
    VIOLA(2, "Viola", "Strings"),
    GUITAR(3, "Guitar", "Strings"),
    VIOLA_CAIPIRA(4, "Viola Caipira", "Strings"),
    BASS(5, "Bass", "Strings"),
    HARP(6, "Harp", "Strings"),
    PIANO(7, "Piano", "Strings"),
    CELLO(8, "Cello", "Strings"),
    FLUTE(9, "Flute", "Woodwind"),
    PICCOLO(10, "Piccolo", "Woodwind"),
    OBOE(11, "Oboe", "Woodwind"),
    CLARINET(12, "Clarinet", "Woodwind"),
    SAXOPHONE(13, "Saxophone", "Woodwind"),
    TRUMPET(14, "Trumpet", "Brass"),
    HORN(15, "Horn", "Brass"),
    TROMBONE(16, "Trombone", "Brass"),
    TUBA(17,  "Tuba", "Brass"),
    TIMPANI(18, "Timpani", "Percussion"),
    BASS_DRUM(19, "Bass Drum", "Percussion"),
    MARIMBA(20, "Marimba", "Percussion"),
    XYLOPHONE(21, "Xylophone", "Percussion");

    private int id;
    private String description;
    private String type;

    InstrumentInfo(int id, String description, String type) {
        this.id = id;
        this.description = description;
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public String getType() {
        return type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void updateInstruments(){}

    public void setDescription(String description) {
        this.description = description;
    }

    public void setType(String type) {
        this.type = type;
    }

    public static InstrumentInfo getById(int id){
        for (InstrumentInfo instrumentInfo : values()) {
            if (instrumentInfo.getId() == id)
                return instrumentInfo;
        }
        return UNKNOWN;
    }
}
