package com.gekkiewekkie.person;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentTest {
    @Test
    public void testStringHello() {
        boolean expected = false;
        boolean sum = StudentList.removeStudent("Pietje", 18, 213043);
        assertEquals(expected, sum);
    }
}
