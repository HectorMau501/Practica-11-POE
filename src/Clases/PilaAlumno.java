
package Clases;

import javax.swing.table.DefaultTableModel;


public class PilaAlumno 
{
    //Apuntador principal de la estructura
    public Alumno pilaAlumno;
    int cantNodos;

    public PilaAlumno() 
    {
        pilaAlumno = null;
        cantNodos = 0;
    }

    public int getCantNodos() {
        return cantNodos;
    }

    public void setCantNodos(int cantNodos) {
        this.cantNodos = cantNodos;
    }
   

    //Operacion para agregar al inicio de la pila un nodo
    public void push(String nombre, int codigo,  String direccion, int telefono)
    {
        //Crear el nuevo nodo con el valor
        Alumno nuevo = new Alumno(nombre,codigo,direccion,telefono);
        nuevo.setNombre(nombre);
        nuevo.setCodigo(codigo);
        nuevo.setDireccion(direccion);
        nuevo.setTelefono(telefono);
        
        if(pilaAlumno == null)
        {
            //Se agrega el primer nodo a la pila
            pilaAlumno = nuevo;
        }
        else
        {
            Alumno aux = pilaAlumno;
            pilaAlumno = nuevo;
            nuevo.setAptSiguiente(aux);
        } 
        cantNodos++;
    }
    

    
    public String  recorrerPila()
    {
        Alumno aux = pilaAlumno;
        String valor= "Alumnos:\n";
        
        if(pilaAlumno == null)
        {
            System.out.println("La pila esta vacia");;
        }
        else
        {
            while(aux != null)
            {
                valor += ("Nombre: "+aux.getNombre()+"\n");
                valor += ("Codigo:"+aux.getCodigo()+"\n");
                valor += ("Direccion: "+aux.getDireccion()+"\n");
                valor += ("Telefono:"+aux.getTelefono()+"\n");
                
                aux = aux.getAptSiguiente();
            }
        }
        return valor;
    }
    
    
    public void pop()
    {
        Alumno aux = pilaAlumno;
        
        if(pilaAlumno == null)
        {
            System.out.println("Pila esta vacia");
        }
        else
        {
            if(aux.getAptSiguiente() == null)
            {
                pilaAlumno = null;
            }
            else
            {
                pilaAlumno = aux.getAptSiguiente();
            }
            
            System.out.println("Primer elemento eliminado");
        } 
    }
    
    public DefaultTableModel ListaAlumno()
    {
        
         Alumno aux = pilaAlumno;
        DefaultTableModel modelo = new DefaultTableModel();
       // String[] arreglo = new String[cantNodos];
        String[] cabecera = {"Nombre","Codigo","Direccion","Telefono"};
        modelo.setColumnIdentifiers(cabecera);
       
        Object[] arreglo = new Object[4];
        
        
        if(pilaAlumno == null)
        {
            System.out.println("Pila vacia.");
        }
        else
        {
            System.out.println("Elementos de la pila imprimir:");
            while(aux != null)
            {
                //System.out.println("Posicion"+i+":"+aux.getNombre());
                arreglo[0] = aux.getNombre();
                arreglo[1] = aux.getCodigo();
                arreglo[2] = aux.getDireccion();
                arreglo[3] = aux.getTelefono();
                modelo.addRow(arreglo);                
                aux = aux.getAptSiguiente();
                
            }
        }
        return modelo;
    } 
   
    
}
