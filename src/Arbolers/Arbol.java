/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arbolers;

/**
 *
  * @author  Ivan Vargas y Sulay Cupítra 
 */
public class Arbol {
     Nodo raiz=null;
    public  void Add_Nodo( int d,String nombre ) {
        Nodo nuevo= new Nodo(d,nombre);
        if (raiz==null) {
            raiz=nuevo;
        }else{
            Nodo aux=raiz;
            Nodo padre;
            while (true) {                
                padre=aux;
                if (d<aux.contador) {
                    aux=aux.izquierda;
                    if (aux==null) {
                        padre.izquierda=nuevo;
                   return;
                    }
                }else{
                    aux=aux.derecha;
                    if (aux==null) {
                        padre.derecha=nuevo;
                        return;
                    }
                }
            }
        }
    }
    public boolean vacio(){
        return raiz==null;
    }
    public void Inorder(Nodo Risa){
      //inorder:Izquierda, Raiz,Derecha
        if (Risa!=null) {
            Inorder(Risa.izquierda);
            System.out.print(Risa.info+", ");
            Inorder(Risa.derecha);
        }
    }
    public void Preorder(Nodo Risa){
        //Preorder: Raiz,Izquierda,Derecha
         if (Risa.izquierda!=null) {
             Risa.izquierda.getPreorder();
             //System.out.println(izquierdo.info);
         }if (Risa.derecha!=null) {
             Risa.derecha.getPreorder();
         }
    }
    public void Postorder(Nodo s){
        // postOrden:Izquierda, Derecha,Raiz
       // System.out.print(info.toString()+", ");
        if (s!=null) {
            Postorder(s.izquierda);
            Postorder(s.derecha);
            System.out.print(s.info+", ");
        }
    }
    public Nodo buscarNodo(int d){
       Nodo aux=raiz;
        while (aux.contador!=d) {            
            if (d<aux.contador) {
                aux=aux.izquierda;
            }else{
                aux=aux.derecha;
            }
            if (aux==null) {
                return null;
            }
        } return aux;
    }
    
    public boolean eliminar(int d){
        Nodo aux=raiz;
        Nodo padre=raiz;
        boolean izqueirda=true;
        while (aux.contador!=d){
            if (d<aux.contador) {
                izqueirda=true;
                aux=aux.izquierda;
            }else{
                izqueirda=false;
                aux=aux.derecha;
            }
            if (aux==null) {
                return false;
            }
        }
        if (aux.izquierda==null && aux.derecha==null) {
            if (aux==raiz) {
                raiz=null;
            }else if(izqueirda){
                padre.izquierda=null;
            }else {
                padre.derecha=null;
            }
        }else if(aux.derecha==null){
            if (aux==raiz) {
                raiz=aux.izquierda;
            }else if(izqueirda){
                padre.izquierda=aux.izquierda;
            }else {
                padre.derecha=aux.izquierda;
            }
        }else if(aux.izquierda==null){
            if (aux==raiz) {
                raiz=aux.derecha;
            }else if(izqueirda){
                padre.izquierda=aux.derecha;
            }else {
                padre.derecha=aux.izquierda;
            }
        }else{
            Nodo reemplazo=obtenerRemplazo(aux);
            if (aux==raiz) {
                raiz=reemplazo;
            }else if(izqueirda){
                padre.izquierda=reemplazo;
            }else{
                padre.derecha=reemplazo;
            }
            reemplazo.izquierda=aux.izquierda;
        }return true;
    }//metodo encargado de retornar el nodo reemplazado
    public Nodo obtenerRemplazo(Nodo rem){
        Nodo reemplazo_padre=rem;
        Nodo reemplazo=rem;
        Nodo aux=rem.derecha;
        while(aux!=null){
            reemplazo_padre=reemplazo;
            reemplazo=aux;
            aux=aux.izquierda;
        }
        if (reemplazo!=rem.derecha) {
            reemplazo_padre.izquierda=reemplazo.derecha;
        reemplazo.derecha=rem.derecha;
        }
        System.out.println("El nodo reemplazo es :" +reemplazo);return reemplazo;
    }
}

