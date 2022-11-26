
package Clases;

import javax.swing.table.DefaultTableModel;


public class PilaLibro 
{
     //Apuntador principal de la estructura
   public Libro pilaLibro;

    public PilaLibro() 
    {
        pilaLibro = null;
    }
   
    //Operacion para agregar al inicio de la pila un nodo
    public void pushLibro(String nombre, String seccion,  int paginas, float tamaño)
    {
        //Crear el nuevo nodo con el valor
        Libro nuevo = new Libro(nombre,seccion,paginas,tamaño);
        
        if(pilaLibro == null)
        {
            //Se agrega el primer nodo a la pila
            pilaLibro = nuevo;
        }
        else
        {
            Libro aux = pilaLibro;
            pilaLibro = nuevo;
            nuevo.setAptSiguiente(aux);
        } 
    }
    
    public String  recorrerPilaLibro()
    {
        Libro aux = pilaLibro;
        String valor= "Libro:\n";
        
        if(pilaLibro == null)
        {
            valor = "\nLa pila esta vacia";
        }
        else
        {
            while(aux != null)
            {
                valor += ("Nombre: "+aux.getNombre()+"\n");
                valor += ("Seccion:"+aux.getSeccion()+"\n");
                valor += ("Paginas: "+aux.getPaginas()+"\n");
                valor += ("Tamaño:"+aux.getTamaño()+"\n");
                
                aux = aux.getAptSiguiente();
            }
        }
        return valor;
    }
    
    
    public void popLibro()
    {
        Libro aux = pilaLibro;
        
        if(pilaLibro == null)
        {
            System.out.println("Pila esta vacia");
        }
        else
        {
            if(aux.getAptSiguiente() == null)
            {
                pilaLibro = null;
            }
            else
            {
                pilaLibro = aux.getAptSiguiente();
            }
            
            System.out.println("Primer elemento eliminado");
        }
        
    }
    
    public DefaultTableModel ListaLibro()
    {
        
        DefaultTableModel modelo = new DefaultTableModel();
        Libro aux = pilaLibro;
        String[] cabecera = {"Nombre","Seccion","Paginas","Tamaño"};
        modelo.setColumnIdentifiers(cabecera);
        Object[] arreglo = new Object[4]; //Un arreglo para las los atributos de la pila
        
        
        if(pilaLibro == null)
        {
            System.out.println("No hay elementos en la Pila");
        }
        else
        {
            System.out.println("Elementos a imprimir");
            while(aux != null)
            {
                arreglo[0] =  aux.getNombre();
                arreglo[1] = aux.getSeccion();
                arreglo[2] = aux.getPaginas();
                arreglo[3] = aux.getTamaño();
                modelo.addRow(arreglo); //Esto es para las filas de la tabla
                aux = aux.getAptSiguiente();
                
            }
        }
        
        return modelo;
    }
    
}
