import java.util.ArrayList;
import java.util.List;

public class KnuckleBone extends Dice {
    public KnuckleBone(List<Integer> faces) {
        if (faces.size() != 4) {
            throw new IllegalArgumentException();
        }
        for (Integer integer : faces) {
            if (integer != 1 && integer != 3 && integer != 4 && integer != 6) {
                throw new IllegalArgumentException();
            }
        }
        this.numFaces = faces.size();
        this.facesValues = new ArrayList<Integer>(faces);
    }
}