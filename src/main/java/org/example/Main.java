package org.example;

import org.example.clasesHalloween.Fiesta;
import org.example.clasesHalloween.Invitado;
import org.example.clasesHalloween.Lugar;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner entradaPorTeclado=new Scanner(System.in);
        Invitado objetoInvitado = new Invitado();
        Lugar objetoLugar = new Lugar();
        Fiesta objetoFiesta = new Fiesta();

        System.out.println("FIESTA");
        System.out.println("GASTOS DE COMIDA: ");
        objetoFiesta.setCostosAlimentos(entradaPorTeclado.nextDouble());
        System.out.println("el costo del alimento es: "+ objetoFiesta.getCostosAlimentos());



    }
}