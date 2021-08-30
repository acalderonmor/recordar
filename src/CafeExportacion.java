

public class CafeExportacion extends Cafe {

    private final static Integer CIF_BASE = 20;
    private Integer cif;
    private boolean verde;
    
public CafeExportacion(){
    this(PRECIO_BASE,PESO_BASE,CALIDAD_C,CIF_BASE,false);

}

public CafeExportacion(double precioBase, Integer peso){
    this(precioBase, peso, CALIDAD_C,CIF_BASE,false);
}
    

public CafeExportacion (double precioBase, Integer peso ,char calidadC, Integer cif, Boolean verde){
    super(precioBase,peso,calidadC);
    this.cif=cif;
    this.verde=verde;

}

public double calcularPrecio(){
    double adicion = super.calcularPrecio();
    if (cif >40){
        adicion+=precioBase*0.3;
    }
    if (verde){
        adicion+=50.0;
    }
    return adicion;
}

}
