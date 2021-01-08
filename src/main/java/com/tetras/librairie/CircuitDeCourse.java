package com.tetras.librairie;

public class CircuitDeCourse {
    private Array<VoitureDuChampionnatDeFormuleUn> VoituresDeCourse = new Array<VoitureDuChampionnatDeFormuleUn>();

    public ajouterVoiture(Voiture voiture){
        VoituresDeCourse.add(voiture);
    }

    public CircuitDeCourse(){

    }

    public Array<VoitureDuChampionnatDeFormuleUn> getVoitures(){
        return this.VoituresDeCourse;
    }
}