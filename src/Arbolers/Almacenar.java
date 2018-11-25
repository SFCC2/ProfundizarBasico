/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arbolers;

import javax.swing.JOptionPane;

/**
 *
 * @author Sulay Cupítra y Ivan Vargas
 * 
 */
public class Almacenar {

    Arbol libro = new Arbol();
    Arbol temas = new Arbol();
    Arbol subtemas = new Arbol();
    Clasificacion total = new Clasificacion();

    public static void main(String[] args) {

        Almacenar admin = new Almacenar();
        /*
        admin.libros_Agregar(libro);
        admin.temas_Agregar(temas);
        admin.subtemas_Agregar(subtemas);
        admin.mostra_inventario(libro, temas, subtemas);
         */
        admin.menu();
    }
/*un menu de prueba para averiguar si funciona*/
    public void menu() {
         Almacenar admin = new Almacenar();
        int opc = 0;
        do {
            try {
                opc = Integer.parseInt(JOptionPane.showInputDialog("ingrese:\n1) ingresar libro\n2)ingresar tema\n3) ingresa subtema"
                        + "\n4) inventario\n5) buscar\n6) eliminar\n7) salir"));
                switch (opc) {
                    case 0:
                        total.ejecutar();
                        break;
                    case 1:
                        admin.libros_Agregar();
                        break;
                    case 2:
                        admin.temas_Agregar();
                        break;
                    case 3:
                        admin.subtemas_Agregar();
                        break;
                    case 4:
                        admin.mostra_inventario();
                        break;
                    case 5:
                        admin.buscar_inventario();
                        break;
                    case 6:
                        admin.eliminar_inventario();
                        break;
                    case 7:
                        JOptionPane.showMessageDialog(null, "aplicacion finalizada" + JOptionPane.QUESTION_MESSAGE);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "error,, aplicacion finalizada" + JOptionPane.QUESTION_MESSAGE);
                        break;
                }
            } catch (NullPointerException e) {
                JOptionPane.showMessageDialog(null, "error,, aplicacion finalizada" + JOptionPane.QUESTION_MESSAGE);
            }
        } while (opc != 7);

    }
/*en los arboles solicita el nombre e indice para poder agregarlos de lo contrario no funciona*/
    public void libros_Agregar() {
        int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de libros: "));
        JOptionPane.showMessageDialog(null, "la cantidad de libro es: " + cantidad);
        for (int i = 0; i < cantidad; i++) {
            int indice = Integer.parseInt(JOptionPane.showInputDialog("ingresse numero indice de importancia del libro"));
            String nombre = JOptionPane.showInputDialog("ingresse nombre del libro");
            libro.Add_Nodo(indice, nombre);
        }
        System.out.println("los libros son: ");
        libro.Inorder(libro.raiz);
        System.out.println("");
        System.out.println("");
    }

    public void temas_Agregar() {
        int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de temas: "));
        JOptionPane.showMessageDialog(null, "la cantidad de temas es: " + cantidad);
        for (int i = 0; i < cantidad; i++) {
            int indice = Integer.parseInt(JOptionPane.showInputDialog("ingresse numero indice de importancia del libro"));
            String nombre = JOptionPane.showInputDialog("ingresse nombre del libro");
            temas.Add_Nodo(indice, nombre);
        }
        System.out.println("los temas son: ");
        temas.Inorder(temas.raiz);
        System.out.println("");
        System.out.println("");
    }

    public void subtemas_Agregar() {
        int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de subtemas: "));
        JOptionPane.showMessageDialog(null, "la cantidad de subtemas es: " + cantidad);
        for (int i = 0; i < cantidad; i++) {
            int indice = Integer.parseInt(JOptionPane.showInputDialog("ingrese numero indice de importancia del libro"));
            String nombre = JOptionPane.showInputDialog("ingresse nombre del libro");
            subtemas.Add_Nodo(indice, nombre);
        }
        System.out.println("los subtemas son: ");
        subtemas.Inorder(subtemas.raiz);
        System.out.println("");
        System.out.println("");
    }
/*permite ver todo lo de inventario almacenado , escogiendo una de las opciones del menu*/
    public void mostra_inventario() {
      int t=0;
        do {
            try {
              int  opc = Integer.parseInt(JOptionPane.showInputDialog("Ingrese para inventario:\n1)  libros\n2) temas\n3) subtemas\n4)salir"));
              t=opc;
                switch (opc) {
                    case 1:
                        System.out.println("los libros son: ");
                        libro.Inorder(libro.raiz);
                        break;
                    case 2:
                        System.out.println("");
                        System.out.println("los temas son: ");
                        temas.Inorder(temas.raiz);
                        System.out.println("");
                        System.out.println("");
                        break;
                    case 3:
                        System.out.println("");
                        System.out.println("los subtemas son: ");
                        subtemas.Inorder(subtemas.raiz);
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
/*permite ver todo lo de inventario almacenado para buscar, escogiendo una de las opciones del menu*/
    public void buscar_inventario() {
        int opc = 0;
        do {
            try {
                opc = Integer.parseInt(JOptionPane.showInputDialog("Ingrese para buscar:\n1)  libros\n2)  temas\n3) subtemas\n4)salir"));
                switch (opc) {
                    case 1:
                        if (!libro.vacio()) {
                            System.out.println("");
                            int elemento = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero del indice del libro para buscar", "buscando"));
                            if (libro.buscarNodo(elemento) == null) {
                                // JOptionPane.showMessageDialog(null, "NODO NO ENCONTRADO");
                                System.out.println("Nodo no encontrado");
                            } else {
                                System.out.println("Nodo encontrado: " + libro.buscarNodo(elemento).info);
                            }
                        }
                        break;
                    case 2:
                        if (!temas.vacio()) {
                            System.out.println("");
                            int elemento = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero del indice del tema para buscar", "buscando"));
                            if (temas.buscarNodo(elemento) == null) {
                                // JOptionPane.showMessageDialog(null, "NODO NO ENCONTRADO");
                                System.out.println("Nodo no encontrado");
                            } else {
                                System.out.println("Nodo encontrado: " + temas.buscarNodo(elemento).info);
                            }
                        }
                        break;
                    case 3:
                        if (!subtemas.vacio()) {
                            System.out.println("");
                            int elemento = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero del indice del libro para buscar", "buscando"));
                            if (subtemas.buscarNodo(elemento) == null) {
                                // JOptionPane.showMessageDialog(null, "NODO NO ENCONTRADO");
                                System.out.println("Nodo no encontrado");
                            } else {
                                System.out.println("Nodo encontrado: " + subtemas.buscarNodo(elemento).info);
                            }
                        }
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
        } while (opc != 4);
    }
/*permite ver todo lo de inventario almacenado para eliminar, escogiendo una de las opciones del menu*/
    public void eliminar_inventario() {
        int opc = 0;
        do {
            try {
                opc = Integer.parseInt(JOptionPane.showInputDialog("Ingrese para borrar:\n1) inventario libros\n2) inventario temas\n3)inventario subtemas\n4)salir"));
                switch (opc) {
                    case 1:/*
                        System.out.println("los libros son: ");
                        a.Inorder(a.raiz);*/
                        if (!libro.vacio()) {
                            System.out.println("");
                            int elemento = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero del indice del libro para eliminar", "elimiar"));
                            if (libro.eliminar(elemento) == false) {
                                JOptionPane.showMessageDialog(null, "NODO NO ENCONTRADO");
                                //System.out.println("Nodo no encontrado");
                            } else {
                                JOptionPane.showMessageDialog(null, "NODO HA SIDO ELIMINADO");
                            }
                        }

                        break;
                    case 2:
                        if (!temas.vacio()) {
                            System.out.println("");
                            int elemento = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero del indice tema para eliminar", "elimiar"));
                            if (temas.eliminar(elemento) == false) {
                                JOptionPane.showMessageDialog(null, "NODO NO ENCONTRADO");
                                //System.out.println("Nodo no encontrado");
                            } else {
                                JOptionPane.showMessageDialog(null, "NODO HA SIDO ELIMINADO");
                            }
                        }
                        break;
                    case 3:
                        if (!subtemas.vacio()) {
                            System.out.println("");
                            int elemento = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero del indice subtema para eliminar", "elimiar"));
                            if (subtemas.eliminar(elemento) == false) {
                                JOptionPane.showMessageDialog(null, "NODO NO ENCONTRADO");
                                //System.out.println("Nodo no encontrado");
                            } else {
                                JOptionPane.showMessageDialog(null, "NODO HA SIDO ELIMINADO");
                            }
                        }
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
        } while (opc != 4);
    }

  
}
