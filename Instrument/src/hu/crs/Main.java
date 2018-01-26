package hu.crs;

public class Main {

    public static void main(String[] args) {
        String[] song = new String[]{"do", "re", "mi", "fa", "so", "la", "ti", "do"};
        Instrument violin = new Violin("Strativari");
        //violin.play(song);
        playSong(violin, song);

        Instrument distortedGuitar = new DistortedGuitar("Ibanez");
        //violin.play(song);
        playSong(distortedGuitar, song);
    }

    private static void playSong(Instrument instrument, String[] song) {
        instrument.play(song);
    }
}
