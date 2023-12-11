public class Fretboard {
    private double[] fretPositions;
    private int numberFrets;

    public double[] getFretPositions( double fretboardLength, int numberFrets ) {
        fretPositions = new double[numberFrets];
        for ( int i = 0; i < numberFrets; i++ ){
            fretPositions[i] = fretboardLength / Constants.FRET_DISTANCE;
            fretboardLength = fretboardLength - fretPositions[i];
        }
        return fretPositions;
    }
}
