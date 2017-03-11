import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class PdaTest {

  Pda pda;

  @Before
  public void before() {
    pda = new Pda();
  }

  @Test
  public void testFunc1() {
    assertEquals(true, pda.func1(1));
    assertEquals(false, pda.func1(2));
  }

  @Test
  public void testMax() {
    assertEquals(2, pda.max(2, 1));

  }

  @Test
  public void testLooper() {
    assertEquals(11, pda.looper());
  }

  @Test
  public void testCheckLoop() {
    assertEquals("looper passed", pda.checkLoop());
  }
}

// Keep getting a failure on the final test

// 1) testCheckLoop(PdaTest)
// org.junit.ComparisonFailure: expected:<looper [pass]ed> but was:<looper [fail]ed

