package com.tetras.application;

import com.tetras.librairie.RequeteHttp;

public class ServeurWeb{
    public static int repondre(RequeteHttp theRequete){
        String urlPath = theRequete.getUrl().path;
        if(urlPath == null){
            return 500;
        }else if(urlPath.contains("/evilurl")){
            return 403;
        }else{
            return 200;
        }
    }
}