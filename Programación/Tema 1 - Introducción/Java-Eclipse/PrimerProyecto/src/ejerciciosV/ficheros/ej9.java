package ejerciciosV.ficheros;

import java.io.*;
import java.util.*;

public class ej9 {
    // ATRIBUTOS    
    private static String[] list;
    private static String absolutePath;
    private static File elementoSeleccionado;
    private static Scanner input = new Scanner(System.in);
    // GETTERS & SETTERS
    public static void setList(File file){
        list = file.list();
    }

    public static String[] getList(){
        return list;
    }

    public static void setAbsolutePath(File file) {
        absolutePath = file.getAbsolutePath();
    }

    public static String getAbsolutePath(){
        return absolutePath;
    }

    public static String getList(int i){
        if(i >= 0 && i < list.length)
            return list[i] + "";
        return "";
    }

    public static void setElementooSeleccionado(File file){
        elementoSeleccionado = file;
    }

    public static File getElementoSeleccionado(){
        return elementoSeleccionado;
    }

    // MÉTODOS
    public static void listDir(File file){
        try{
            setList(file);
            setAbsolutePath(file);
            for(int i = 0; i < list.length; i++){
                System.out.print(i + ".- " + list[i]);
                File element = new File(file.getAbsolutePath(), list[i]);
                if(element.isDirectory())
                    System.out.print("\\");
                System.out.println();
            }
        } catch (SecurityException e){
            System.err.println("No se puede acceder a la ruta.");
        }
    }

    public static void select(int index){
        elementoSeleccionado = new File(getList(index));
        System.out.println("Se ha seleccionado el elemento: " + elementoSeleccionado);
        propiedades(elementoSeleccionado);
    }

    public static void propiedades(File file){
        System.out.println("Las propiedades del elemento son:");
        System.out.print("Ruta absoluta: " + file.getAbsolutePath());
        System.out.print("\nEl elemento es un ");
        if(file.isDirectory())
            System.out.print("directorio");
        else
            System.out.print("archivo");
        System.out.println("\nFecha última modificación: " + new Date(file.lastModified()));
        System.out.println("¿Está oculto?: " + file.isHidden());
        System.out.println("¿Se puede leer?: " + file.canRead());
        System.out.println("¿Se puede escribir?: " + file.canWrite());
        System.out.println("¿Se puede ejecutar?: " + file.canExecute());
        System.out.println("Tamaño: " + file.length() + " bytes");
        System.out.println("Nombre: " + file.getName());
        System.out.println("Directorio que lo contiene: " + file.getParent());
    }

    public static void mkdir(){
        File file = new File(elementoSeleccionado.getAbsolutePath());
        file.mkdir();
        System.out.println("Se ha creado una nueva carpeta correctamente");
    }

    public static void crearArchivo(){
        try{
            File file = new File(elementoSeleccionado.getAbsolutePath());
            file.createNewFile();
            System.out.println("Se ha creado un nuevo archivo correctamente");
        } catch (IOException e){
            System.out.println("No se ha podido crear el archivo");
        }
    }

    public static void rename(File newName){
        String nombre = elementoSeleccionado.getName();
        elementoSeleccionado.renameTo(newName);
        System.out.println("Se ha renombrado `" + nombre + "` a `" + newName.getName() + "`");
    }

    public static void delete(){
        if(elementoSeleccionado.delete()){
            System.out.println("Se ha borrado el elemento correctamente.");
            System.out.println("Vuelva a elegir otro elemento:");
            listDir(new File(absolutePath));
            select(input.nextInt());
            input.nextLine();
        } else {
            System.err.println("No se ha borrado el elemento.");
        }
    }

    public static void reposicionar(){
        setElementooSeleccionado(new File(elementoSeleccionado.getParent()));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduza una ruta: ");
        listDir(new File(sc.nextLine()));
        System.out.print("\nSelecciona un indice: ");
        select(sc.nextInt());
        sc.nextLine();
        int decision;
        do{
            System.out.println("Seleccione una operación:");
            System.out.println("1.- Crear un directorio dentro del directorio actual");
            System.out.println("2.- Crear un archivo dentro del directorio actual");
            System.out.println("3.- Cambiar el nombre del elemento actual");
            System.out.println("4.- Eliminar elemento actual");
            System.out.println("5.- Posicionarse en el directorio padre del elemento actual");
            System.out.println("6.- Salir del programa");
            System.out.print("Respuesta: ");
            switch(decision = sc.nextInt()){
                case 1:
                    mkdir();
                    break;
                case 2:
                    crearArchivo();
                    break;
                case 3:
                    sc.nextLine();
                    System.out.print("Introduzca el nuevo nombre: ");
                    rename(new File(sc.nextLine()));
                    break;
                case 4:
                    delete();
                    break;
                case 5:
                    reposicionar();
                    break;
                default:
                    System.err.println("Seleccione un número del 1 al 6");
            }
        } while(decision != 6);
    }
}
