import java.util.ArrayList;
import java.util.List;

public class RandomGeneratorStub extends RandomGenerator {
    
    private List<Integer> indexes;
    private int nextIndex;

    public RandomGeneratorStub() {
        indexes = new ArrayList<Integer>();
        nextIndex = 0;
    }

    public int run(List<Integer> values) {
        int ret = values.get(indexes.get(nextIndex));
        nextIndex++;
        return ret;
    }

    public int getIndex(int i) {
        return indexes.get(i);
    }

    public List<Integer> indexr() {
        List<Integer> ret = new ArrayList<Integer>();
        for (int i=0; i<this.indexes.size(); i++) {
            ret.add(i);
        }
        return ret;
    }
}