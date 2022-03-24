    package com.gekkiewekkie.person;

    public class Student {
        private String name;
        private Integer leeftijd;
        private Integer studentNummer;

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
    }
