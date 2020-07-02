import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Dice {
    protected int numFaces;
    protected List<Integer> facesValues;

    public Dice() {
        this.numFaces = 2;
        this.facesValues = Arrays.asList(1, 2);
    }

    public Dice(List<Integer> faces) {
        this.numFaces = faces.size();
        this.facesValues = new ArrayList<Integer>(faces);
    }

    public int roll() {
        return RNG.run(this.facesValues);
    }
}
