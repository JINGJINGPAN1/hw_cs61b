package flik;
import static org.junit.Assert.*;
import org.junit.Test;

public class FilkTest {
    @Test
    public void testIsSameNumber() {
        int a = 15;
        int b = 16;
        int c = 15;
        assertEquals(true, Flik.isSameNumber(a,c));
        assertEquals(false, Flik.isSameNumber(a,b));

        System.out.println("a is " + a);
        System.out.println("b is " + b);
        System.out.println("c is " + c);
    }


}
