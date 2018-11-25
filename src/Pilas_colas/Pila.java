package Pilas_colas;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 * @author Sulay Cupitra
 * Manejo de Pilas y colas entregar
 * Asignatura: Sistemas 3
 */
public class Pila<T> {
    T elemento;
    Pila siguiente;

    public Pila(T indice) {
        elemento=indice;
        siguiente=null;
    }
}


