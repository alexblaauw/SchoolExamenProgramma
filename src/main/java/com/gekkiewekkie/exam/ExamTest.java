package com.gekkiewekkie.exam;

import com.gekkiewekkie.commandline.core.CommandLineChoice;
import com.gekkiewekkie.commandline.core.MultipleLetterChoice;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ExamTest {

    @Test
    void testGetExamenLijst(){
        /**
         * testGetExamenLijst test de methode getExamenLijst waarin alle examens geïnitieerd worden.
         * Deze methode geeft de examenlijst terug als de examenlijst geïnitieerd is.
         * Hiermee kunnen we examens binnen de examenlijst bereiken.
         */

        // Arrange
        ExamList.getExamenLijst();
        ArrayList<Examen> testExamenLijst = new ArrayList<>();
        for (int i = 0; i < ExamList.getExamenLijst().size() ; i++) {
            testExamenLijst.add(ExamList.getExamenLijst().get(i));
        }
        // Act
        ArrayList<Examen> result = ExamList.getExamenLijst();

        // Assert
        assertEquals(testExamenLijst, result);
    }

    @Test
    void testAddExamen(){
        /**
         * testAddExamen test de methode addExamen waarin een nieuw Examen toegevoegd wordt aan de examen.
         * Er wordt dus gecontroleerd of het examen is toegevoegd door te kijken naar de examenlijst en of het nieuwe
         * examen er in staat. Hiermee kunnen we zien of we zelf examens kunnen toevoegen.
         */

        // Arrange
        ExamList.getExamenLijst();

        // Act
        CommandLineChoice[] vragen = new CommandLineChoice[1];
        Integer[] antwoorden = new Integer[1];
        vragen[0] = new MultipleLetterChoice("Test", "123", "321");
        antwoorden[0] = 1;
        Examen examen = new Examen("examenTest", vragen, antwoorden);
        ExamList.addExamen(examen);

        // Assert
        assertTrue(ExamList.getExamenLijst().contains(examen));
    }
}
