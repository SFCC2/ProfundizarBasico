package Pilas_colas;



import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * @author Sulay Cupitra Manejo de Pilas y colas entregar Asignatura: Sistemas 3
 */
public class ejecutar_Pilascolas {

    /*

    public static cola(){
        Cola_lista nueva= new Cola_lista();
        nueva.push(1);
        nueva.push(2);
        nueva.push(3);
        nueva.push(4);
        nueva.push(5);
        print(nueva.pop());
    }
    public static Pila(){
        pila
    }*/
    Cola_Lista cola_int = new Cola_Lista();
    Pila_Lista pila_int = new Pila_Lista();
     Cola_Lista cola_String = new Cola_Lista();
    Pila_Lista pila_String = new Pila_Lista();

    public static void main(String[] args) {
         ejecutar_Pilascolas admin= new ejecutar_Pilascolas();
        /*
        System.out.println("COLA");
        Cola_Lista nueva = new Cola_Lista();
        nueva.push(0);
        nueva.push(2);
        nueva.push(3);

        nueva.print();
        System.out.println("");

        nueva.pop();

        nueva.print();
        System.out.println("");

        System.out.println("PILA");
        Pila_Lista nuevalista = new Pila_Lista();
        nuevalista.push(0);
        nuevalista.push(2);
        nuevalista.push(3);

        nuevalista.print();
        System.out.println("");

        nuevalista.pop();

        nuevalista.print();
        System.out.println("");*/
admin.menu();
    }

    public void menu() {
        int opc = Integer.parseInt(JOptionPane.showInputDialog("Ingrese:\n1) cola int\n2) pila int\n3) cola String\n4) pila String\n5) mostrar\n6)finalizar"));
        switch (opc) {
            case 1:
                Cola_int();
                //System.out.println("h");
               // menu();
                break;
            case 2:
                //System.out.println("o");
                pila_int();
                //menu();
                break;
                 case 3:
                Cola_String();
                //System.out.println("h");
               // menu();
                break;
            case 4:
                //System.out.println("o");
                pila_String();
                //menu();
                break;
            case 5:
               // System.out.println("l");
                mostrar();
                //menu();
                break;
                
            default:
                JOptionPane.showMessageDialog(null, "programa finalizado"," hasta luego",JOptionPane.QUESTION_MESSAGE);
                break;
        }
    }
    
    public void mostrar(){
        
        int opc = Integer.parseInt(JOptionPane.showInputDialog("Ingrese:\n1) mostrar cola int \n2) mostrar pila int\n3) mostrar cola String \n4) mostrar pila String\n6)finalizar"));
        switch (opc) {
            case 1:
              Mostrar_cola_Int();
                //System.out.println("h");
               // menu();
                break;
            case 2:
                //System.out.println("o");
                 Mostrar_pila_Int();
                //menu();
                break;
            case 3:
               // System.out.println("l");
                Mostrar_cola_String();
                //menu();
                break;
            case 4:
                //System.out.println("a");
               Mostrar_pila_String();
                //menu();
                break;
            default:
                JOptionPane.showMessageDialog(null, "programa finalizado"," hasta luego",JOptionPane.QUESTION_MESSAGE);
                break;
        }
    }

    public void Cola_int() {
        int opc = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de cola"));
        for (int i = 0; i < opc; i++) {
            int num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el dato de la cola"));
            cola_int.push(num);
        }
        menu();
    }

    public void pila_int() {
        int opc = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de Pila"));
        for (int i = 0; i < opc; i++) {
            int num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el dato de la Pila"));
            pila_int.push(num);
        }
        menu();
    }
 public void Cola_String() {
        int opc = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de cola"));
        for (int i = 0; i < opc; i++) {
            String num =JOptionPane.showInputDialog("Ingrese el dato de la cola");
            cola_String.push(num);
        }
        menu();
    }

    public void pila_String() {
        int opc = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de pila"));
        for (int i = 0; i < opc; i++) {
            String num = JOptionPane.showInputDialog("Ingrese el dato de la pila");
            pila_String.push(num);
        }
        menu();
    }
    public void Mostrar_pila_Int() {
        System.out.println("Pila int");
        pila_int.print();
        System.out.println("");
        menu();
    }

    public void Mostrar_cola_Int() {
        System.out.println("Cola int");
        cola_int.print();
        System.out.println("");
       menu();
    }
    public void Mostrar_pila_String() {
        System.out.println("Pila String");
        pila_String.print();
        System.out.println("");
        menu();
    }

    public void Mostrar_cola_String() {
        System.out.println("Cola String");
        cola_String.print();
        System.out.println("");
       menu();
    }
}
