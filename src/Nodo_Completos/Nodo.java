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
public class Nodo {
     Nodo  derecho;
     Nodo  izquierdo;
     Nodo  padre=null;
    String  Dato;
    int info;

    public Nodo( int x,String y) {
        this.info = x;
        this.Dato = y;
    }
    
    public void getPreorder(){
        //Preorder: Raiz,Izquierda,Derecha
         System.out.print(info+", ");
         if (izquierdo!=null) {
             izquierdo.getPreorder();
             //System.out.println(izquierdo.info);
         }if (derecho!=null) {
             derecho.getPreorder();
         }
    }
    public void getPostorder(Nodo  s){
        // postOrden:Izquierda, Derecha,Raiz
       // System.out.print(info.toString()+", ");
        if (s!=null) {
            getPostorder(s.izquierdo);
            getPostorder(s.derecho);
            System.out.print(s.info+", ");
        }
    }
    public void getInorder(Nodo  Risa){
      //inorder:Izquierda, Raiz,Derecha
        if (Risa!=null) {
            getInorder(Risa.izquierdo);
            System.out.print(Risa.info+", ");
            getInorder(Risa.derecho);
        }
    }
    /*String  Dato;
    int info;*//*
    public void add_nodos(int buscar, String dato){
        if (buscar<=info){
            if(izquierdo==null){
                this.izquierdo=new Nodo(buscar, dato);
                izquierdo.padre=this;
            }else{
                izquierdo.add_nodos(buscar, dato);
            }
        }else{
            if(derecho==null){
                this.derecho=new Nodo(buscar, dato);
                derecho.padre=this;
            }else{
                derecho.add_nodos(buscar, dato);
            }
        }
    }
   */
       
}
