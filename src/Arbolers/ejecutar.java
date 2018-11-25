package Arbolers;

import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author usuario
 */
public class ejecutar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Almacenar admin= new Almacenar();
        Clasificacion Admin= new Clasificacion();
        /*
        int opc = 0, elemento;
        String nombre;
        Arbol arbolito = new Arbol();
        do {
            try {
                opc = Integer.parseInt(JOptionPane.showInputDialog(null, "1) agregar arbol"
                        + "\n2) inorder" + "\n3)buscar " +"\n4) eliminar"+ "\nelige opcion", JOptionPane.QUESTION_MESSAGE));
                switch (opc) {
                    case 1:
                        elemento = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingres eel numerodel Nodo",
                                "agregando Nodo", JOptionPane.QUESTION_MESSAGE));
                        nombre = JOptionPane.showInputDialog(null, "ingrese el nombre del nodo"
                                + "", JOptionPane.QUESTION_MESSAGE);
                        arbolito.Add_Nodo(elemento, nombre);
                    case 2:
                        System.out.println("");
                        if (!arbolito.vacio()) {
                            arbolito.Inorder(arbolito.raiz);
                        } else {

                            JOptionPane.showMessageDialog(null, "el arbol esta vacio\n.Aplicacion finalizada" + JOptionPane.QUESTION_MESSAGE);
                            break;
                        }
                        break;
                    case 3:
                        if (!arbolito.vacio()) {
                            System.out.println("");
                            elemento = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero del Nodo para buscar", "buscando"));
                            if (arbolito.buscarNodo(elemento) == null) {
                                // JOptionPane.showMessageDialog(null, "NODO NO ENCONTRADO");
                                System.out.println("Nodo no encontrado");
                            } else {
                                System.out.println("Nodo encontrado: " + arbolito.buscarNodo(elemento));
                            }
                        }
                        break;
                    case 4:
                        if (!arbolito.vacio()) {
                            System.out.println("");
                            elemento = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero del Nodo para eliminar", "elimiar"));
                            if (arbolito.eliminar(elemento) == false) {
                                JOptionPane.showMessageDialog(null, "NODO NO ENCONTRADO");
                                //System.out.println("Nodo no encontrado");
                            } else {
                                JOptionPane.showMessageDialog(null, "NODO HA SIDO ELIMINADO");
                            }
                        }
                        break;
                    case 5:
                        JOptionPane.showMessageDialog(null, "aplicacion finalizada" + JOptionPane.QUESTION_MESSAGE);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Error, aplicacion finalizada" + JOptionPane.QUESTION_MESSAGE);
                        break;
                }

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Error");
            }
        } while (opc != 5);*/
        
        
        ejecutar ra= new ejecutar();
        ra.llamar_total(Admin);
        ra.llamar_parcial(admin);
    }
public void llamar_total(Clasificacion Admin){
   Admin.ejecutar();
}
public void llamar_parcial(Almacenar admin){
    admin.menu();
}

    String estado = "";

    public void getAgregar(String boxEstado) {
        estado = boxEstado;
        //full, libro,  tema,  subtema, archivo
 Almacenar admin = new Almacenar();
 Clasificacion Admin= new Clasificacion();
        System.out.println(estado);
        JOptionPane.showMessageDialog(null, estado);
        do {
            try {
                switch (estado) {
                    case "libro":
                       Admin.ejecutar();
                        break;
                    case "tema":
                         admin.temas_Agregar();
                        break;
                    case "subtema":
                         admin.subtemas_Agregar();
                        break;
                    case "archivo":
                        break;
                    case "salir":

                        break;
                }
            } catch (NullPointerException e) {
                JOptionPane.showMessageDialog(null, "error,, aplicacion finalizada" + JOptionPane.QUESTION_MESSAGE);
            }
        } while (estado != "salir");
    }

    public void mostrar() {
        JOptionPane.showMessageDialog(null, "El valor de combo box es: " + estado);

    }
}
