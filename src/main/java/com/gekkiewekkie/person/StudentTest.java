package com.gekkiewekkie.person;
import com.gekkiewekkie.exam.ExamList;
import com.gekkiewekkie.exam.Examen;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StudentTest {
    @Test
    public void testRemoveStudent() {
        // Arrange
        boolean expectedValue = true;

        // Act
        boolean result = StudentList.removeStudent("Pietje", 18, 23109043);

        // Assert
        assertEquals(expectedValue, result);
        assertTrue(result);

        //
    }

    @Test
    public void testAddStudent(){
        // Arrange
        Student student;
        StudentList.addStudent("Robin", 18, 12345987);
        student = StudentList.getStudentByNummer(12345987);

        // Act

        // Assert
        assertTrue(StudentList.getStudentLijst().contains(student));

        //...
    }

    @Test
    public void testGetStudentenLijst(){
        // Arrange
        var expectedValue = "";

        // Act
        var result = StudentList.getStudentLijst();

        // Assert
        assertEquals(expectedValue, result);

        //...
    }

    @Test
    void testGetStudentenByNummer() {
        // Arrange
        var expectedValue = 1238495;

        // Act
        var result = StudentList.getStudentByNummer(1238495);

        // Assert
        assertEquals(expectedValue, result);

        //
    }

    @Test
    void testGetExamenLijst(){
        // Arrange

        // Act
        Examen.getExamenLijst();

        // Assert

        //
    }

    @Test
    void testAddExamen(){
        // Arrange

        // Act
        ExamList.addExamen();

        // Assert

        //
    }

    @Test
    void testPrintStudenten() {
        //Arrange

        // Act
        StudentList.printStudenten();

        // Assert

        //
    }
}

