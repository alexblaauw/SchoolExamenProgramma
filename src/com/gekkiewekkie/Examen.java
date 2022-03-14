package com.gekkiewekkie;

class Examen {
    int aantalVragen;

    public Examen(Integer aantalVragen) {
        this.aantalVragen = aantalVragen;
    }
}
//Standaard voor vragen
class Vraag {
    String titel;
    String soortVraag;
    Integer vraagNummer;

    public Vraag(String titel, String soortVraag) {
        this.titel = titel;
        this.soortVraag = soortVraag;
    }
/*
    public  getVraag(String soortVraag) {
        if (soortVraag.equals("MC")) {

        }
        if (soortVraag.equals("Open")) {

        }
        if (soortVraag.equals("Ja/Nee")) {

        }
        else {
            return
        }
    }
 */

}


