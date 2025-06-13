import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class test {
	@Test
	public void testCla() {
		Cla cla = new Cla();
		int result = cla.add(3,5);
		Assert.assertEquals(7, result);
	}
}

--------------------------------------------------------------------

public class Cla {
      public int add(int a, int b) {
    	  return a + b;
      }
}
