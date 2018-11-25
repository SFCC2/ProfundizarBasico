package Pilas_colas;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 * * @author Sulay Cupitra
 * Manejo de Pilas y colas entregar
 * Asignatura: Sistemas 3
 */
public class Cola_Lista <T>{
    protected Cola cola;
    
    public Cola_Lista(){
        cola=null;
    }
    
    public void print(){
        Cola temporal;
        temporal = cola;
        if(temporal != null){
            while(temporal.siguiente != null){
                System.out.println(temporal.elemento);
                temporal = temporal.siguiente;
            }
            System.out.println(temporal.elemento);
        }
    }
    
    public void push(T indice){
        Cola nuevo;
        nuevo= new Cola(indice);
        Cola temporal;
        
        if(cola == null){
            cola = nuevo;
        }else{
            temporal = cola;
            
            while(temporal.siguiente != null){
                temporal = temporal.siguiente;
            }
            
            temporal.siguiente = nuevo;
        }
    }
    
    public void pop(){
        if(cola == null){
            return;
        }else{
            if(cola.siguiente == null){
                vaciarCola();
            }else{
                cola = cola.siguiente;
            }
        }
    }
    
    public void vaciarCola(){
        while (cola!=null) {            
            cola = null;
        }
    }
}

