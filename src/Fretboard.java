public class Fretboard {
    private double fretPosition;

    public double getFretPosition(double fretBoardLength, int numberFrets) {
        for (int i=0; i <= numberFrets; i++){
        fretPosition = fretBoardLength / Constants.FRET_DISTANCE;
        fretBoardLength = fretBoardLength - fretPosition;
        }
        return fretPosition;
    }
}
