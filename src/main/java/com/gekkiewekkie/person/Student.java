    package com.gekkiewekkie.person;

    import com.gekkiewekkie.exam.Examen;

    import java.util.ArrayList;

    public class Student {
        private String name;
        private Integer leeftijd;
        private Integer studentNummer;
        private ArrayList<Examen> gehaaldeExamen = new ArrayList<>();

        public Student(String name, Integer leeftijd, Integer studentNummer) {
            this.name = name;
            this.leeftijd = leeftijd;
            this.studentNummer = studentNummer;
        }

        public String getName() {
            return name;
        }

        public Integer getLeeftijd() {
            return leeftijd;
        }

        public Integer getStudentNummer() {
            return studentNummer;
        }

        public ArrayList<Examen> getGehaaldeExamen() { return gehaaldeExamen; }

        public void addGehaaldeExamen(Examen examen) { gehaaldeExamen.add(examen); }
    }
