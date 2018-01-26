package hu.crs;

public class Main {

    public static void main(String[] args) {
        Instrument violin = new Violin("Strativari");
        playSong(violin);

        Instrument distortedGuitar = new DistortedGuitar("Ibanez");
        playSong(distortedGuitar);
    }

    private static void playSong(Instrument instrument) {
        instrument.play(new String[]{"do", "re", "mi", "fa", "so", "la", "ti", "do"});
    }
}
