import java.util.List;
import java.util.Random;

public class RandomGenerator {
    private Random rand;

    public RandomGenerator() {
        rand = new Random();
    }

    public int run(List<Integer> values) {
        int max = values.size();
        return values.get(this.rand.nextInt(max));
    }
}
