package dominio;

import java.io.Serializable;
import java.util.ArrayList;

public class CostoRubro implements Serializable {

    private Rubro rubro;
    private int presupuesto;

    public CostoRubro(Rubro rubro, int presupuesto) {
        this.rubro = rubro;
        this.presupuesto = presupuesto;
    }

    public int getPresupuesto() {
        return this.presupuesto;
    }

    public Rubro getRubro() {
        return this.rubro;
    }
    @Override
    public String toString(){
        return String.format("<html><div style='text-align: center;'>&bull; <b>%s</b> $%d</div></html>", rubro, presupuesto);
    }
}
