package com.gekkiewekkie.commandline.interfaces;

import com.gekkiewekkie.commandline.core.CommandLineChoice;
import com.gekkiewekkie.commandline.core.MultipleLetterChoice;
import com.gekkiewekkie.commandline.core.OpenQuestion;
import com.gekkiewekkie.exam.ExamList;
import com.gekkiewekkie.exam.Examen;
import com.gekkiewekkie.Main;
import com.gekkiewekkie.commandline.core.MultipleNumberChoice;
import com.gekkiewekkie.person.Student;
import com.gekkiewekkie.person.StudentList;

import java.util.ArrayList;
import java.util.List;

public class ExamInterface implements IInterface {
    public ExamInterface(Examen... e) {
        int studentenNummer = Main.vraagStudentenNummer();
        examChoice().examenAfnemen(studentenNummer);
    }

    public static Examen examChoice() {
        ArrayList<String> examens = new ArrayList<String>();
        for (int i = 0; i < ExamList.getExamenLijst().size(); i++) {
            examens.add(ExamList.getExamenLijst().get(i).getNaam());
        }
        MultipleNumberChoice choice = new MultipleNumberChoice("Kies het examen:", examens);
        choice.initChoice();
        int gekozenExamen = choice.awaitResponse();

        return ExamList.getExamenLijst().get(gekozenExamen);
    }
}
