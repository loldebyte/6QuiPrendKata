import java.util.List;

public class RNG {
    private static RandomGenerator impl = new RandomGenerator();

    private RNG() {}

    public static void setImpl(RandomGenerator rng) {
        RNG.impl = rng;
    }

    public static int run(List<Integer> l) {
        return impl.run(l);
    }
}