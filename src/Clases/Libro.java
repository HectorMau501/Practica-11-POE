

package Clases;



public class Libro 
{
    private String nombre;
    private String seccion;
    private int paginas;
    private float tamaño;
    private Libro aptSiguiente;

    public Libro() 
    {
        this.nombre = null;
        this.seccion = null;
        this.paginas = 0;
        this.tamaño = 0;
    }

    public Libro(String nombre, String seccion, int paginas, float tamaño) {
        this.nombre = nombre;
        this.seccion = seccion;
        this.paginas = paginas;
        this.tamaño = tamaño;
        this.aptSiguiente = null;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public float getTamaño() {
        return tamaño;
    }

    public void setTamaño(float tamaño) {
        this.tamaño = tamaño;
    }

    public Libro getAptSiguiente() {
        return aptSiguiente;
    }

    public void setAptSiguiente(Libro aptSiguiente) {
        this.aptSiguiente = aptSiguiente;
    }
    
    
    
    
    
}
