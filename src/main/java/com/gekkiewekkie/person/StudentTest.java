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
         * testgetStudentenLijst test de methode getStudentenLijst waar de studentlijst gereturned wordt. Dit test dus
         * dat alle studenten in de studentenlijst vergeleken worden met de hier aangemaakte studentenlijst. Als dit
         * correct is wordt de met elkaar vergeleken studentenlijst gereturned. Dit vertoont de bruikbaarheid van de code
         */

        // Arrange
        StudentList.StudentenLijst();
        ArrayList<Student> testStudentLijst = new ArrayList<>();
        for (int i = 0; i < StudentList.getStudentLijst().size() ; i++) {
            testStudentLijst.add(StudentList.getStudentLijst().get(i));
        }
        // Act
        ArrayList<Student> result = StudentList.getStudentLijst();

        // Assert
        assertEquals(testStudentLijst, result);
    }

    @Test
    public void testRemoveStudent() {
        /**
         * testRemoveStudent test de methode removeStudent waarin een student verwijdert wordt. Hier wordt dus getest
         * dat student Henk Hofwegen met leeftijd 35 en studentnummer 21234409 verwijdert wordt uit de studentenlijst.
         * Als de test uitgevoerd wordt, wordt eerst de student verwijdert, hierna kijkt de test of de student
         * daadwerkelijk nog in de studentenlijst staat en als dat niet zo is, is de student correct en volledig
         * verwijdert. De test ondersteunt de kwaliteit van de code.
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
         * testAddStudent test de methode addStudent waarin een nieuwe student toegevoegd wordt aan de studentenlijst.
         * Er wordt dus getest dat Robin van Genderen met leeftijd 18 en studentnummer 12345987 toegevoegd kan worden
         * in de studentenlijst. Als de test uitgevoerd wordt, wordt er een nieuwe student toegevoegd en als de
         * studentenlijst de student bevat, is de student correct toegevoegd. De test vertoont dat de code voldoet aan
         * de eisen.
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
         * testGetStudentenByNummer test de methode getStudentenByNummer waarin studenten door hun studentennummer
         * worden gereturned. Er wordt vertoond dat studentennummer 21234409 gelijk staat aan het studentennummer van
         * student uit studentenlijst (ArrayList (0)). Dus als de test uitgevoerd is worden de beiden studentennummers
         * vergeleken met elkaar en als ze gelijk zijn worden ze gereturned anders wordt er null teruggegeven. De test
         * toont de bruikbaarheid van de gechreven code aan.
         */

        // Arrange
        StudentList.StudentenLijst();
        Student testStudent = StudentList.getStudentLijst().get(0);

        // Act
        var result = StudentList.getStudentByNummer(21234409);

        // Assert
        assertEquals(testStudent, result);
    }
}

