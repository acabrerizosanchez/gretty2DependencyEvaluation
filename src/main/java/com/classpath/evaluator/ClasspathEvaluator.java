package com.classpath.evaluator;


import java.net.URL;
import java.net.URLClassLoader;

public class ClasspathEvaluator{

    public static String getClasspath(){
        StringBuilder sb = new StringBuilder();
        ClassLoader cl = ClassLoader.getSystemClassLoader();

        URL[] urls = ((URLClassLoader)cl).getURLs();

        for(URL url: urls){
            sb.append(url.getFile());
            sb.append("<br>");
        }
        return sb.toString();
    }

}