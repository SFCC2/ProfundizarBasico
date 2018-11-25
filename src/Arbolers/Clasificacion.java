/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arbolers;

import javax.swing.JOptionPane;

/**
 *
 * @author   Ivan Vargas y Sulay Cupítra
 */
public class Clasificacion {
/*se contruye un libro completo, agregando temas, subtemas y archivos en una sola variable
    para asi mismo agregarlos al nodo
    */
    String nombre;
    String tema;
    String subtema;
    String archivo = null;
    Arbol total = new Arbol();
    Arbol libros = new Arbol();
    Arbol temass = new Arbol();
    Arbol subtemas = new Arbol();

    Nodo_String nuevo = new Nodo_String(archivo);

    public void llenar(String nombres, String temas, String subtemas) {
        this.nombre = nombres;
        this.tema = temas;
        this.subtema = subtemas;
    }

    public String completo(int indice) {

        String nombres = JOptionPane.showInputDialog("Ingrese el nombre del libro");
        librosCompleto_Agregar(libros, nombres, indice);
        String Temas = JOptionPane.showInputDialog("Ingrese el nombre del tema");
        temasCompleto_Agregar(temass, Temas, indice);
        String Subtemas = JOptionPane.showInputDialog("Ingrese el nombre del subtema");
        subtemasCompleto_Agregar(subtemas, Subtemas, indice);
        String archivo = JOptionPane.showInputDialog("Ingrese el contenido del archivo");
        nuevo.guardad(archivo);
        String Total = nombres + " " + Temas + " " + Subtemas;
        total.Add_Nodo(indice, Total);
        llenar(nombres, Temas, Subtemas);
        return Total;
    }
/*Tambien se le permite al usuario poder cambiar los indice si lo prefiere o seguir usando el automatizado, aun si el numero es errado, continua ejecutandose*/
    public void completarLibro_completo() {
        int z = Integer.parseInt(JOptionPane.showInputDialog("desea cambiar el indice de clasificacion de los libros:\n1) SI\n2) NO"));

        int opc = Integer.parseInt(JOptionPane.showInputDialog("ingrese la cantidad de libros"));

        for (int i = 0; i < opc; i++) {

            //int x = Integer.parseInt(JOptionPane.showInputDialog("desea cambiar el indice de clasificacion de los libros:\n1) SI\n2) NO"));
            /* switch (x) {
                    case 1:
                        int y = Integer.parseInt(JOptionPane.showInputDialog("ingrese el indice de importancia del libro"));
                        total.Add_Nodo(y, completo(opc));
                        break;
                    case 2:
                        total.Add_Nodo(i, completo(opc));
                        break;
                    default:
                        total.Add_Nodo(i, completo(opc));
                        break;*/
            if (z == 1) {
                int y = Integer.parseInt(JOptionPane.showInputDialog("ingrese el indice de importancia del libro"));
                total.Add_Nodo(y, completo(opc));
            } else {
                total.Add_Nodo(i, completo(opc));
            }
            ver(total);
        }

    }

    public void librosCompleto_Agregar(Arbol t, String nombre, int cantidad) {
        JOptionPane.showMessageDialog(null, "la cantidad de temas son: " + cantidad);
        int z = Integer.parseInt(JOptionPane.showInputDialog("desea cambiar el indice de clasificacion de los libros:\n1) SI\n2) NO"));
        for (int i = 0; i < cantidad; i++) {
            /*  int indice = Integer.parseInt(JOptionPane.showInputDialog("ingresse numero indice de importancia del libro"));
            JOptionPane.showMessageDialog(null, "ingresse nombre(s) libro(s)" + nombre);
            t.Add_Nodo(indice, nombre);*/
            if (z == 1) {
                int y = Integer.parseInt(JOptionPane.showInputDialog("ingrese el indice de importancia del libro"));
                t.Add_Nodo(y, nombre);
            } else {
                t.Add_Nodo(i, nombre);
            }
        }
        System.out.println("los libros son: ");
        t.Inorder(t.raiz);
        System.out.println("");
        System.out.println("");
    }

    public void temasCompleto_Agregar(Arbol t, String nombre, int cantidad) {
        JOptionPane.showMessageDialog(null, "la cantidad de temas son: " + cantidad);
        int z = Integer.parseInt(JOptionPane.showInputDialog("desea cambiar el indice de clasificacion de los libros:\n1) SI\n2) NO"));
        for (int i = 0; i < cantidad; i++) {
            if (z == 1) {
                int y = Integer.parseInt(JOptionPane.showInputDialog("ingrese el indice de importancia del libro"));
                t.Add_Nodo(y, nombre);
            } else {
                t.Add_Nodo(i, nombre);
            }
            /*  int indice = Integer.parseInt(JOptionPane.showInputDialog("ingresse numero indice de importancia del tema"));
            JOptionPane.showMessageDialog(null, " nombre(s)  temas(s)" + nombre);
            t.Add_Nodo(indice, nombre);*/
        }
        System.out.println("los temas son: ");
        t.Inorder(t.raiz);
        System.out.println("");
        System.out.println("");
    }

    public void subtemasCompleto_Agregar(Arbol t, String nombre, int cantidad) {
        JOptionPane.showMessageDialog(null, "la cantidad de subtemas son: " + cantidad);
        int z = Integer.parseInt(JOptionPane.showInputDialog("desea cambiar el indice de clasificacion de los libros:\n1) SI\n2) NO"));
        for (int i = 0; i < cantidad; i++) {
            /* int indice = Integer.parseInt(JOptionPane.showInputDialog("ingresse numero indice de importancia del subtema"));
            JOptionPane.showMessageDialog(null, " nombre(s)  subtemas(s)" + nombre);
            t.Add_Nodo(indice, nombre);*/
            if (z == 1) {
                int y = Integer.parseInt(JOptionPane.showInputDialog("ingrese el indice de importancia del libro"));
                t.Add_Nodo(y, nombre);
            } else {
                t.Add_Nodo(i, nombre);
            }
        }
        System.out.println("los temas son: ");
        t.Inorder(t.raiz);
        System.out.println("");
        System.out.println("");
    }

    public void ver(Arbol libro) {
        libro.Inorder(libro.raiz);
    }

    public void ejecutar() {
        Clasificacion admin = new Clasificacion();
        admin.completarLibro_completo();
    }
/*permite ver todo lo de inventario almacenado, escogiendo una de las opciones del menu*/
    public void inventario() {/*
        System.out.println("el orden de informacion es: nombre del libro, tema, subtema, archivos");
        total.Inorder(total.raiz);
        System.out.println("la clasificacion libros :\n ");
        libros.Inorder(libros.raiz);
        System.out.println("la clasificacion temas :\n ");
        temass.Inorder(temass.raiz);
        System.out.println("la clasificacion libros :\n ");
        subtemas.Inorder(subtemas.raiz);*/
        
        int t=0;
        do {
            try {
              int  opc = Integer.parseInt(JOptionPane.showInputDialog("Ingrese para inventario:\n0) libro completo:\n1)  libros\n2) temas\n3) subtemas\n4)salir"));
              t=opc;
                switch (opc) {
                    case 0:
                        System.out.println("el orden de informacion es: nombre del libro, tema, subtema, archivos");
                        total.Inorder(total.raiz);
                        break;
                    case 1:
                        System.out.println("los libros son: ");
                        libros.Inorder(libros.raiz);
                        break;
                    case 2:
                        System.out.println("");
                        System.out.println("los temas son: ");
                        temass.Inorder(temass.raiz);
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
/*permite ver todo lo de inventario almacenado para eliminar, escogiendo una de las opciones del menu*/
    public void eliminar() {
        int opc = 0;
        do {
            try {
                opc = Integer.parseInt(JOptionPane.showInputDialog("Ingrese para para:\n1)  libros\n2) temas\n3) subtemas\n4)salir"));
                switch (opc) {
                    case 1:
                        if (!libros.vacio()) {
                            System.out.println("");
                            int elemento = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero del indice del libro para eliminar", "elimiar"));
                            if (libros.eliminar(elemento) == false) {
                                JOptionPane.showMessageDialog(null, "NODO NO ENCONTRADO");
                                //System.out.println("Nodo no encontrado");
                            } else {
                                JOptionPane.showMessageDialog(null, "NODO HA SIDO ELIMINADO");
                            }
                        }
                        break;
                    case 2:
                        if (!temass.vacio()) {
                            System.out.println("");
                            int elemento = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero del indice del libro para eliminar", "elimiar"));
                            if (temass.eliminar(elemento) == false) {
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
                            int elemento = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero del indice del libro para eliminar", "elimiar"));
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
/*permite ver todo lo de inventario almacenado para buscar, escogiendo una de las opciones del menu*/
    public void buscar_inventario() {
        int opc = 0;
        do {
            try {
                opc = Integer.parseInt(JOptionPane.showInputDialog("Ingrese para buscar:\n1)  libros\n2)  temas\n3) subtemas\n4)salir"));
                switch (opc) {
                    case 1:
                        if (!libros.vacio()) {
                            System.out.println("");
                            int elemento = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero del indice del libro para buscar", "buscando"));
                            if (libros.buscarNodo(elemento) == null) {
                                // JOptionPane.showMessageDialog(null, "NODO NO ENCONTRADO");
                                System.out.println("Nodo no encontrado");
                            } else {
                                System.out.println("Nodo encontrado: " + libros.buscarNodo(elemento).info);
                            }
                        }
                        break;
                    case 2:
                        if (!temass.vacio()) {
                            System.out.println("");
                            int elemento = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero del indice del tema para buscar", "buscando"));
                            if (temass.buscarNodo(elemento) == null) {
                                // JOptionPane.showMessageDialog(null, "NODO NO ENCONTRADO");
                                System.out.println("Nodo no encontrado");
                            } else {
                                System.out.println("Nodo encontrado: " + temass.buscarNodo(elemento).info);
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
}
