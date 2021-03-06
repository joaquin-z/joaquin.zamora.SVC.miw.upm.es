package clases;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class C31Test {

    private C31 c31;
    
    @Before
    public void before() {
        c31 = new C31();
    }
    
    @Test
    public void m1() {
        assertEquals("m1", c31.m1());
    }
    
    @Test
    public void m2() {
        assertEquals("m2", c31.m2());
    }
    
    @Test
    public void mB() {
        assertEquals("mB", c31.mB());
    }

}