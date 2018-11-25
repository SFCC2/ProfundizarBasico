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
public class Pila_Lista<T>{
        private Pila pila;

        public Pila_Lista() {
            pila = null;
        }
        
        public void print(){
            Pila temporal;
            temporal = pila;
            if(temporal != null){
                while(temporal.siguiente != null){
                    System.out.println(temporal.elemento);
                    temporal = temporal.siguiente;
                }
                System.out.println(temporal.elemento);
            }
        }
        
        public void push(T elemento){
            Pila nueva;
            nueva= new Pila(elemento);
            
            if(pila == null){
                pila = nueva;
            }else{
                nueva.siguiente = pila;
                pila = nueva;
            }
            
        }
        
        
        public void pop(){
            if(pila == null){
                return;
            }else{
                if(pila.siguiente == null){
                    vaciarPila();  
                }else{
                    pila = pila.siguiente;
                }
            }
        }
        
        public void vaciarPila(){
            while (pila!=null) {            
                pila = null;
            }
        }
    }
