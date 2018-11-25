package Arbolers;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * Ivan Vargas y Sulay Cupítra
 */
public class Nodo  {
     Nodo  derecha;
     Nodo  izquierda;
     Nodo  padre;
    String info;
    int contador;

    public Nodo(int cont,String infor) {
        this.derecha = null;
        this.izquierda = null;
        this.padre = null;
        this.info = infor;
        this.contador = cont;
    }
    
    
     public void getPreorder(){
        //Preorder: Raiz,Izquierda,Derecha
         if (izquierda!=null) {
             izquierda.getPreorder();
             //System.out.println(izquierdo.info);
         }if (derecha!=null) {
             derecha.getPreorder();
         }
    }
    public void getPostorder(Nodo s){
        // postOrden:Izquierda, Derecha,Raiz
       // System.out.print(info.toString()+", ");
        if (s!=null) {
            getPostorder(s.izquierda);
            getPostorder(s.derecha);
            System.out.print(s.info+", \n");
        }
    }
    public void getInorder(Nodo Risa){
      //inorder:Izquierda, Raiz,Derecha
        if (Risa!=null) {
            getInorder(Risa.izquierda);
            System.out.print(Risa.info+",\n ");
            getInorder(Risa.derecha);
        }
    }
    
}