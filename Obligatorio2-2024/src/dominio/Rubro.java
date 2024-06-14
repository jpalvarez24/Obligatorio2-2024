

// Juan Pedro Alvarez y Francisco Latorre


package dominio;

import java.io.Serializable;


public class Rubro implements Serializable{
    private String nombreRubro;
    private String descripcion;

    public Rubro(String nombreRubro, String descripcion) {
        this.nombreRubro = nombreRubro;
        this.descripcion = descripcion;
    }

    
    public String getNombreRubro() {
        return nombreRubro;
    }


    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return nombreRubro;
    }
    
    
}
