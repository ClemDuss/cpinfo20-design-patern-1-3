package com.tetras.librairie;

public class RequeteHttp {
    private Url url;
    private Header headers;
    private Body body;

    public Url getUrl(){
        return url;
    }

    public RequeteHttp(){}

    public String afficher(){
        String result;
        result = "url:";
        result += url.path + ";";
        result += "headers:{"
        /* Pas très certain de mon foreach et de l'utilisation du dictionnaire
        foreach(h:headers.headers){
            result += h.getKey() + ":" + h.getValue();
        }
        /*
        result += "};";
        result += "content:";
        result += body.content + ";";
        
        return result;
    }
}