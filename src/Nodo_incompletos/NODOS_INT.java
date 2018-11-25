package Nodo_incompletos;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sulay2016
 */
public class NODOS_INT {
    NODOS_INT derecho;
     NODOS_INT izquierdo;
     NODOS_INT padre;
    int  info;
    public NODOS_INT(int y){
        this.info=y; 
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
    public void getPostorder(NODOS_INT s){
        // postOrden:Izquierda, Derecha,Raiz
       // System.out.print(info.toString()+", ");
        if (s!=null) {
            getPostorder(s.izquierdo);
            getPostorder(s.derecho);
            System.out.print(s.info+", ");
        }
    }
    public void getInorder(NODOS_INT Risa){
      //inorder:Izquierda, Raiz,Derecha
        if (Risa!=null) {
            getInorder(Risa.izquierdo);
            System.out.print(Risa.info+", ");
            getInorder(Risa.derecho);
        }
    }

    public int getInfo() {
        return info;
    }
    public void add_nodos(int buscar){
        if (buscar<=info){
            if(izquierdo==null){
                this.izquierdo=new NODOS_INT(buscar);
                izquierdo.padre=this;
            }else{
                izquierdo.add_nodos(buscar);
            }
        }else{
            if(derecho==null){
                this.derecho=new NODOS_INT(buscar); 
                derecho.padre=this;
            }else{derecho.add_nodos(buscar);
            }
        }
    }
    public void comparar(NODOS_INT a){
        /*un Nodo que entra mas un auxiliar */
      int aux=0;
      NODOS_INT solve= new NODOS_INT(aux);
      if (a!=null) {
          /**
           * como el primer nodo ya esta inicilizado 
           * para relaizarlo creemos el getinfo para compararlo con aux que tammbien es un int igualado a cero
           * de tal manera que queden a la ziquierda los mneores y a la derecha los mayores
           * para alamcenarlo lo agregamos al nodo auxliar
           * finalmente lo llamamos por el metodo inorder para presentarlo por pantalla
          */
          if (a.getInfo()<=aux) {
              if (solve.izquierdo==null) {
                  solve.izquierdo=new NODOS_INT(a.info);
                  solve.izquierdo.padre=this;
              }else{
                  solve.izquierdo.add_nodos(a.info);
              }aux=a.info;
          }else if(a.getInfo()>aux){
              if(solve.derecho==null){
                  solve.derecho=new NODOS_INT(a.info); 
                  solve.derecho.padre=this;
              }else{solve.derecho.add_nodos(info);}
              aux=a.info;
          }
      }solve.getInorder(solve);
  }
}
