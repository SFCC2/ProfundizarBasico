/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nodo_Completos;

/**
 *
 * @author Sulay2016
 */
public class Admin {

    Nodo raiz = null;

    
    
    public boolean vacio() {
        return raiz == null;
    }

    public Nodo buscarNodo(int d, Nodo aux) {
         aux = raiz;
        while (aux.info != d) {
            if (d < aux.info) {
                aux = aux.izquierdo;
            } else {
                aux = aux.derecho;
            }
            if (aux == null) {
                return null;
            }
        }
        return aux;
    }

    public boolean eliminar(int d) {
        Nodo aux = raiz;
        Nodo padre = raiz;
        boolean izquierda = true;
        validar(aux, izquierda, d);
        if (aux.izquierdo==null && aux.derecho==null) {
            if (aux==raiz) {
                raiz=null;
            }else if(izquierda){
                padre.izquierdo=null; 
            }else{
                padre.derecho=null;
            }
        }else if(aux.derecho==null){
            if (aux==raiz) {
                raiz= aux.izquierdo;
            }else if(izquierda){
                padre.izquierdo=aux.izquierdo;
            }else{
                padre.derecho=aux.izquierdo;
            }
        }else if(aux.izquierdo==null){
            if (aux==raiz) {
                raiz=aux.derecho;
            }else if(izquierda){
                padre.izquierdo=aux.derecho;
            }else{
                padre.derecho=aux.izquierdo;
            }
        }else{
            Nodo Reemplazo= reemplazo(aux);
            if (aux==raiz) {
                raiz=Reemplazo;
            }else if(izquierda){
                padre.izquierdo=Reemplazo;
            }else{
                padre.derecho=Reemplazo;
            }Reemplazo.izquierdo=aux.izquierdo;
        }return true;

    }

    public boolean validar(Nodo aux, boolean izquierda, int d) {
        while (aux.info != d) {
            if (d < aux.info) {
                izquierda = true;
                aux = aux.izquierdo;
            } else {
                izquierda = false;
                aux = aux.derecho;
            } if (aux == null) {
                izquierda = false;
                return false;
            }
        }
        return izquierda;
    }
    public Nodo reemplazo(Nodo antiguo){
        Nodo padre_nuevo= antiguo;
        Nodo reemplaso= antiguo;
        Nodo aux= antiguo.derecho;
        while (aux!=null) {            
            padre_nuevo=reemplaso;
            reemplaso=aux;
            aux=aux.izquierdo;
        }
        if (reemplaso!=antiguo.derecho) {
            padre_nuevo.izquierdo=reemplaso.derecho;
            reemplaso.derecho= antiguo.derecho;
        }System.out.println("El nodo reemplazo es:"+reemplaso);
        return reemplaso;
    }
}
