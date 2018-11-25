package Nodo_incompletos;

import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Sulay2016
 */
public class ejecutar_Nodos {

    /**
     * @pSulay Cupitra Actividad. árbol binario comparacion
     */
    NODOS_INT t;
    NODO_STRING R;
    NODOS_INT dinamico;
    NODO_STRING dinamico1;

    public static void main(String[] args) {
        /* System.out.println("Nodo ordenamiendot numeors");
        NODOS_INT t = new NODOS_INT(1);
        t.add_nodos(11);
        t.add_nodos(2);
        t.add_nodos(3);
        t.add_nodos(4);
        t.add_nodos(6);
        t.add_nodos(-1);
        t.getInorder(t);
        System.out.println("\norganizados de menores ala izquierda y mayores a la derecha");
        t.comparar(t);
        System.out.println("Nodo ordenamiendot letras");
        NODO_STRING R = new NODO_STRING("z");
        R.add_nodos("b", R);
        R.add_nodos("c", R);
        R.add_nodos("d", R);
        R.add_nodos("e", R);
        R.add_nodos("a", R);
        System.out.println("");
        R.getInorder(R);
        System.out.println("\norganizados de menores ala izquierda y mayores a la derecha");
        R.comparar(R);*/
        //String importe = Integer.toString(900);
// o
        ejecutar_Nodos admin = new ejecutar_Nodos();
       /* admin.menu(admin);*/
        admin.NodoDinamico_String();
    }

    public void NodoEstatico_int() {
        ejecutar_Nodos admin = new ejecutar_Nodos();
        // NODOS_INT t= new NODOS_INT(1);
        t = new NODOS_INT(1);
        t.add_nodos(11);
        t.add_nodos(2);
        t.add_nodos(3);
        t.add_nodos(4);
        t.add_nodos(6);
        t.add_nodos(-1);
        t.getInorder(t);
        System.out.println("\norganizados de menores ala izquierda y mayores a la derecha");
        t.comparar(t);
        admin.menu(admin);
    }

    public void NodoEstatico_String() {
        ejecutar_Nodos admin = new ejecutar_Nodos();
        System.out.println("Nodo ordenamiendot letras");
        // NODO_STRING R= new NODO_STRING("z");
        R = new NODO_STRING("z");
        R.add_nodos("b", R);
        R.add_nodos("c", R);
        R.add_nodos("d", R);
        R.add_nodos("e", R);
        R.add_nodos("a", R);
        System.out.println("");
        R.getInorder(R);
        System.out.println("\norganizados de menores ala izquierda y mayores a la derecha");
        R.comparar(R);
         admin.menu(admin);
    }

    public void NodoDinamico_int() {
        ejecutar_Nodos admin = new ejecutar_Nodos();
        int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de arboles: "));
        JOptionPane.showMessageDialog(null, "la cantidad de arboles es: " + cantidad);
        dinamico = new NODOS_INT(cantidad);
        for (int i = 0; i < cantidad; i++) {
            int indice = Integer.parseInt(JOptionPane.showInputDialog("ingresse el dato para llenar nodo"));
            dinamico.add_nodos(indice);
        }
         admin.menu(admin);
    }

    public void NodoDinamico_String() {
        ejecutar_Nodos admin = new ejecutar_Nodos();
        int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de arboles: "));
        JOptionPane.showMessageDialog(null, "la cantidad de arboles es: " + cantidad);
        /*int entero = 900;
String mensaje = String.valueOf(entero);
        System.out.println(mensaje);*/
        //String mensaje = String.valueOf(cantidad);
        //dinamico1 = new NODO_STRING(mensaje);
        for (int i = 0; i < cantidad; i++) {
           String mensaje = JOptionPane.showInputDialog("ingresse el dato para llenar nodo");
            dinamico1.add_nodos(mensaje, dinamico1);
        }
 admin.menu(admin);
    }
public void menu(ejecutar_Nodos admin){
    int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese :\n1) agregar\n2) Mostrar\n3)  eliminar\n4) salir "));
        switch (cantidad) {
            case 1:
                admin.agregar(admin);
                break;
            case 2:
                admin.mostrar();
                break;
            case 3:
                admin.NodoDinamico_int();
                break;
            case 4:
                admin.NodoDinamico_String();
                break;
            default:
                JOptionPane.showMessageDialog(null, "Aplicacon finalizada", "hasta luego", JOptionPane.QUESTION_MESSAGE);
                break;
}
}

    
    
    public void agregar(ejecutar_Nodos admin) {
        int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese para agregar:\n1) Nodo estatico int\n2) Nodo estatico String\n3)  Nodo dinamico int\n4) Nodo dinamico String\n5) salir "));
        switch (cantidad) {
            case 1:
                admin.NodoEstatico_int();
                break;
            case 2:
                admin.NodoEstatico_String();
                break;
            case 3:
                admin.NodoDinamico_int();
                break;
            case 4:
                admin.NodoDinamico_String();
                break;
            case 5:
                JOptionPane.showMessageDialog(null, "Aplicacon finalizada");
                break;                
            default:
                JOptionPane.showMessageDialog(null, "Aplicacon finalizada", "hasta luego", JOptionPane.QUESTION_MESSAGE);
                break;

        }
    }/* NODOS_INT t;
    NODO_STRING R;
    NODOS_INT dinamico;
    NODO_STRING dinamico1;*/
    public void mostrar() {
        int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese para mostar inventario:\n1) Nodo estatico int\n2) Nodo estatico String\n3)  Nodo dinamico int\n4) Nodo dinamico String\n5) salir "));
        switch (cantidad) {
            case 1:
                orden_int(t);

                break;
            case 2:
                orden_String(R);

                break;
            case 3:
                orden_int(dinamico);
                break;
            case 4:
                orden_String(dinamico1);
                break;
            case 5:
                JOptionPane.showMessageDialog(null, "Aplicacon finalizada");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Aplicacon finalizada", "hasta luego", JOptionPane.QUESTION_MESSAGE);
                break;

        }
    }

    public void orden_int(NODOS_INT t) {
        int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese para mostar inventario:\n1) Innorder\n2) Postorden\n3)  Preorder\n4) salir"));
        switch (cantidad) {
            case 1:
                t.getInorder(t);

                break;
            case 2:
                t.getPostorder(t);

                break;
            case 3:
                t.getPreorder();
                break;
            case 4:
                 JOptionPane.showMessageDialog(null, "Aplicacon finalizada");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Aplicacon finalizada", "hasta luego", JOptionPane.QUESTION_MESSAGE);
                break;
        }
    }

    public void orden_String(NODO_STRING R) {
        int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese para mostar inventario:\n1) Nodo estatico int\n2) Nodo estatico String\n3)  Nodo dinamico int\n4) Nodo dinamico String "));
         switch (cantidad) {
            case 1:
                R.getInorder(R);

                break;
            case 2:
                R.getPostorder(R);

                break;
            case 3:
                R.getPreorder();
                break;
            case 4:
                 JOptionPane.showMessageDialog(null, "Aplicacon finalizada");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Aplicacon finalizada", "hasta luego", JOptionPane.QUESTION_MESSAGE);
                break;
        }
    }
}
