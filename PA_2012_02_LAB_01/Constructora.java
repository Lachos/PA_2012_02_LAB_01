import java.util.Scanner;
/**
 * Write a description of class Constructora here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Constructora
{
    private Tarea tareas[];
    private int contador;
    private Scanner scanner;

    public Constructora()
    {
        tareas = new Tarea[100];
        contador = 0;
        scanner = new Scanner(System.in);
    }

    public void agregarTarea()
    {
        System.out.println("################## NUEVA TAREA ###################");
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Duracion esperada: ");
        int duracionEsperada = Integer.parseInt(scanner.nextLine());
        System.out.print("Porcentaje de avance: ");
        int porcentajeAvance = Integer.parseInt(scanner.nextLine());
        System.out.print("Duracion real: ");
        int duracionReal = Integer.parseInt(scanner.nextLine());
        System.out.print("Representante: ");
        String representante = scanner.nextLine();
        System.out.println("##################################################");
        System.out.println();
        
        Tarea tarea = new Tarea(nombre, duracionEsperada, porcentajeAvance, duracionReal, representante);
        tareas[contador] = tarea;
        contador++;
    }
    
    public void imprimirMenuPrincipal()
    {
        System.out.println("###################### MENU ######################");
        System.out.println(" Opcion (1): Crear nueva tarea");
        System.out.println(" Opcion (2): Cantidad de tareas en ejecucion");
        System.out.println(" Opcion (3): Cantidad de tareas sin comenzar");
        System.out.println(" Opcion (4): Cantidad de tareas terminadas");
        System.out.println(" Opcion (5): Lista de tareas no terminadas");
        System.out.println(" Opcion (6): Lista de tareas terminadas");
        System.out.println(" Opcion (0): Salir");
        System.out.println("##################################################");
        System.out.println();
        System.out.print("Opcion: ");
    }
    
    public void tareasEnEjecucion()
    {
        int tareasEnEjecucion = 0;
        
        System.out.println("###### CANTIDAD DE TAREAS EN EJECUCION ###########");
        
        for(int i = 0; i < tareas.length; i++) //Recorre el arreglo de tareas
        {
            if(tareas[i] != null && tareas[i].getPorcentajeAvance() > 0 && tareas[i].getPorcentajeAvance() < 100)
            {
                tareasEnEjecucion++; //Aumento las tareas en ejecucion segun el enunciado
            }
        }
        
        if(tareasEnEjecucion == 0)
        {
            System.out.println("No posee tareas en ejecucion.");
        } 
        else
        {
            System.out.println("Tareas en ejecucion: " + tareasEnEjecucion + ".");
        }
        
        System.out.println("##################################################");
        System.out.println();
    }
    
    public void tareasSinComenzar()
    {
        int tareasSinComenzar = 0;
        
        System.out.println("###### CANTIDAD DE TAREAS SIN COMENZAR ###########");
        
        for(int i = 0; i < tareas.length; i++) //Recorre el arreglo de tareas
        {
            if(tareas[i] != null && tareas[i].getPorcentajeAvance() == 0)
            {
                tareasSinComenzar++; //Aumento las tareas sin comenzar segun el enunciado
            }
        }
        
        if(tareasSinComenzar == 0)
        {
            System.out.println("No existen tareas sin comenzar.");
        } 
        else
        {
            System.out.println("Tareas sin comenzar: " + tareasSinComenzar + ".");
        }
        
        System.out.println("##################################################");
        System.out.println();
    }
    
    public void tareasTerminadas()
    {
        int tareasTerminadas = 0;
        
        System.out.println("######### CANTIDAD DE TAREAS TERMINADAS ###########");
        
        for(int i = 0; i < tareas.length; i++) //Recorre el arreglo de tareas
        {
            if(tareas[i] != null && tareas[i].getPorcentajeAvance() == 100)
            {
                tareasTerminadas++; //Aumento las tareas terminadas segun el enunciado
            }
        }
        
        if(tareasTerminadas == 0)
        {
            System.out.println("No existen tareas terminadas.");
        } 
        else
        {
            System.out.println("Tareas terminadas: " + tareasTerminadas + ".");
        }
        
        System.out.println("##################################################");
        System.out.println();
    }
    
    public void listaTareasNoTerminadas()
    {
        int tareasNoTerminadas = 0;
        
        System.out.println("############ TAREAS NO TERMINADAS ################");
        
        for(int i = 0; i < tareas.length; i++) //Recorre el arreglo de tareas
        {
            if(tareas[i] != null && tareas[i].getPorcentajeAvance() < 100)
            {
                System.out.println();
                System.out.println("Nombre: " + tareas[i].getNombre());
                System.out.println("Porcentaje de avance: " + tareas[i].getPorcentajeAvance() + "%");
                System.out.println("Responsable: " + tareas[i].getResponsable());
                tareasNoTerminadas++;
            }
        }
        
        if(tareasNoTerminadas == 0)
        {
            System.out.println("Todas las tareas estan terminadas.");
        }
        
        System.out.println();
        System.out.println("##################################################");
        System.out.println();
    }
    
    public void listaTareasTerminadas()
    {
        int tareasTerminadas = 0;
        
        System.out.println("############### TAREAS TERMINADAS ################");
        
        for(int i = 0; i < tareas.length; i++) //Recorre el arreglo de tareas
        {
            if(tareas[i] != null && tareas[i].getPorcentajeAvance() == 100 && tareas[i].getDuracionReal() > tareas[i].getDuracionEsperada())
            {
                System.out.println();
                System.out.println("Nombre: " + tareas[i].getNombre());
                System.out.println("Porcentaje de avance: " + tareas[i].getPorcentajeAvance() + "%");
                System.out.println("Responsable: " + tareas[i].getResponsable());                
                tareasTerminadas++;
            }
        }
        
        if(tareasTerminadas == 0)
        {
            System.out.println("No existen tareas terminadas con esa caracteristica.");
        }
        
        System.out.println();
        System.out.println("##################################################");
        System.out.println();
    }
    
    public void menu()
    {
        int opcion;
        
        do
        {
            imprimirMenuPrincipal();
            opcion = Integer.parseInt(scanner.nextLine());
            System.out.println();
            
            switch( opcion )
            {
                case 1: agregarTarea(); break;
                case 2: tareasEnEjecucion(); break;
                case 3: tareasSinComenzar(); break;
                case 4: tareasTerminadas(); break;
                case 5: listaTareasNoTerminadas(); break;
                case 6: listaTareasTerminadas(); break;
            }
        } while ( opcion != 0 );        
    }
}
