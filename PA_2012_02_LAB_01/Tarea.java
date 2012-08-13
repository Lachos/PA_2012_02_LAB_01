
/**
 * Clase Tarea
 * 
 * @author Alex Rojas (@Shadow440)
 * @version #1.0
 */
public class Tarea
{
    private String nombre;
    private int duracionEsperada;
    private int porcentajeAvance;
    private int duracionReal;
    private String responsable;
    
    public Tarea(String nombre, int duracionEsperada, int porcentajeAvance, int duracionReal, String responsable)
    {
        this.nombre = nombre;
        this.duracionEsperada = duracionEsperada;
        this.porcentajeAvance = porcentajeAvance;
        this.duracionReal = duracionReal;
        this.responsable = responsable;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }
    
    public String getNombre()
    {
        return nombre;
    }
    
    public void setDuracionEsperada(int duracionEsperada)
    {
        this.duracionEsperada = duracionEsperada;
    }
    
    public int getDuracionEsperada()
    {
        return duracionEsperada;
    }
    
    public void setPorcentajeAvance(int porcentajeAvance)
    {
        this.porcentajeAvance = porcentajeAvance;
    }
    
    public int getPorcentajeAvance()
    {
        return porcentajeAvance;
    }
    
    public void setDuracionReal(int duracionReal)
    {
        this.duracionReal = duracionReal;
    }
    
    public int getDuracionReal()
    {
        return duracionReal;
    }
    
    public void setResponsable(String responsable)
    {
        this.responsable = responsable;
    }
    
    public String getResponsable()
    {
        return responsable;
    }
}
