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
public class NODO_STRING {
    NODO_STRING derecho;
     NODO_STRING izquierdo;
     NODO_STRING padre;
    String  info;

    public String getInfo() {
        return info;
    }
     
    NODO_STRING (String y){
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
    public void getPostorder(NODO_STRING s){
        // postOrden:Izquierda, Derecha,Raiz
       // System.out.print(info.toString()+", ");
        if (s!=null) {
            getPostorder(s.izquierdo);
            getPostorder(s.derecho);
            System.out.print(s.info+", ");
        }
    }
    public void getInorder(NODO_STRING Risa){
      //inorder:Izquierda, Raiz,Derecha
        if (Risa!=null) {
            getInorder(Risa.izquierdo);
            System.out.print(Risa.info+", ");
            getInorder(Risa.derecho);
        }
    }

    public void add_nodos(String buscar, NODO_STRING a){
        
    if (buscar.equals(a.getInfo())){
                    if(izquierdo==null){
                        this.izquierdo=new NODO_STRING(buscar);
                        izquierdo.padre=this;
                    }else{
                        izquierdo.add_nodos(buscar, a.izquierdo);
                    }
                }else{
                    if(derecho==null){
                        this.derecho=new NODO_STRING(buscar); 
                        derecho.padre=this;
                    }else{derecho.add_nodos(buscar, a.derecho);}
}
     }
    
  public void comparar( NODO_STRING a){
      String aux="";
      NODO_STRING solve=a;
      if (a!=null) {
          if (solve.getInfo().equals(a.getInfo())) {
              if (solve.izquierdo==null) {
                  solve.izquierdo=new NODO_STRING(a.info);
                      solve.izquierdo.padre=this;
              }else{
                        solve.izquierdo.comparar(a.izquierdo);
                    }aux=a.info;
              
          }else {
              if(solve.derecho==null){
                        solve.derecho=new NODO_STRING(a.info); 
                        solve.derecho.padre=this;
                    }else{solve.derecho.comparar(a.derecho);}
              aux=a.info;
              
          }
      }solve.getInorder(solve);
  }
}
