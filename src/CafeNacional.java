public class CafeNacional extends Cafe {
    private final static boolean TOSTADO = false;
    private boolean tostado;


public CafeNacional (){
    this(PRECIO_BASE,PESO_BASE,CALIDAD_C,TOSTADO);
}
public CafeNacional(double precioBase, Integer peso){
    this(precioBase,peso,CALIDAD_C,TOSTADO);
}
public CafeNacional(double precioBase,Integer peso , char calidadC, boolean tostado){
    super (precioBase,peso,calidadC);
    this.tostado=tostado;
}



public double calcularPrecio(){
    double adcicion = super.calcularPrecio();
    if ( tostado==true ){
        adcicion+=50.0;
    }
    return adcicion;

}

public boolean getTostado(){
    return tostado;
}




}
