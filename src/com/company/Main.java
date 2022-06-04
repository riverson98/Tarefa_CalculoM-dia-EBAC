package com.company;

import com.company.service.CalculaNotas;

public class Main {

    public static void main(String[] args) {

        int mediaCalculada = CalculaNotas.calculaMedia(9, 10 , 6, 5);

        System.out.println("a sua média é " + mediaCalculada);
    }
}
