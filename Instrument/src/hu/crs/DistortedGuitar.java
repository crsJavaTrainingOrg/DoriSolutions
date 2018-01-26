package hu.crs;

public class DistortedGuitar extends StringInstrument {
    public DistortedGuitar(String nameParameter) {
        name = nameParameter;
    }

    @Override
    public void play(String[] notes) {
        System.out.println("Listen to my " + super.name);
        for (String note : notes) {
                System.out.println("dzzzsss " + note);
        }
    }
}
