import java.util.Arrays;

import org.junit.BeforeClass;
import org.junit.Test;

import junit.framework.Assert;

public class testDice {

    @BeforeClass
    public static void mock() {
        RNG.setImpl(RandomGeneratorStub);
    }

    @Test
    public void defDiceIsCoin() {
        Dice d = Dice();
        Assert.assertEquals(1, d.roll());
        Assert.assertEquals(2, d.roll());
    }

    @Test
    public void CoinTest() {
        Coin c = Coin();
        Assert.assertEquals(1, c.roll()):
    }

    @Test
    public void KnuckleBoneWorks() {
        KnuckleBone kb = KnuckleBone(Arrays.asList(1, 3, 4, 6));
        Assert.assertEquals(1, kb.roll());
        Assert.assertEquals(3, kb.roll());
        Assert.assertEquals(4, kb.roll());
        Assert.assertEquals(6, kb.roll());
    }

    @Test
    public void DiceValsIsOK() {
        Dice havinAGreatDayIndeed = Dice(Arrays.asList(1, 100, 1000));
        Assert.assertEquals(1, havinAGreatDayIndeed.roll());
        Assert.assertEquals(100, havinAGreatDayIndeed.roll());
        Assert.assertEquals(1000, havinAGreatDayIndeed.roll());
    }

    @Rule
    public final ExpectedException exception = ExpectedException.none();
  
    @Test
    public void KnuckleBoneCrashesIfFaceDiffThan1346() {
        exception.expect(IllegalArgumentException.class);
        KnuckleBone fckThisShit = new KnuckleBone(Arrays.asList(92,4,4,4));
    }
    @Test
    public void KnuckleBoneCrashesIfNbFacesDiff4() {
        exception.expect(IllegalArgumentException.class);
        KnuckleBone EnvyMyFate = new KnuckleBone(Arrays.asList(4,4,4,4,4,4,4,4));
    }

    @Test
    public void knuckleBoneRollsAsIntended() {
        KnuckleBone yaaaaaaaaaaaaaaaaaaaaaaaaaaaaay = KnuckleBone(1,1,1,4);
        Assert.assertEquals(1, yaaaaaaaaaaaaaaaaaaaaaaaaaaaaay.roll());
        Assert.assertEquals(1, yaaaaaaaaaaaaaaaaaaaaaaaaaaaaay.roll());
        Assert.assertEquals(1, yaaaaaaaaaaaaaaaaaaaaaaaaaaaaay.roll());
        Assert.assertEquals(4, yaaaaaaaaaaaaaaaaaaaaaaaaaaaaay.roll());
    }

    @Test
    public void loadedDicesCheat() {
        LoadedDice adsdasdaf = LoadedDice(Arrays.asList(1, 1, 1, 45), 45, 50);
        Assert.assertEquals(45, adsdasdaf.roll());
    }
  
    @Test
    public void loadedDiceCrashesIfWeightBelow50() {
        exception.expect(IllegalArgumentException.class);
        LoadedDice unlikeYouIllNeverSuffer = LoadedDice(Arrays.asList(1, 2, 3), 3, 3);
    }
  
    @Test
    public void loadedDiceCrashesIfLoadedFaceNotOnDice() {
        exception.expect(IllegalArgumentException.class);
        LoadedDice unlikeYouIllNeverSuffer = LoadedDice(Arrays.asList(1, 2, 3), 18, 3);
    }
}