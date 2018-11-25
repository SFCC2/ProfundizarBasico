/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alternativo;

import javax.swing.JOptionPane;

/**
 *
 * @author Sulay2016
 */
public class Arbol_ejecutar {

    Arbol normal = new Arbol();

    public static void main(String[] args) {
        Arbol_ejecutar admin = new Arbol_ejecutar();
        admin.menu();
    }

    public void menu() {
        Arbol_ejecutar admin = new Arbol_ejecutar();
        int opc = 0;
        do {
            try {
                opc = Integer.parseInt(JOptionPane.showInputDialog("ingrese:\n1) ingresar Arbol\n2)inventario\n3) buscar"
                        + "\n4) eliminar\n5) salir"));
                switch (opc) {
                    case 1:
                        admin.Arbol_Agregar();
                        break;
                    case 2:
                        admin.mostra_inventario();
                        break;
                    case 3:
                        admin.buscar_inventario();
                        break;
                    case 4:
                        admin.eliminar_inventario();
                        break;
                    case 5:
                        JOptionPane.showMessageDialog(null, "aplicacion finalizada" + JOptionPane.QUESTION_MESSAGE);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "error,, aplicacion finalizada" + JOptionPane.QUESTION_MESSAGE);
                        break;
                }
            } catch (NullPointerException e) {
                JOptionPane.showMessageDialog(null, "error,, aplicacion finalizada" + JOptionPane.QUESTION_MESSAGE);
            }
        } while (opc != 5);

    }

    public void Arbol_Agregar() {
        int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de arboles: "));
        JOptionPane.showMessageDialog(null, "la cantidad de arboles es: " + cantidad);
        for (int i = 0; i < cantidad; i++) {
            int indice = Integer.parseInt(JOptionPane.showInputDialog("ingresse numero indice de importancia del arbol"));
            String nombre = JOptionPane.showInputDialog("ingresse nombre del arbol");
            normal.Add_Nodo(indice, nombre);
        }
        System.out.println("los arboles son: ");
        normal.Inorder(normal.raiz);
        System.out.println("");
    }

    public void mostra_inventario() {
        int t = 0;
        do {
            try {
                int opc = Integer.parseInt(JOptionPane.showInputDialog("Ingrese para inventario organizado en:\n1)  inorder\n2) preorden\n3) postorden\n4)salir"));
                t = opc;
                switch (opc) {
                    case 1:
                        System.out.println("Arbol en inorder: ");
                        normal.Inorder(normal.raiz);
                        break;
                    case 2:
                        System.out.println("");
                        System.out.println("Arbol en Preorden: ");
                        normal.raiz.getPreorder();
                        System.out.println("");
                        System.out.println("");
                        break;
                    case 3:
                        System.out.println("");
                        System.out.println("Arbol en  Postorden: ");
                        normal.Postorder(normal.raiz);
                        System.out.println("");
                        System.out.println("");
                        break;
                    case 4:
                        JOptionPane.showMessageDialog(null, "aplicacion finalizada" + JOptionPane.QUESTION_MESSAGE);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "error,, aplicacion finalizada" + JOptionPane.QUESTION_MESSAGE);
                        break;
                }
            } catch (NullPointerException e) {
                JOptionPane.showMessageDialog(null, "error,, aplicacion finalizada" + JOptionPane.QUESTION_MESSAGE);
            }
        } while (t != 4);
    }

    public void buscar_inventario() {
        if (!normal.vacio()) {
            System.out.println("");
            int elemento = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero del indice del libro para buscar", "buscando"));
            if (normal.buscarNodo(elemento) == null) {
                // JOptionPane.showMessageDialog(null, "NODO NO ENCONTRADO");
                System.out.println("Nodo no encontrado");
            } else {
                System.out.println("Nodo encontrado: " + normal.buscarNodo(elemento).info);
            }
        }
    }

    public void eliminar_inventario() {
        if (!normal.vacio()) {
            System.out.println("");
            int elemento = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero del indice del libro para eliminar", "elimiar"));
            if (normal.eliminar(elemento) == false) {
                JOptionPane.showMessageDialog(null, "NODO NO ENCONTRADO");
                //System.out.println("Nodo no encontrado");
            } else {
                JOptionPane.showMessageDialog(null, "NODO HA SIDO ELIMINADO");
            }
        }
    }
}
