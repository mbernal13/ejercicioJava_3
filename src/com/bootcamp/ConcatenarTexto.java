package com.bootcamp;

public class ConcatenarTexto {
    public static void main(String[] args){
        String[] nombres = {"Miguel", "Augusto", "Bernal", "Ramirez"};
        String nombreConcatenado = "";
        for(String nombre : nombres){
            nombreConcatenado += nombre + " ";
        }
        System.out.println(nombreConcatenado);
    }
}
