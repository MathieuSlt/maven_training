package fr.lernejo;

import static org.junit.jupiter.api.Assertions.*;

class SampleTest {
    static final Sample s = new Sample();

    @org.junit.jupiter.api.Test
    void one_plus_one() {
        assertEquals(2, s.op(Sample.Operation.ADD, 1,1));
    }

    @org.junit.jupiter.api.Test
    void minus() {
        assertEquals(-10, s.op(Sample.Operation.ADD, 10,-20));
    }

    @org.junit.jupiter.api.Test
    void mult_one() {
        assertEquals(1, s.op(Sample.Operation.MULT, 1,1));
    }

    @org.junit.jupiter.api.Test
    void mult_ten() {
        assertEquals(100, s.op(Sample.Operation.MULT, 10,10));
    }

    @org.junit.jupiter.api.Test
    void fact_zero() {
        assertEquals(1, new Sample().fact(0));
    }

    @org.junit.jupiter.api.Test
    void fact_ten() {
        assertEquals(3628800, new Sample().fact(10));
    }

    @org.junit.jupiter.api.Test
    void fact_neg() {
        assertThrows(IllegalArgumentException.class, () -> new Sample().fact(-10));
    }
}
