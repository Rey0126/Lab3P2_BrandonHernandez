package lab3p2_brandonhernandez;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab3P2_BrandonHernandez {

    static Scanner sc = new Scanner(System.in);
    static Scanner scs = new Scanner(System.in);
    static ArrayList<Aplicaciones> Apps = new ArrayList();

    public static void main(String[] args) {

        boolean menu = true;

        while (menu) {

            System.out.println("""
                               == MENU ==
                               1. Administrador
                               2. Usuario
                               3. Salir
                               Ingrese una opcion: """);
            int opcion = sc.nextInt();

            switch (opcion) {

                case 1:
                    boolean menu2 = true;
                    while (menu2) {

                        System.out.println("""
                                       1. Agregar Aplicacion
                                       2. Biblioteca
                                       3. Actualizacion
                                       4. Eliminar Aplicacion
                                       5. Estadisticas de Desarrollo
                                       6. Salir
                                       Ingrese una opcion: """);
                        int opci = sc.nextInt();

                        switch (opci) {

                            case 1:

                                System.out.println("""
                                                   1. App de Utilidad
                                                   2. App de Juego
                                                   Ingrese una opcion: """);
                                int op = sc.nextInt();

                                switch (op) {

                                    case 1:
                                        addAppU();
                                        break;

                                    case 2:
                                        addAppJ();
                                        break;

                                    default:
                                        System.out.println("Opcion Invalida");

                                }

                                break;

                            case 2:
                                if (Apps.isEmpty()) {
                                    System.out.println("No hay aplicaciones en Biblioteca");
                                } else {
                                    printApps();
                                }
                                break;

                            case 3:
                                if (Apps.isEmpty()) {
                                    System.out.println("No hay aplicaciones en Biblioteca");
                                } else {
                                    printApps();
                                    System.out.println("Ingrese la aplicacion que desea actualizar:");
                                    int app = sc.nextInt() - 1;
                                    modificarApp(app);
                                }
                                break;

                            case 4:
                                if (Apps.isEmpty()) {
                                    System.out.println("No hay aplicaciones en Biblioteca");
                                } else {
                                    printApps();
                                    System.out.println("Ingrese la aplicacion que desea eliminar:");
                                    int app = sc.nextInt() - 1;
                                    Apps.remove(app);
                                }
                                break;

                            case 5:
                                if (Apps.isEmpty()) {
                                    System.out.println("No hay aplicaciones en Biblioteca");
                                } else {
                                    printEstadisticas();
                                }
                                break;

                            case 6:
                                menu2 = false;
                                break;

                            default:
                                System.out.println("Opcion Invalida");

                        }

                    }
                    break;

                case 2:
                    boolean menu3 = true;
                    while (menu) {
                        System.out.println("""
                                           1. Buscar por Nombre
                                           2. Buscar por Categoria
                                           3. Biblioteca
                                           4. Mostrar Descargas
                                           5. Eliminar Descargas
                                           6. Calificar Aplicacion
                                           7. Salir
                                           Ingrese una opcion:""");
                        int op = sc.nextInt();

                        switch (op) {

                            case 1:
                                if (Apps.isEmpty()) {
                                    System.out.println("No hay aplicaciones en Biblioteca");
                                } else {
                                    System.out.println("--- Buscar por Nombre ---");
                                    buscarNombre();
                                }
                                break;

                            case 2:
                                if (Apps.isEmpty()) {
                                    System.out.println("No hay aplicaciones en Biblioteca");
                                } else {
                                    System.out.println("--- Buscar por Categoria ---");
                                    printCategoria();
                                    System.out.println("Ingrese la categoria:");
                                    int catego = sc.nextInt() - 1;
                                    printAppC(catego);

                                }
                                break;

                            case 3:
                                if (Apps.isEmpty()) {
                                    System.out.println("No hay aplicaciones en Biblioteca");
                                } else {
                                    printApps();
                                }
                                break;

                            case 4:
                                if (Apps.isEmpty()) {
                                    System.out.println("No hay aplicaciones en Biblioteca");
                                } else {
                                    System.out.println("--- Mostrar Descargas ---");
                                    printDescargas();
                                }
                                break;

                            case 5:
                                if (Apps.isEmpty()) {
                                    System.out.println("No hay aplicaciones en Biblioteca");
                                } else {
                                    System.out.println("--- Eliminar Descargas ---");
                                    printDescargas();
                                    System.out.println("Ingrese la descarga que desea eliminar:");
                                    int des = sc.nextInt()-1;
                                    Apps.get(des).setEstado("No Descargada");
                                    System.out.println("Aplicacions desinstalada");
                                }
                                break;

                            case 6:
                                if (Apps.isEmpty()) {
                                    System.out.println("No hay aplicaciones en Biblioteca");
                                } else {
                                    printDescargadas();
                                    System.out.println("Ingrese la app que desea calificar:");
                                    int cali = sc.nextInt();
                                    calificar(cali);
                                    
                                }
                                break;

                            case 7:
                                menu3 = false;
                                break;

                            default:
                                System.out.println("OPcion Invalida");

                        }

                    }
                case 3:
                    menu = false;
                    break;

                default:
                    System.out.println("Opcion Invalida");

            }

        }

    }

    public static void addAppU() {

        System.out.println("--- Agregar Aplicaciones de Utilidad ---");
        System.out.println("Ingrese la categoria:");
        String cate = scs.next();
        System.out.println("Ingrese el nombre:");
        String name = scs.next();
        System.out.println("Ingrese el desarrollador:");
        String desarro = scs.next();
        System.out.println("Ingrese el precio:");
        double precio = sc.nextDouble();
        Apps.add(new Utilidad(cate, name, desarro, precio));
        System.out.println("--- Aplicacion Agregada ---");

    }

    public static void addAppJ() {

        System.out.println("--- Agregar Aplicaciones de Juegos ---");
        System.out.println("Ingrese la Edad recomendada:");
        int edad = sc.nextInt();
        System.out.println("Ingrese el nombre:");
        String name = scs.next();
        System.out.println("Ingrese el desarrollador:");
        String desarro = scs.next();
        System.out.println("Ingrese el precio:");
        double precio = sc.nextDouble();
        Apps.add(new Juegos(edad, name, desarro, precio));
        System.out.println("--- Aplicacion Agregada ---");

    }

    public static void printApps() {
        System.out.println("--- Aplicaciones en Biblioteca ---");
        System.out.println();
        boolean hay1 = false;
        boolean hay2 = false;

        for (Aplicaciones a : Apps) {

            if (a instanceof Utilidad) {
                hay1 = true;
                break;
            }

        }
        if (hay1) {
            System.out.println("--- Aplicaiones de Utilidad ---");
            for (Aplicaciones a : Apps) {
                if (a instanceof Utilidad) {
                    System.out.println("Aplicacion " + (Apps.indexOf(a) + 1) + ": " + a);
                }
            }
        } else {
            System.out.println("No hay aplicaciones de utlidad");
        }

        for (Aplicaciones a : Apps) {

            if (a instanceof Juegos) {
                hay2 = true;
                break;
            }

        }
        if (hay2) {
            System.out.println("--- Aplicaiones de Juegos ---");
            for (Aplicaciones a : Apps) {
                if (a instanceof Juegos) {
                    System.out.println("Aplicacion " + (Apps.indexOf(a) + 1) + ": " + a);
                }
            }
        } else {
            System.out.println("No hay aplicaciones de juegos");
        }

    }

    public static void modificarApp(int app) {

        boolean m = true;
        System.out.println("--- Actualizar Aplicacion ---");
        while (m) {
            System.out.println("""
                               1. Nombre
                               2. Desarrollador
                               3. Precio
                               4. Salir
                               Ingrese que atributo desea modificar:""");
            int op = sc.nextInt();

            switch (op) {

                case 1:
                    System.out.println("Ingrese el nuevo nombre:");
                    Apps.get(app).setNombre(scs.next());
                    break;

                case 2:
                    System.out.println("Ingrese el nuevo desarrollador:");
                    Apps.get(app).setDesarrollador(scs.next());
                    break;

                case 3:
                    System.out.println("Ingrese el nuevo precio:");
                    Apps.get(app).setPrecio(sc.nextDouble());
                    break;

                case 4:
                    m = false;
                    break;

                default:
                    System.out.println("Opcion Invalida");

            }
        }

    }

    public static void printEstadisticas() {

        System.out.println("--- Estadisticas de Desarrollador ---");
        for (Aplicaciones a : Apps) {
            System.out.println("Aplicacion: " + a.getNombre() + "\nNumero de Descargas: " + a.getDescargas() + "\nRating: " + a.getRating());
        }
    }

    public static void buscarNombre() {

        System.out.println("Ingrese el nombre de la App:");
        String name = scs.next();
        for (Aplicaciones a : Apps) {

            if (a.getNombre().equals(name)) {
                System.out.println(a);
                System.out.println("Deseas descargarla [1. Si / 2. No]:");
                int r = sc.nextInt();

                switch (r) {
                    case 1:
                        a.setDescargas(a.getDescargas() + 1);
                        a.setEstado("Descargada");
                        break;

                    case 2:
                        a.setEstado("No Descargada");
                        break;

                    default:
                        System.out.println("Opcion erronea");
                }

            } 

        }

    }

    public static void printCategoria() {

        for (Aplicaciones a : Apps) {

            if (a instanceof Utilidad) {
                System.out.println((Apps.indexOf(a) + 1) + " : " + ((Utilidad) a).getCatego());
            }

        }

    }

    public static void printAppC(int catego) {
        for (Aplicaciones a : Apps) {
            if (a instanceof Utilidad) {
                if (((Utilidad) a).getCatego().equals(((Utilidad) Apps.get(catego)).getCatego())) {
                    System.out.println((Apps.indexOf(a) + 1) + " : " + a);
                    System.out.println("Desea descargarla [1. Si / 2. No]:");
                    int opcion = sc.nextInt();

                    switch (opcion) {

                        case 1:
                            a.setDescargas(a.getDescargas() + 1);
                            a.setEstado("Descargada");
                            break;

                        case 2:
                            a.setEstado("No Descargada");
                            break;

                        default:
                            System.out.println("Opcion Invalida");

                    }
                } 
            }
        }

    }
    
    public static void printDescargas(){
        
        for (Aplicaciones a : Apps) {
            if(a.getEstado().equals("Descargada")){
                System.out.println("Descarga "+(Apps.indexOf(a)+1) + ": " + a);
            }
        }
        
    }
    
    public static void printDescargadas(){
        
        for (Aplicaciones a : Apps) {
            if(a.getEstado().equals("Descargada")){
                System.out.println("Aplicacion "+(Apps.indexOf(a)+1)+": " + a);
            }
        }
        
    }
    
    public static void calificar(int cali){
        
        System.out.println("Ingrese su calificacion [0 a 5]:");
        Apps.get(cali).setRating(sc.nextInt());
        System.out.println("Calificacion guardada");
        
    }

}
