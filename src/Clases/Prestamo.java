
package Clases;


public class Prestamo 
{
    private int diasPrestado; 
    private int cantidad;
    private String fechaRealizado;
    private String fechaDevuelto;
    private Prestamo aptSiguiente;

    public Prestamo(int diasPrestado, int cantidad, String fechaRealizado, String fechaDevuelto) {
        this.diasPrestado = diasPrestado;
        this.cantidad = cantidad;
        this.fechaRealizado = fechaRealizado;
        this.fechaDevuelto = fechaDevuelto;
        this.aptSiguiente = null;
    }

    public Prestamo() {
        this.diasPrestado = 0;
        this.cantidad = 0;
        this.fechaRealizado = "";
        this.fechaDevuelto = "";
        this.aptSiguiente = null;
    }
    
    
    
    public int getDiasPrestado() {
        return diasPrestado;
    }

    public void setDiasPrestado(int diasPrestado) {
        this.diasPrestado = diasPrestado;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getFechaRealizado() {
        return fechaRealizado;
    }

    public void setFechaRealizado(String fechaRealizado) {
        this.fechaRealizado = fechaRealizado;
    }

    public String getFechaDevuelto() {
        return fechaDevuelto;
    }

    public void setFechaDevuelto(String fechaDevuelto) {
        this.fechaDevuelto = fechaDevuelto;
    }
    
    public Prestamo getAptSiguiente() {
        return aptSiguiente;
    }

    public void setAptSiguiente(Prestamo aptSiguiente) {
        this.aptSiguiente = aptSiguiente;
    }
    
    
}
