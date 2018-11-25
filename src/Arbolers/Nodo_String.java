package Arbolers;

import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 *  @author Sulay Cupítra y Ivan Vargas
 */
public class Nodo_String {
     Nodo_String izquierdo;
    Nodo_String derecho;
    Nodo_String padre;
    String info;
    public Nodo_String(String y){
        this.info=y; 
    }
    //agrega un nodo con un avariable
    public void add_nodo(String buscar, Nodo_String a){
        Nodo_String aux=a;
        if (aux.info.compareToIgnoreCase(buscar)>0) {
            if (izquierdo==null) {
                aux.izquierdo=new Nodo_String(buscar);
                aux.izquierdo.padre=this;
            }else{
                aux.izquierdo.add_nodo(buscar, a.izquierdo);
            }
        }else {
            if (derecho==null) {
               aux.derecho=new Nodo_String(buscar);
               aux.derecho.padre=this;
            }else{
                aux.derecho.add_nodo(buscar, a.derecho);
            }
        }
    }
    /*los organiza en las diferentes tipos de orden decuaderdo con el nombre*/
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
    public void getInorder(Nodo_String Risa){
      //inorder:Izquierda, Raiz,Derecha
        if (Risa!=null) {
            getInorder(Risa.izquierdo);
            System.out.print(Risa.info+", ");
            getInorder(Risa.derecho);
            System.out.println("");
        }
    }
     public void getPostorder(Nodo_String s){
        // postOrden:Izquierda, Derecha,Raiz
       // System.out.print(info.toString()+", ");
        if (s!=null) {
            getPostorder(s.izquierdo);
            getPostorder(s.derecho);
            System.out.print(s.info+", ");
        }
     }
     /*recibe el contenido para separarlo y organizarlo alfabeticamente*/
     public void guardad(String val){
        String dividir = "[ ,.;()\n]+";
      String[] continuar;
      continuar = val.split(dividir);
        Nodo_String e = new Nodo_String(continuar[0]);
     for (String item : continuar) {
            e.add_nodo(item,e);
        }e.getInorder(e);
      //  JOptionPane.showMessageDialog(null, e.getClass().getInterfaces().length);
      JOptionPane.showMessageDialog(null, "el nuevo archivo es: "+val);
    }
}