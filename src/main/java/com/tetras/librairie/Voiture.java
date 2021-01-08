package com.tetras.librairie;

public class Voiture{
    
    private String constructeur;
    private String couleur;

    public Voiture(String theConstructeur, String theCouleur){
        this.constructeur   = theConstructeur;
        this.couleur        = theCouleur;
    }

    public void acclerer() {
    }

    public void tourner(Bool direction) {
    }

    public void freiner() {
    }

    public String getCouleur(){
        return this.couleur;
    }

    public String getConstructeur(){
        return this.constructeur;
    }
}