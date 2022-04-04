package com.gekkiewekkie.person;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class StudentTest {
    @Test
    public void testRemoveStudent() {
        boolean sum = StudentList.removeStudent("Pietje", 18, 213043);
        assertFalse(sum);
    }
    public void testAddStudent(){
        StudentList.addStudent("Robin", 18, 21104964);

    }
}
