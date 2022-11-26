
package Clases;


public class Alumno 
{
    private String nombre;
    private int codigo;
    private String direccion;
    private int telefono;
    private Alumno aptSiguiente;

    public Alumno()
    {
        this.nombre = "";
        this.codigo = 0;
        this.direccion = "";
        this.telefono = 0;
        this.aptSiguiente = null;
    }

    public Alumno(String nombre, int codigo, String direccion,int telefono)
    {
        this.nombre = nombre;
        this.codigo = codigo;
        this.direccion = direccion;
        this.telefono = telefono;
        this.aptSiguiente = null;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public Alumno getAptSiguiente() {
        return aptSiguiente;
    }

    public void setAptSiguiente(Alumno aptSiguiente) {
        this.aptSiguiente = aptSiguiente;
    }   
}
