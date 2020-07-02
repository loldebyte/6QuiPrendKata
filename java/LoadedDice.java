import java.util.ArrayList;
import java.util.List;

public class LoadedDice extends Dice {
    private int loadedFace;
    private int loadedWeight;

    public LoadedDice(List<Integer> l, int cheatinFace, int howMuchAmICheatin) {
        super(l);
        if (!l.contains(cheatinFace)) {
            throw new IllegalArgumentException();
        }
        if (howMuchAmICheatin < 50) {
            throw new IllegalArgumentException();
        }
        if (howMuchAmICheatin > 100) {
            howMuchAmICheatin = 100;
        }
        this.loadedFace = cheatinFace;
        this.loadedWeight = howMuchAmICheatin;
    }

    public int roll() {
        List<Integer> cheatarray = new ArrayList<Integer>();
        for (int i=0; i<loadedWeight; i++) {
            cheatarray.add(1);
        }
        while (cheatarray.size() < 100) {
            cheatarray.add(0);
        }
        int result = RNG.run(cheatarray);
        if (result == 1) {
            return loadedFace;
        }
        else return super.roll();
    }
}