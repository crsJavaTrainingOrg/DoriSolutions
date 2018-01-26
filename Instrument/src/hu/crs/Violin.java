package hu.crs;

public class Violin extends StringInstrument {
    public Violin(String nameParameter) {
        name = nameParameter;
    }

    @Override
    public void play(String[] notes) {
        System.out.println("Listen to my " + super.name);
        int i = 0;
        for (String note : notes) {
            if (i % 3 == 0) {
                System.out.println("Squeaky " + note);
            } else {
                System.out.println(note);
            }
            i++;
        }
    }
}
