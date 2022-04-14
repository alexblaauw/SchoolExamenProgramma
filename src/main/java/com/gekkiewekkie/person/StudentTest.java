package com.gekkiewekkie.person;
import com.gekkiewekkie.commandline.core.CommandLineChoice;
import com.gekkiewekkie.commandline.core.MultipleLetterChoice;
import com.gekkiewekkie.exam.ExamList;
import com.gekkiewekkie.exam.Examen;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StudentTest {

    @Test
    public void testGetStudentenLijst(){
        /**
         *
         */

        // Arrange
        ArrayList<Student> testStudentLijst = new ArrayList<>();
        testStudentLijst.add(new Student("Henk Hofwegen", 35, 21234409));
        testStudentLijst.add(new Student("Natasja de Ven", 27, 2462652));
        testStudentLijst.add(new Student("Jonas Abbing", 42, 2557052));
        testStudentLijst.add(new Student("Liesanne Reinders", 28, 7560455));
        testStudentLijst.add(new Student("Hendrik de Wit", 35, 2805852));
        testStudentLijst.add(new Student("Lars Post", 19, 2532402));
        testStudentLijst.add(new Student("Ruud van Heijningen", 17, 1238495));
        testStudentLijst.add(new Student("Loes Houtkooper", 20, 1290375));
        testStudentLijst.add(new Student("Mees Bakker", 20, 3100584));
        testStudentLijst.add(new Student("Annika Blauw", 18, 2348095));

        // Act
        StudentList.StudentenLijst();
        ArrayList<Student> result = StudentList.getStudentLijst();

        // Assert
        assertTrue(testStudentLijst.equals(result));
    }

    @Test
    public void testRemoveStudent() {
        /**
         * testRemoveStudent test de methode removeStudent waarin een student verwijdert wordt. Hier wordt dus getest
         * dat student Henk Hofwegen met leeftijd 35 en studentNummer 21234409 verwijdert wordt uit de studentenlijst.
         * Als de test uitgevoerd wordt, wordt eerst de student verwijdert, hierna kijkt de test of de student
         * daadwerkelijk nog in de studentenlijst staat en als dat niet zo is, is de student correct en volledig
         * verwijdert.
         */

        // Arrange
        StudentList.StudentenLijst();
        Student student = new Student("Henk Hofwegen", 35, 21234409);

        // Act
        StudentList.removeStudent("Henk Hofwegen", 35, 21234409);

        // Assert
        assertFalse(StudentList.getStudentLijst().contains(student));
    }

    @Test
    public void testAddStudent(){
        /**
         *
         */

        // Arrange
        StudentList.StudentenLijst();
        Student student;
        StudentList.addStudent("Robin van Genderen", 18, 12345987);

        // Act
        student = StudentList.getStudentByNummer(12345987);

        // Assert
        assertTrue(StudentList.getStudentLijst().contains(student));
    }

    @Test
    void testGetStudentenByNummer() {
        /**
         *
         */

        // Arrange
        StudentList.StudentenLijst();
        Student testStudent = StudentList.getStudentLijst().get(0);

        // Act
        var result = StudentList.getStudentByNummer(21234409);

        // Assert
        assertEquals(testStudent, result);
    }

    @Test
    void testGetExamenLijst(){
        /**
         *
         */

        // Arrange
        ExamList.getExamenLijst();

        // Act
        Examen.getExamenLijst();

        // Assert
    }

    @Test
    void testAddExamen(){
        /**
         *
         */

        // Arrange
        CommandLineChoice[] vragen = new CommandLineChoice[1];
        Integer[] antwoorden = new Integer[1];
        vragen[0] = new MultipleLetterChoice("What is the average speed of an unladen Swallow?", "I don't know that!", "African or European?");
        antwoorden[0] = 1;

        Examen examen = new Examen("test_examen", vragen, antwoorden);
        ExamList.addExamen(examen);

        // Act

        // Assert
    }
}

